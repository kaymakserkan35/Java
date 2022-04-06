/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package callback;

import java.sql.Date;

/**
 *
 * @author nyks.35
 */
public class CallBack {


    public static void main(String[] args) {
        ServiceManager serviceManager= new ServiceManager(new Service());
        serviceManager.getMethod();
    }
    
}
