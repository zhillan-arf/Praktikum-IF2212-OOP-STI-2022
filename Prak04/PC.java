public class PC implements Computer, Monitor, Keyboard {
    @Override
    public void compute(int x, int y) {
        System.out.println(String.format("PC computing %d + %d = %d", x, y, x + y));
    }

    @Override
    public void printSpecification() {
        System.out.println("PC spec is i9");
    }

    @Override
    public void turnOnMonitor() {
        System.out.println("PC monitor turned on");
    }

    @Override
    public void turnOffMonitor() {
        System.out.println("PC monitor turned off");
    }

    @Override
    public void printResolution() {
        System.out.println("PC resolution is 2560x1440");
    }

    @Override
    public void useKeyboard() {
        System.out.println("PC keyboard klatak-klatak");
    }

    @Override
    public void printIsRGB() {
        System.out.println("PC is not RGB");
    }
}