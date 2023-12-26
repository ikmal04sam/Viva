/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3last;

/**
 *
 * @author ikmal
 */
public class Flashlight extends Equipment{
    
    private String name = "FlashFlight";
    public static int batterylife = 100;
    
    public String getname(){
        return name;
    }
    
    public int battery(){
        return batterylife;
    }
}
