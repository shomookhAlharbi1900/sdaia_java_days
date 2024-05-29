package Day2;

import java.util.Scanner;
public class callmethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Mark AND full mark :");
        double m = sc.nextDouble();
        double f = sc.nextDouble();
        double pst1 =myMethod.calPer(m,f);
        String status = myMethod.getStatus(pst1);
        System.out.print(" Persentage " + pst1 + " result : " +  status);



    }
}
