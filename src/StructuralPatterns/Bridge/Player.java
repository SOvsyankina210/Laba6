package StructuralPatterns.Bridge;

public class Player {
    public static void main(String[] args) {
        Weapon weapon=new Sword(new FireEnch());
        weapon.equip();
        weapon.attack();
        weapon.unequipped();

        Weapon weapon1=new Stuff(new IceEnch());
        weapon1.equip();
        weapon1.attack();
        weapon1.unequipped();
    }
}
