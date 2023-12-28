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

    public Equipment[] equipmentList;

    public Equipment[] createEquipment(Flashlight f, CloseDoor c) {
        equipmentList = new Equipment[2]; // Assuming 2 slots for equipment (flashlight and door)
        equipmentList[0] = f;
        equipmentList[1] = c;
        return equipmentList;
    }

    public void equipmentList() {
        if (equipmentList != null) {
            for (Equipment equipment : equipmentList) {
                if (equipment == equipmentList[0]) {
                    System.out.println("Flashlight: Remaining Battery - " + ((Flashlight) equipment).battery());
                } else if (equipment == equipmentList[1]) {
                    System.out.println("Close Door: Remaining Uses - " + ((CloseDoor) equipment).use());
                }
            }
        } else {
            System.out.println("No equipment available.");
        }
    }

    public boolean useEquipment(String m, Monster monster) {
         int currentBattery = monster.getBatteryReduction();
         int currentDoor = monster.getDoorReduction();
         
        if ("Bonnie".equals(m)) {
//            int currentBattery = monster.getBatteryReduction();
//            if (currentBattery > 0) {
                 return currentBattery > 0; // Equipment used successfully
//            }
        } else if ("Foxy".equals(m)) {
//            int currentDoor = monster.getDoorReduction();
//            if (currentDoor > 0) {
                return currentDoor > 0; // Equipment used successfully
//            }
        } else if ("Chica".equals(m)) {
//            int currentDoor = monster.getDoorReduction();
//            int currentBattery = monster.getBatteryReduction();
//            if (currentDoor > 0 && currentBattery > 0) {
                return currentDoor > 0 && currentBattery > 0; // Equipment used successfully
//            }
        } else if ("Fazbear".equals(m)) {
//            int currentDoor = monster.getBatteryReduction();
//            int currentBattery = 0;
//            if (currentDoor > 0) {
//                return true; // Equipment used successfully
//            } else if (currentBattery > 0) {
//                currentBattery = monster.getBatteryReduction();
                return currentDoor > 0 || currentBattery > 0;
//            }
        }
        return false; // Equipment couldn't be used
    }
}
