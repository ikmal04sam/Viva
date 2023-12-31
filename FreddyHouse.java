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

    public Monster[] createMonsters(int n) {
        Monster[] monsters = new Monster[n];
        for (int i = 0; i < monsters.length; i++) {
            monsters[i] = randomMonster();

        }
        return monsters;
    }

    public Monster randomMonster() {
        int randomNum = rd.nextInt(4);

        switch (randomNum) {
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

    public void printMonsterAndAbilities() {
        Chica c = new Chica();
        Fazbear f = new Fazbear();
        Bonnie b = new Bonnie();
        Foxy fox = new Foxy();
        c.useUniqueAbility();
        System.out.println("---------------------------");
        f.useUniqueAbility();
        System.out.println("---------------------------");
        b.useUniqueAbility();
        System.out.println("---------------------------");
        fox.useUniqueAbility();
        System.out.println("---------------------------");

    }
}
