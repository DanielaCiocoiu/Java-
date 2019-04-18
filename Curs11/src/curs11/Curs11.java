/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curs11;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;
import javax.swing.SwingUtilities;

/**
 *
 * @author rmaftei
 */
public class Curs11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Given the code below, and assuming that task has already been initialized, how will the task be run?
//java.util.Timer t=new java.util.Timer();
//t.schedule(task,5);
// one-time, 5 miliseconds after being scheduled
// periodically, every 5 seconds
// one-time, 5 seconds after being scheduled
// periodically, every 5 miliseconds
        //--------------------
        //While a thread is executing method m1() of an instance of the class below, what methods of the same object can another thread execute?
//        class Threads {
//
//            String lock = "";
//
//            public synchronized void m1() {
//                System.out.println("I am inside m1()! Stay away!");
//            }
//
//            public void m2() {
//                synchronized (lock) {
//                    System.out.println("I am taking over m2()!");
//                }
//            }
//        }
//	
//
//    public void m3() {
//        System.out.println("This is m3()!");
//    }
//
//    public static synchronized m4() {
//        System.out.println("So static...so young...!");
//    }
}
// m3() and m4()
// m2() and m3()
// m1() only
// m3() only
// m2(), m3() and m4()
// m4() only
//-------------------------
//Executor ex = new Executors(Executors.SINGLE_THREAD);
// 
//
//Executor ex = new ExecutorService();
// 
//
//Executor ex = Executors.newSingleThreadExecutor();
// 
//
//Executor ex = new Executor(new Runnable());
// 
//
//Executor ex = new SingleThreadExecutor();
//-----------------------
    
    //Which of the following examples executes method processData() in a different thread than the current thread? (choose three)
 

//Thread t = new Thread(){
//	public void run(){
//		processData();
//	}
//
//        private void processData() {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//    };
//t.run();
// 
//
//Runnable r = new Runnable(){
//	public void run(){
//		processData();
//	}
//
//        private void processData() {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//    };
//r.run();
// 

//SwingUtilities.invokeLater(new Runnable(){
//	public void run(){
//		processData();
//	}
//});
 

Runnable r = new Runnable(){
	public void run(){
		processData();
	}

        private void processData() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
r.start();
 

TimerTask task = new TimerTask(){
	public void run(){
		processData();
	}

        private void processData() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
(new java.util.Timer()).schedule(task,0);
 

Thread t = new Thread(){
	public void run(){
		processData();
	}

        private void processData() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
t.start();
    
    
//--------------------------------------------------  
//ActionListener task = new ActionListener(){
//            private int secunde;
//            public void actionPerformed(ActionEvent e){
//                System.out.println("Au trecut" + (++secunde) + "secunde");
//            }
//            
//            
//        };
//        
//       javax.swing.Timer timer  = new javax.swing.Timer(1000, task);
//       timer.start();
//        //------------------------------------
//        Thread f1 = new Thread(new Fir(), "Primul fir");
//        Thread f2 = new Thread(new Fir(), "Al doilea fir");
//        f1.start();
//        
//        f2.start();
        
    }
    
}
