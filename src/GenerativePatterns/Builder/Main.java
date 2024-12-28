package GenerativePatterns.Builder;

public class Main {
    public static void main(String[] args) {
        Builder builder=new PizzaBuilder();
        Director director=new Director(builder);
        director.createDefaultPizza();
        System.out.println(builder.build());
    }
}
