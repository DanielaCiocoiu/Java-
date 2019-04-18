/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curs9;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author rmaftei
 */
public class Curs9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //What is true about the following code sequence?

//int n = IntStream.generate(() -> (int) (Math.random() * 10)).count();


//Which of the following will create a stream containing int values 10, 20 and 30? (choose TWO)
// Stream.iterate(10, i->i+10).limit(3).mapToInt(Integer::intValue);
// IntStream.range(1,3).map(i->i*10);
// Arrays.stream(new int[]{10,20,30});
// Stream.of("1","2","3").map(String::intValue());


//Attach all the catch blocks to the try block in the correct order so that the code compiles 
//successfully: (choose THREE)

//try{
	/* code that can throw the following exceptions:
		- RuntimeException
		- Exception
		- IllegalArgumentException
		- IOException
	*/
//}
//
// catch(Exception e)
// catch(IOException e)
// catch(IllegalArgumentException e)
// catch(RuntimeException e)

//Given a collection of people, which of the following determines how many of 
//them are male? Assume ppl is of type List<Person> and the Person class has a isMale() method that returns boolean.
// ppl.stream().filter(p->p.isMale()).sum();
// ppl.stream().filter(p->p.isMale()).count();//asta
// ppl.stream().map(Person::isMale).count();
// ppl.parallelStream().map(p->p.isMale()).count();
// ppl.stream().filter(p->Person::isMale()).count();
// ppl.stream().map(p->p.isMale()).sum();


//What will the following program display when executed, if the System.in.read() method throws an exception?


//		try{
//			System.out.println("a");
//			System.in.read();
//			System.out.println("b");
//		}catch(Exception e){
//			System.out.println("c");
//			return;
//		}finally{
//			System.out.println("d");
//		}
//		System.out.println("e");

//acd

//What will the following program display when executed?


//		try{
//			System.out.print("a");
//			f();
//			return;
//		}catch(RuntimeException e){
//			System.out.print("c");
//		}finally{
//			System.out.print("d");
//		}
//		System.out.print("e");
//	}
//	private static void f() throws Exception { return; }
//        
//        
//       try{
//			System.out.print("a");
//			f();
//			System.out.print("c");
//		}catch(Exception e){
//			System.out.print(e.getMessage());
//			System.out.print("d");
//		}
//		System.out.print("e");
//	}
//	private static void f() {
//		throw new RuntimeException("b");
//	}
//-----------------------------------------------------
//try{
//			System.out.print("a");
//			f();
//			return;
//		}catch(Exception e){
//			System.out.print("c");
//		}finally{
//			System.out.print("d");
//		}
//		System.out.print("e");
//	}
//	private static void f() throws Exception { return; }
}

}

    
