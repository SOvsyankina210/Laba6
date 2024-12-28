package StructuralPatterns.addapter;

public class LadaDepartment {
    public static void main(String[] args) {
        LadaFactory ladaFactory=new AdapterLadaFactory();

        ladaFactory.createLada();
        ladaFactory.updateLada();
        ladaFactory.selfLada();

    }
}
