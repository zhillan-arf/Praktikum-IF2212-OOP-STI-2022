// 18220008 Zhillan Attarizal Rezyarifin
// Prak 8 Soal 1 Deque

import java.util.*;

public class Main {
    public static void main(String[] args) {
		// Scanner
		Scanner scan = new Scanner(System.in);
		// Inisialisasi
        Deque<Integer> q = new ArrayDeque<Integer>();
        int Q = scan.nextInt();
        boolean reversed = false;
        // loop
        for (int i = 0 ; i < Q ; i ++ ) {
            String inputStr = scan.next();
            int x;
            switch (inputStr) {
                case "addFirst":
                    x = scan.nextInt();
                    if (reversed) {
                        q.addLast(x);
                    } else {
                        q.addFirst(x);
                    }
                    break;
                case "addLast":
                    x = scan.nextInt();
                    if(reversed) {
                        q.addFirst(x);
                    } else {
                        q.addLast(x);
                    }
                    break;
                case "pollFirst":
                    if(q.size() == 0) {
                    System.out.println("EMPTY");
                    } else {
                        if(reversed) {
                            System.out.println(q.pollLast());
                        } else {
                            System.out.println(q.pollFirst());
                        }
                    }
                    break;
                case "pollLast":
                    if(q.size() == 0) {
                        System.out.println("EMPTY");
                    } else {
                        if(reversed) {
                            System.out.println(q.pollFirst());
                        } else {
                            System.out.println(q.pollLast());
                        }
                    }
                    break;
                default:
                    reversed = !reversed;
            }
        }
    }
}
