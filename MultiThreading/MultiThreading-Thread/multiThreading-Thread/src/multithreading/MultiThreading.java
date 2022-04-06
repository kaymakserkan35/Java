/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MultiThreading {

    public static void main(String[] args) {
       MyThreadA myThreadA = new  MyThreadA();
       MyThreadB myThreadB = new  MyThreadB();
       myThreadA.start();
       myThreadB.start();
       
        System.out.println("Main thread çalışıyor...");
    }
    
}
