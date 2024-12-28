package StructuralPatterns.Proxy;

public class Client {
    public static void main(String[] args) {
        Car car=new Lada("123");//ProxyLada
        car.drive();
    }
}

