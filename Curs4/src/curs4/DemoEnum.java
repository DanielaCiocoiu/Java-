
package curs4;

public class DemoEnum {
    
    enum CertificareJava{
    ASSOCIATE,
    PROGRAMMER,
    DEVELOPER,
    ARHITECT;
    
}
  public static void runEnum(){
       System.out.println("RunEnum*********** " );
        CertificareJava c = CertificareJava.DEVELOPER;
        CertificareJava c1 = CertificareJava.valueOf("DEVELOPER");
        System.out.println(c.name());
        System.out.println(c.ordinal());
        System.out.println(c.compareTo(CertificareJava.ASSOCIATE));
        System.out.println(c.equals(CertificareJava.DEVELOPER));
        System.out.println(c == CertificareJava.DEVELOPER);
        for (CertificareJava cert : CertificareJava.values()) {
            System.out.println(cert.toString());
        }

        Anotimp.activitate(Anotimp.VARA);
        Anotimp.values();
        //Anotimp.valueOf(VARA);
      System.out.println("*********** finish RunEnum ");
  }  
}
