package Day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;

public class FileRead {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print(" Enter file name: ");
                var fileName = sc.nextLine();
                var counts = new HashMap<Character, Integer>();

                try {
                    var fsc = new Scanner(new File(fileName));
                    while (fsc.hasNext()) {
                        for (var c : fsc.nextLine().toLowerCase().toCharArray()) {
                            if (Character.isLetter(c)) {
                                if (counts.containsKey(c)) {
                                    counts.put(c, counts.get(c) + 1);
                                } else {
                                    counts.put(c, 1);
                                }
                            }
                        }
                    }

                    for (var item : counts.entrySet()) {
                        System.out.println(item.getKey() + " => " + item.getValue());
                    }

                } catch (FileNotFoundException e) {
                    System.out.println("File not found");
                }


            }
        }



//        var file1 = new File("C:\\Users\\dev\\Desktop\\word.txt") ;
////        System.out.println(file1.length());
//        try {
//            var fsc = new Scanner(file1);
//            while (fsc.hasNext()) {
//                System.out.println(fsc.nextLine());}
//
//            fsc.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found");
//        }



