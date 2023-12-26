/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3last;

/**
 *
 * @author ikmal
 */
public class Equipment {

    Flashlight f;
    CloseDoor c;

    public Equipment[] createEquipment(Flashlight f, CloseDoor c) {
        this.f = f;
        this.c = c;
        Equipment[] equipmentItems = {f, c};
        return equipmentItems;
    }

    public void equipmentList() {
        System.out.println("Equipment list:\n");
        System.out.println(f.getname() + ": " + f.battery());
        System.out.println(c.getname() + ": " + c.use()); 
    }
}
