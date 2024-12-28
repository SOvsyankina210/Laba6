package StructuralPatterns.Bridge;

public class Sword implements Weapon{

    final Enchantment enchantment;

    public Sword(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void equip() {
        System.out.println("достаю меч");
        enchantment.on();
    }

    @Override
    public void unequipped() {
        System.out.println("убрал меч");
        enchantment.off();
    }

    @Override
    public void attack() {
        System.out.println("Минус один");
        enchantment.apply();
    }
}
