/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3last;

/**
 *
 * @author ikmal
 */
public class Chica extends Monster {

    int batteryReducetion = 5;
    int doorReduction = 1;

    @Override
    public void useUniqueAbility() {
        System.out.println("\n" + toString() + " can be blocked by flashlight and close door.");
    }

    @Override
    public int getBatteryReduction() {
//        Flashlight.batterylife -= batteryReducetion;
        return batteryReducetion;
    }

    @Override
    public int getDoorReduction() {
//        CloseDoor.use -= doorReduction;
        return doorReduction;
    }

    public String toString() {
        return "Chica";
    }
}
