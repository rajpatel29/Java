package ArrayDequeue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Billboards {

    static int n;
    static int k;
    static long a[];
    static long f[];

    static long g(int i) {
        return f[i - 1] + a[i];
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter Input");
        n = cin.nextInt();
        k = cin.nextInt();
        a = new long[n + 1];
        f = new long[n + 1];

        long sum = 0;
        for (int i = 1; i <= n; i++) {
            a[i] = cin.nextLong();
            sum += a[i];
        }

        Deque<Integer> queue = new ArrayDeque<>();
        
        for (int i = 1; i <= k; i++)
        {
            while (!queue.isEmpty() && g(i) <= g(queue.peekLast()))
            {
            	int x = queue.pollLast();
                System.out.println( "Pool last " + x);
                System.out.println("In while loop");
            }
            System.out.println("" + i + "is inserted");
            queue.addLast(i);
            
//            System.out.println("Enter something");
//            cin.nextLine();
        }
//        System.out.println("Out of First loop");
        
        
        for (int i = k + 1; i <= n; i++)
        {
            while (!queue.isEmpty() && g(i) <= g(queue.peekLast()))
                queue.pollLast();
            queue.addLast(i);
            f[i] = g(queue.peekFirst());
            if (queue.peekFirst() == i - k) queue.pollFirst();
        }

        System.out.println(sum - f[n]);

        cin.close();
    }
}

