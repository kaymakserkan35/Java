/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading.runable;

/**
 *
 * @author nyks.35
 */
public class MultiThreadingRunable {

   
    public static void main(String[] args) {
        
        MyThreadA myThreadA = new MyThreadA();
        MyThreadB myThreadB=new MyThreadB();
        myThreadA.run();
        myThreadB.run();
        
        System.out.println("----------main thread --------");
    }
    
}
