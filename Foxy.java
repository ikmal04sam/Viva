/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3last;

/**
 *
 * @author ikmal
 */
public class Foxy extends Monster {

    int doorReduction = 6;

    @Override
    public void useUniqueAbility() {
        System.out.println(toString() + " can be blocked by close door only.");
    }

    @Override
    public int getDoorReduction() {
        CloseDoor.use -= doorReduction;
        return CloseDoor.use;
    }

    public String toString() {
        return "Foxy";
    }
}
