package Day1;


import java.util.Scanner;

public class checkedDay2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = (int) (Math.random() * 10);
        int y = (int) (Math.random() * 10);
//        System.out.println(" what is " + x + "*" + y + "?");
        System.out.printf("what is %d * %d ",x , y);
          int answer = sc.nextInt();
          if (answer ==x*y){
              System.out.println("correct ");
          }
          else {
              System.out.println("Wrong ");
          }





    }
}
