package th.ac.sau;

import java. util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        //ประกาศตัวแปร
        String fullName;
        int age;
        double gpa;

        //สร้างตัวแทนของ Scanner เพื่อใช้ในการรับ
        Scanner wow = new Scanner(System.in);

        showSenPa();
        System.out.print("ป้อนชื่อ-สกุล : ");
        fullName = wow.next();
        System.out.println("ป้อนอายุ : ");
        age = wow.nextInt();
        System.out.println("ป้อน GPA : ");
        gpa = wow.nextDouble();
        showSenPa();
    }

    public static void showSenPa() {
        System.out.println("-------------------------------------");
    }

}