package GenerativePatterns.Builder;

public class Director {
    Builder builder;
    Director(Builder builder){
        this.builder=builder;
    }

    public void createDefaultPizza(){
    builder.setName("just pizza");
    builder.setPrice(450);
    builder.setSize(6);
    builder.setCheese(false);
    }
}
