package net.wow;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] are){
        String fullname;
        int menu;

        Scanner scanner = new Scanner(System.in);

        System.out.print("ป้อนชื่อ : ");
        fullname = scanner.next();
        System.out.println("--------------------");
        System.out.println("เมนูทักทาย");
        System.out.println("--------------------");
        System.out.println("1) Hello");
        System.out.println("2) Hi");
        System.out.println("3) Hey");
        System.out.println("--------------------");
        System.out.println("เลือกเมนู:");
        menu = scanner. nextInt();
        System.out.println("--------------------");

        switch ( menu ){
            case 1 :
                System.out.println("Hell, " + fullname);
                break;
            case 2 :
                System.out.println("Hi, " + fullname);
                break;
            case 3 :
                System.out.println("Hey, " + fullname);
                break;
            default:
                System.out.println("เลือกเมนูผิด....!");


        }
        System.out.println("-----------------------");





    }
}
