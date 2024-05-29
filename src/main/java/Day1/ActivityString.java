package Day1;

import java.util.Scanner;

public class ActivityString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter phone number :");
        String phone=sc.nextLine();
        if (phone.length() !=10) {
            System.out.println(" Phone number must be 10 digits ");
        } else if (phone.startsWith("05")) {
            int digit = 0;
            for ( int i = 0 ; i <phone.length() ; i++){
                char c = phone.charAt(i);
                if ( Character.isDigit(c)) {
                   digit++;
                    if (digit ==10) {
                        System.out.println(" correct phone");
                    }
               }
                else {
                    System.out.println(" Must Enter digit");
                    break;
                }
            }





        }
        else {
            System.out.println(" must start 05");

        }
//        else {
//            int digit = 0;
//            for ( int i = 0 ; i <phone.length() ; i++) {
//                char c = phone.charAt(i);
//                if ( Character.isDigit(c)) {
//                    digit++;
//
//                } else if () {
//
//                }
//                {
//
//                }
//
//            }
//        }


    }
}