package StructuralPatterns.Bridge;

public class FireEnch implements Enchantment{

    @Override
    public void apply() {
        System.out.println("Горячая штучка атакуют");
    }

    @Override
    public void off() {
        System.out.println("Горячая штучка остыла");
    }

    @Override
    public void on() {
        System.out.println("Горячая штука активирована");
    }
}
