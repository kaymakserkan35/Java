/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listener;
import java.util.Random;

public class RandomGenerator {

    private final OnNumberGeneratedListener listener;

    RandomGenerator(OnNumberGeneratedListener _Listener) {
        this.listener = _Listener;
    }
    
    public int getRandomNumber() throws Exception {
        int number = new Random().nextInt(10);
        //listenerı notify (bilgilendirme ) edelim
        if (listener!=null) {  listener.onNumberGenerated(number);  }
        else { throw new Exception();}
        return number;
        
    }
}
