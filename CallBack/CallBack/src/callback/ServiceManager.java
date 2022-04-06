/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package callback;

/**
 *
 * @author nyks.35
 */
public class ServiceManager {
    Service service;
    public ServiceManager(Service service){
    this.service=service;}
    
    public void getMethod(){
    
        service.getMethod(new ICallBack() {
            @Override
            public void onSuccess(String message) {
                System.out.println("message");
            }
        });
    }
}
