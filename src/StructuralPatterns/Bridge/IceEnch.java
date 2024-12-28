package StructuralPatterns.Bridge;

public class IceEnch implements Enchantment{

    @Override
    public void apply() {
        System.out.println("Жгучий мороз атакует");
    }

    @Override
    public void off() {
        System.out.println("Потеплело");
    }

    @Override
    public void on() {
        System.out.println("Морозит");
    }
}
