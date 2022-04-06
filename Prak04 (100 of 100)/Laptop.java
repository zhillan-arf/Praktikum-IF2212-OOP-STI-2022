public class Laptop implements Computer, Keyboard, Portable {
    @Override
    public void compute(int x, int y) {
        System.out.println(String.format("Laptop computing %d + %d = %d", x, y, x + y));
    }

    @Override
    public void printSpecification() {
        System.out.println("Laptop spec is i7");
    }

    @Override
    public void useKeyboard() {
        System.out.println("Laptop keyboard klatak-klatak");
    }

    @Override
    public void printIsRGB() {
        System.out.println("Laptop is RGB");
    }

    @Override
    public void move() {
        System.out.println("Laptop moved");
    }
}