package Day1;

import java.util.Scanner;

public class checkedDAY {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a dya number :");
        int day=sc.nextInt();
        if(day == 7 || day >= 1 && day<=4) {
            System.out.println("work day");
        }
        else if (day==5||day==6){
            System.out.println("Off day");
        }
        else {
            System.out.println("Invalid");

        }

    }

}
