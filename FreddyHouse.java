/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3last;

import java.util.Random;

/**
 *
 * @author ikmal
 */
public class FreddyHouse {
    Random rd = new Random();
    
    public Monster[] createMonsters(){
        Monster[] monsters = new Monster[4];
        monsters[0] = randomMonster();
        monsters[1] = randomMonster();
        monsters[2] = randomMonster();
        monsters[3] = randomMonster();
        return monsters;
    }
    
    public Monster randomMonster(){
        int randomNum = rd.nextInt(4);
        
        switch(randomNum){
            case 0:
                return new Fazbear();
            case 1:
                return new Bonnie();
            case 2:
                return new Chica();
            case 3:
                return new Foxy();
            default:
                return new Fazbear();
        }
    }
    
    public void printMonsterAndAbilities(){
        Monster[] monsters = createMonsters();
        for (Monster monster : monsters) {
            System.out.println("Monster: " + monster.toString());
            monster.useUniqueAbility();
            System.out.println("Battery Reduction: " + monster.getBatteryReduction());
            System.out.println("---------------------------");
        }
    }
}
