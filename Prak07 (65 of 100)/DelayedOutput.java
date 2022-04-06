/**
 * DelayedOutput.java 
 * Method menciptakan thread yang mengeluarkan output terminal
 * dan bisa dipanggil lagi sebelum thread sebelumnya menyelesaikan proses
 * @author 18220008 Zhillan Attarizal Rezyarifin
 */
public class DelayedOutput {
    public static void printDelayed(int delayMillisec, String output) {
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(delayMillisec);
                    System.out.println(output);
                }
                catch (InterruptedException e) {

                }
            }
        };
        thread1.start();
    }
  }