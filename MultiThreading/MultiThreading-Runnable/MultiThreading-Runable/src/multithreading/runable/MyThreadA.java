/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading.runable;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nyks.35
 */
public class MyThreadA  implements  Runnable{
    
     @Override
    public void run() {
        System.out.println(this.getClass().getSimpleName() +"çalışıyor...");
        for (int i = 0; i < 10; i++) {
             try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThreadA.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(String.valueOf(i));
           
        }
        System.out.println(this.getClass().getSimpleName() +"bitti!...");
    }
    
}
