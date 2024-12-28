package StructuralPatterns.Proxy;

public class ProxyLada implements Car{

    public String serialNumber;
    private Lada lada;

    public ProxyLada(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public void drive() {
        if(lada==null){
            lada=new Lada(serialNumber);
        }
        lada.drive();
    }
}
