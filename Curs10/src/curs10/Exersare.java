package curs10;

import java.io.DataInputStream;
import java.io.File;
import static java.io.File.listRoots;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.lang.Iterable;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;


public class Exersare {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        
        
        
        
        
        
        
        
        
        //EXEMPLE exersare curs
        //salvare obiect Persoana
//        Persoana r = new Persoana("Maria");
//        
//        File h = new File("c:\\temp\\save.ppl");
//        
//        h.createNewFile();
//        
////FileOutputStream  pt a salva un obiect pe HDD, pe care il pasaez ca parametru in constructorul ObjectOutputStream
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(h));
//        
//        oos.writeObject(r);//r este obiectul dorit care implementeaza serializarea
//        System.out.println("S-a salvat obiectul");
//        System.out.println(h.exists());
//        
//        oos.close();
//        
// //incarcare obiect Persoana si afisare caracteristici pentru confirmarea succesului operatiei
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(h));
//        Persoana ppp = (Persoana)ois.readObject();
//        System.out.println("S-a incarcat obiectul");
//        ois.close();
//        System.out.println("Nume persoana incarcata: "+ppp.getNume());
//        System.out.println("Hobby-uri: ");
//        ppp.getHobbies().stream().forEach(System.out::println);
//        
//        System.out.println("************************ Exersare curs 10");
//
//        System.out.println("File.separator = " + File.separator);
//        System.out.println("File.separatorChar = " + File.separatorChar);
//        System.out.println("File.pathSeparator = " + File.pathSeparator);
//        System.out.println("File.pathSeparatorChar = " + File.pathSeparatorChar);
//
//        System.out.println(" *****initialize File object *******");
//
//        // File file = new File("C:\\Windows\\Temp\\test");
//        File f = new File("C:\\Users\\rmaftei\\Downloads\\InfoAcademy\\Java-\\Curs10\\test");
//
//        System.out.println(f.getName() + " ******* numele fisierului");
//        System.out.println(f.getAbsolutePath() + " ******* calea absoluta");
//        System.out.println(f.getParent());
//
//        boolean result;
//        System.out.println("check if file exists");
//        result = f.exists();
//        if (result) {
//            // print message that file exists
//            System.out.println(f.getAbsolutePath() + " exists");
//        } else {
//            //print message that the file does not exist
//            System.out.println(f.getAbsolutePath() + " does not exists");
//        }
//
//        //----------------------------------------------------------
//        System.out.println("*******variante cu interfata Path si clasa Paths*******");
//
//        Path p = Paths.get("C:\\Users\\rmaftei\\Downloads\\InfoAcademy\\Java-\\Curs10\\test");
//        System.out.println(p);
//        System.out.println("accesarea independenta a elementelor si iterarea prin ele");
//        for (Path x : p) {
//            System.out.println(x + "\t");
//        }
//        System.out.println(" ******* extragere de componente ale caii");
//        System.out.println(p.getFileName().toString().toLowerCase().endsWith(".txt"));
//        System.out.println(p.getName(0));
//        System.out.println(p.getNameCount());
//        System.out.println(p.subpath(1, 3));
//        System.out.println(p.getRoot());
//        System.out.println(p.getParent());
//        System.out.println("*******conversie cale*******");
//        System.out.println(" *******uri ce incapsuleaza calea din obiectul path *******");
//        System.out.println(p.toUri());
//        System.out.println(p.toString());
//        System.out.println(p.toAbsolutePath());
//        System.out.println(p.toFile());
//        System.out.println(p.resolveSibling("test.txt"));
//        System.out.println();
//        System.out.println(" *******determinarea directorului curent");
//        System.out.println(new File("").getAbsolutePath());//io.file
//        System.out.println(Paths.get("").toAbsolutePath());//nio.file
//
//        System.out.println(" ******* operatii de baza cu sistemul de fisiere - java.io.File");
//        //cu o singura exceptie sunt metode de instanta
//
//        System.out.println(f.exists());
//
//        // check if the specified pathname is directory first
//        if (f.isDirectory()) {
//            //list all files on directory
//            File[] files = f.listFiles(new FilenameFilter() {
//
//                //apply a filter
//                @Override
//                public boolean accept(File dir, String name) {
//                    boolean result;
//                    if (name.startsWith("test")) {
//                        result = true;
//                    } else {
//                        result = false;
//                    }
//                    return result;
//                }
//            });
//            //print all files on the directory
//            for (File b : files) {
//                try {
//                    System.out.println(f.getCanonicalPath());
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//        System.out.println(f.isDirectory() + " ******* intoarce true daca fisierul este de acest tip");
//        System.out.println(f.canRead() + " *********** true daca masina virtuala are aceasta permisiune");
//        System.out.println(f.canWrite());
//        System.out.println(f.canExecute());
//
//        File dir = new File("c:\\temp\\teste\\d1\\d2");//presupunem ca nu exista directorul teste
//        System.out.println(dir.mkdir());// creare de director
//        System.out.println(dir.mkdirs());
//        File f1 = new File(dir.getAbsolutePath() + File.separator + "f1.txt");
//
//        f1.createNewFile();
//        System.out.println(f1.exists() + " *******fisierul creat exista?");
//        System.out.println(f1.length()); //0 daca este gol
//        File f2 = new File(f1.getParent() + File.separator + "f2.text");//redenumire fisier
//        System.out.println(f1.renameTo(f2));
//        File d2 = new File(f2.getParent());//stergerea dir d2
//        d2.delete();
//        f2.delete();
//        d2.delete();
//        System.out.println(d2.exists());
//
//        System.out.println(" ******* operatii de baza cu sistemul de fisiere - java.nio.File");
//        //metode statice
//        Path p1 = Paths.get("c:\\temp\\teste\\d1\\d2");
//        System.out.println(Files.createDirectory(p1));
//        System.out.println(Files.createDirectories(p1));
//        Path fis = p1.resolve("f1.txt"); //compunere de cai
//        System.out.println(Files.createFile(fis));
//        System.out.println(Files.size(fis));
//
//        System.out.println("*********listarea fisierelor pt io file");
//
//        File f3 = new File("c:\\temp\\teste");
//        System.out.println(f3.exists() + " **** exist");
//
//        File[] fisiereMici = f3.listFiles(s -> s.length() < 1000);
//        for (File s : fisiereMici) {
//            System.out.println(s.getAbsolutePath() + " fisiere mici");
//        }
//
//        File[] fisiereText = dir.listFiles(a -> a.getParent().toLowerCase().endsWith("text"));
//        System.out.println(dir.exists() + " **** exist");
//        for (File a : fisiereText) {
//            System.out.println(a.getAbsolutePath() + " fisiereText");
//        }
//
//        System.out.println("*********listarea fisierelor pt nio file");
//
//        Path director = Paths.get("c:\\Users\\rmaftei\\Desktop\\freza");
//        DirectoryStream<Path> d = Files.newDirectoryStream(director, "*.jpg");
//        System.out.println("*********listarea cu filtru");
//
//        Path listareCuFiltru = Paths.get("c:\\Users\\rmaftei\\Desktop\\freza");
//        //definim un filtru explicit
//        //fisiere cu dim mai mari de 100 de octeti
//        DirectoryStream<Path> d3 = Files.newDirectoryStream(listareCuFiltru, b -> Files.size(b) < 100);
//        for (Path n : d3) {
//            System.out.println(n);
//        }
//
//        System.out.println("*********Metoda Files.list(Path)");
//
//        Path director1 = Paths.get("c:\\Users\\rmaftei\\Desktop");
//
//        Files.list(director1).forEach(System.out::println);//listarea integrala a fisierelor de pe desktop
////listarea fis jpg
//        Files.list(director1).filter(k -> k.getFileName().toString().endsWith(".jpg")).forEach(System.out::println);
//
//        System.out.println("*********Accesarea continutului fisierelor)");
//        System.out.println("*********Clasa Java.io.RandomAccessFile) - pt citirea din/scrierea in orice pozitie din fisier");
//        
//RandomAccessFile g = new RandomAccessFile(new File("c:\\Users\\rmaftei\\Desktop\\freza\\cc.txt"), "r");
//        
//        System.out.println(g.read());
//        System.out.println(g.readChar());
//        System.out.println(g.readBoolean());
//       
//       System.out.println("*********API-ul claselor stream. Inlantuirea stream-urilor)"); 
//        
//        File i = new File("C:\\Users\\rmaftei\\Downloads\\InfoAcademy\\Java-\\Curs10\\fisier.bin");//definire Obiect de Tip File
//        FileInputStream citireSeriala = new FileInputStream (i);
//        DataInputStream citimDirectPrimitive = new DataInputStream(citireSeriala);
//        char c = citimDirectPrimitive.readChar();//citim primitive din fisier
//        byte b = citimDirectPrimitive.readByte();
//        double l = citimDirectPrimitive.readDouble();
        //-------------------------------------------------------------
        //Given the following code sequence:
