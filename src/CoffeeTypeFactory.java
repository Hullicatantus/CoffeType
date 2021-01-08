public class CoffeeTypeFactory {

    public CoffeeType create(int pressedButtonNumber) throws IllegalArgumentException {
        // TODO implement the factory here
        try {
            switch (pressedButtonNumber) {
                case 1:
                    return new Espresso();
                case 2:
                    return new Cappuccino();
                case 3:
                    return new Americano();
                default:
                    throw new IllegalArgumentException("Invalid button ");
            }
        } catch (IllegalArgumentException illegalArgumentException) {
            throw new IllegalArgumentException("Invalid button ", illegalArgumentException);
        }
    }
}