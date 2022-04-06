
package multithreading.runable;

import java.util.logging.Level;
import java.util.logging.Logger;


public class MyThreadB implements Runnable {

    @Override
    public void run() {
        System.out.println(this.getClass().getSimpleName() +"çalışıyor...");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThreadB.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(String.valueOf(i));
        }
        System.out.println(this.getClass().getSimpleName() +"bitti!...");
    }
    
}