//
//File d = new File("c:\\temp\\d1");
//d.mkdir();
//File f1 = new File(d.getAbsolutePath()+File.separator+"f1.txt");
//f1.createNewFile();
//File f2 = new File(f1.getParent()+File.separator+"f2.txt");
//f2.createNewFile();
//
////which of the following is its equivalent that uses java.nio classes?
// 
//
//Path a = Paths.get("c:\\temp\\d1");
//Files.createDirectory(a);
//Path a1 = a.resolve("f1.txt");
//Files.createFile(a1);
//Files.createFile(a1.resolveSibling("f2.txt"));
// 
//
//Path b = new Path("c:\\temp\\d1");
//Files.createDirectory(a);
//Path a1 = Files.resolve(a,"f1.txt");
//Files.createFile(a1);
//Files.createFile(a1.resolve("f2.txt"));
// 
//
//Path c = Paths.get("c:\\temp\\d1");
//Files.createDirectory(c);
//Files.createFile(c.resolve("f1.txt"));
//Files.createFile(c.resolveSibling("f2.txt"));
// 
//
//Path e = Paths.get("c:\\temp\\d1");
//e.createDirectory();
//Path a1 = e.resolve("f1.txt");
//a1.createFile();
//Path f2 = a1.resolveSibling("f2.txt");
//f2.createFile();
        
   //Given the following object:

