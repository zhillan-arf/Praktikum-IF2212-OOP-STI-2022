public class GameConsole implements Computer, Monitor {
    @Override
    public void compute(int x, int y) {
        System.out.println(String.format("GameConsole computing %d + %d = %d", x, y, x + y));
    }

    @Override
    public void printSpecification() {
        System.out.println("GameConsole spec is r9");
    }

    @Override
    public void turnOnMonitor() {
        System.out.println("GameConsole monitor turned on");
    }

    @Override
    public void turnOffMonitor() {
        System.out.println("GameConsole monitor turned off");
    }

    @Override
    public void printResolution() {
        System.out.println("GameConsole resolution is 7680x4320");
    }
}