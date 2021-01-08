public class Main {

    public static void main(String[] args) {
        CoffeeTypeFactory factory = new CoffeeTypeFactory();
        CoffeeType coffeeType = factory.create(3268);
        System.out.println(factory.toString());
    }
}
