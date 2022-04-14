import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0;
        Set<String> list = new TreeSet<String>();
        for (int i = 0; i < N; i++) {
            String kata = scanner.next();
            char ch[] = kata.toCharArray();
            Arrays.sort(ch);
            String urut = new String(ch);
            list.add(urut);
        }
        System.out.println(list.size());
    }
}