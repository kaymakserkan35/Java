/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listener;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Program {

    public static void main(String[] args) {
        RandomGenerator randomGenerator = new RandomGenerator(new OnNumberGeneratedListener() {
            // bu blokta listener notify olduğu anda ne yapılmak isteniyor ise....
            @Override
            public void onNumberGenerated(int number) {
                
                System.out.println(number);
            }
        });
        for (int i = 0; i < 10; i++) {
            try {
                randomGenerator.getRandomNumber();
            } catch (Exception ex) {
                Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
    }
    
}
