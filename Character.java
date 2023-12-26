/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3last;

/**
 *
 * @author ikmal
 */
public class Character {
    private Equipment[] equipmentList;

    public Equipment[] createEquipment(Flashlight f, CloseDoor c) {
        equipmentList = new Equipment[2]; // Assuming 2 slots for equipment (flashlight and door)
        equipmentList[0] = f;
        equipmentList[1] = c;
        return equipmentList;
    }

    public void equipmentList() {
        if (equipmentList != null) {
            for (Equipment equipment : equipmentList) {
                if (equipment instanceof Flashlight) {
                    System.out.println("Flashlight: Remaining Battery - " + ((Flashlight) equipment).battery());
                } else if (equipment instanceof CloseDoor) {
                    System.out.println("Close Door: Remaining Uses - " + ((CloseDoor) equipment).use());
                }
            }
        } else {
            System.out.println("No equipment available.");
        }
    }

    public boolean useEquipment(String equipmentName, Monster monster) {
        for (Equipment equipment : equipmentList) {
            if (equipment instanceof Flashlight && equipmentName.equals("Flashlight")) {
                int batteryReduction = monster.getBatteryReduction();
                int currentBattery = ((Flashlight) equipment).battery();
                if (currentBattery >= batteryReduction) {
                    //((Flashlight) equipment).reduceBattery(batteryReduction); // Reduce battery
                    return true; // Equipment used successfully
                }
            } else if (equipment instanceof CloseDoor && equipmentName.equals("CloseDoor")) {
                int uses = ((CloseDoor) equipment).use();
                if (uses > 0) {
                    ((CloseDoor) equipment).use(); // Use door
                    return true; // Equipment used successfully
                }
            }
        }
        return false; // Equipment couldn't be used
    }

}
