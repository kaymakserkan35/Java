/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nyks.35
 */
public class MyThreadB extends Thread {
    @Override
    public void run() {
        System.out.println("MyThreadB çalışmakta");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThreadB.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(String.valueOf(i));
        }
          System.out.println("MyThreadB çalışyı bitirdi");
    }
     

}