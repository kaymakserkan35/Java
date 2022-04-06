/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gsonseriliazer;

import com.google.gson.Gson;

/**
 *
 * @author nyks.35
 */
public class GsonSeriliazer {

   
    public static void main(String[] args) {
        Gson gson = new Gson();
        Data data = new Data(); data.Name="serkan";
        String dataJson = gson.toJson(data);
        System.out.println(dataJson); 
        Data dataconverted = gson.fromJson(dataJson, Data.class);
        System.out.println(dataconverted.Name);
                
                
    }
    
}
