/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3last;

import java.util.Arrays;

/**
 *
 * @author ikmal
 */
public class NightsOfFreddy {

    public static void main(String[] args) {
        // Create instances of equipment
        Flashlight flashlight = new Flashlight(); // Battery life set to 10 units
        CloseDoor closeDoor = new CloseDoor(); // 5 uses of the door

        // Create instances of characters
        Character character = new Character();
        Equipment[] eqList = character.createEquipment(flashlight, closeDoor);

        character.equipmentList(); // Display character's equipment initially

        // Create instance of FreddyHouse to manage monsters
        FreddyHouse freddyHouse = new FreddyHouse();
        // Simulate encounters between character and monsters
        Monster[] monsters = freddyHouse.createMonsters(15);
        freddyHouse.printMonsterAndAbilities();

        System.out.println("Encounters Begin!!!\n");
        for (Monster monster : monsters) {
            System.out.println("Character encounters: " + monster.toString());
            boolean equipmentUsed = character.useEquipment(monster.toString(), monster);
            if (equipmentUsed) {
                System.out.println("Character used equipment successfully!");
            } else {
                System.out.println("Character couldn't use equipment.");
            }
            character.equipmentList(); // Display updated equipment status
            System.out.println("---------------------------");
        }
        if (eqList[0].battery() > 0 && eqList[1].use() > 0) {
            System.out.println("\nCongrats !! You survive the night!!");
        }else{
            System.out.println("\nYOU DIE!!!");
        }
        
    }

}
