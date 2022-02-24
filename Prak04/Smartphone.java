public class Smartphone implements Computer, Portable {
    @Override
    public void compute(int x, int y) {
        System.out.println(String.format("Smartphone computing %d + %d = %d", x, y, x + y));
    }

    @Override
    public void printSpecification() {
        System.out.println("Smartphone spec is 8 gen 1");
    }

    @Override
    public void move() {
        System.out.println("Smartphone moved");
    }
}