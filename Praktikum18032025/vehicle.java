/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum18032025;

/**
 *
 * @author User
 */
public class vehicle {
    public double load;
    public double maxLoad;
    
    public vehicle(double maxLoad){
        this.maxLoad = maxLoad;
    
    }
    public double getLoad(){
       return load; 
    }
    public double getmaxLoad(){
        return maxLoad;
    }
    
}
