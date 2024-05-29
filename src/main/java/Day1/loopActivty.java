package Day1;

import java.util.Scanner;

public class loopActivty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = (int) (Math.random() * 10);
        int y = (int) (Math.random() * 10);
        System.out.printf("what is %d * %d ?", x, y);
        int answer = sc.nextInt();
        while ( answer != x * y) {
            System.out.println(" again");
            System.out.printf("what is %d * %d ?", x, y);
             answer = sc.nextInt();

        }
        System.out.println("correct");


    }
}
