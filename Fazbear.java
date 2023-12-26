/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3last;

/**
 *
 * @author ikmal
 */
public class Fazbear extends Monster{
    int batteryReducetion = 8;
    
    @Override
    public void useUniqueAbility(){
        System.out.println(toString() + "can be blocked by flashlight or close door.");   
    }
    
    @Override
    public int getBatteryReduction(){
        Flashlight.batterylife -= batteryReducetion;
        return Flashlight.batterylife; 
    }
    
    public String toString(){
        return "Fazbear";
    }
}
