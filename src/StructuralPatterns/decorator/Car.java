package StructuralPatterns.decorator;

public interface Car {
    default String drive(){
        return "edet";
    }
}
