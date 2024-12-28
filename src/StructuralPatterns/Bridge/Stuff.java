package StructuralPatterns.Bridge;

public class Stuff implements Weapon {
    final Enchantment enchantment;

    public Stuff(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void attack() {
        System.out.println("Беги");
        enchantment.apply();
    }

    @Override
    public void equip() {
        System.out.println("Порох в рукаве");
        enchantment.on();
    }

    @Override
    public void unequipped() {
        System.out.println("Пороха нет");
        enchantment.off();
    }
}