//File dir = new File("C:\temp");
//
////which of the following will produce the list of PDF files in that folder?
// dir.list(f->f.endsWith("*.pdf"));
// dir.newDirectoryStream(".pdf");
// dir.list("*.pdf");
// dir.listFiles("*.pdf");
// dir.listFiles(f->f.getName().endsWith(".pdf"));     
//        
        
   //A programmer needs to create the file c:\temp\d1\d2\f1.txt. The d1 folder does not exist. Which of the following creates the d1 and d2 folders and the f1.txt file?
 

//new File("C:\\temp\\d1\\d2").mkdirs();
//new File("C:\\temp\\d1\\d2\\f1.txt").createNewFile();
// 
//
//File d2 = new File("C:\\temp\\d1\\d2");
//d2.mkdir();
//new File(d2.getAbsolutePath()+File.separator+"f1.txt").createNewFile();
// 
//
//new File("C:\\temp\\d1\\d2").mkdir();
//new File("C:\\temp\\d1").mkdir();
//new File("C:\\temp\\d1\\d2\\f1.txt").createNewFile();
// 
//
//new File("C:\\temp\\d1\\d2\\f1.txt").mkdirs();     
        
        ///Given the following object:
//-----------------------------------------------
//Path p = Paths.get("c:\\temp\\d1\\f1.txt");
//
////all of the following create a Path object that refers to c:\temp\d2\f2.txt, EXCEPT:
// p.getRoot().resolve(p.subpath(0,1)).resolve("d2\\f2.txt");
// p.subpath(0,2).resolveSibling("d2\\f2.txt");
// p.getParent().resolveSibling("d2\\f2.txt");
// p.getParent().getParent().resolve("d2\\f2.txt");
//--------------------------------------------------
//Files.newDirectoryStream(dir, f->Files.size(f)<100);
//
// dir.newDirectoryStream(f.size()<100);
// Files.list(dir, f->f.getSize()<100);
// dir.list().filter(f->f.size()<100).collect(Collectors.toList());
//        


//Which of the following are valid ways of producing a Path object that points to c:\temp\f1.txt? (choose TWO)
 Files.newPath("c:\temp\f1.txt");
 new Path("c:\\temp\\f1.txt");
 new File("c:\\temp\\f1.txt").toPath();
 Paths.get("c:\\temp\\f1.txt");

//---------------------
Given the object created below:

Path p = new Path("c:\\d1\\f1.txt");

which of the following will create a Path object that points to c:\d1\f2.txt? (choose TWO)
 Path p2 = p.resolveSibling("f2.txt");
 Path p2 = p.resolve("f2.txt");
 Path p2 = p.getParent().resolve("f2.txt");
 Path p2 = p.resolve("..\\..\\f2.txt");


      //---------------
     // Given the following:

RandomAccessFile f = new RandomAccessFile("c:\temp\f1.txt","rw");
f.readShort();
f.read();
f.read();
f.writeDouble(20.0);
f.skipBytes(10);
f.readLong();

//and assuming that file f1.txt contains at least 100 bytes, what will be returned by f. getFilePointer() after executing the code above?
// 30
// 36
// 20
// 16
    }

}
