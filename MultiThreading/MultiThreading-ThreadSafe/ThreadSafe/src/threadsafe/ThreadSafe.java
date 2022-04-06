/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsafe;

import java.util.logging.Level;
import java.util.logging.Logger;


 public  class ThreadSafe {
    int Count=0;
 synchronized public void AddCount(){Count=Count+1;}  
    Thread threadA = new  Thread(new Runnable() {
        @Override
        public void run() {
             System.out.println("ThreadA çalıştı , Count :" + String.valueOf(Count));
            for (int i = 0; i < 10000; i++) {
                AddCount();
                System.out.println("A : "+ String.valueOf(Count));
            }
        }
    });
     Thread threadB = new  Thread(new Runnable() {
        @Override
        public void run() {
             System.out.println("ThreadB çalıştı , Count :" + String.valueOf(Count));
            for (int i = 0; i < 10000; i++) {
                AddCount();
                System.out.println("B : "+String.valueOf(Count));
            }
        }
    });
    
    public static void main(String[] args) {
        ThreadSafe threadSafe = new ThreadSafe();
        threadSafe.threadA.start();  threadSafe.threadB.start();
        try {
            
            threadSafe.threadA.join();
             threadSafe.threadB.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadSafe.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        System.out.println("Main thread çalıştı Count :" + String.valueOf(threadSafe.Count));
        
       
    }
    
}
