package com.example.lib;
import java.util.Scanner;
public class MyClass {
    public static void main(String[] args) {
        //    java�S�����c��
        Scanner scanner = new Scanner(System.in);
        Personalinsurance personalInsurances = new Personalinsurance();
        Groupinurance groupInsurance = new Groupinurance();
        System.out.println("�п�J2��3");
        String Judge = scanner.next();
        while (Judge.matches("2") || (Judge.matches("3"))) {
            switch (Judge) {
                case "2":
                    personalInsurances.inputdata(scanner.next(), scanner.next(), scanner.next());
                    System.out.println("�п�J2��3");
                    Judge = scanner.next();
                    break;
                case "3":
                    groupInsurance.inputdata(scanner.next(), scanner.next(), scanner.next());
                    System.out.println("�п�J2��3");
                    Judge = scanner.next();
                    break;
            }
        }
        personalInsurances.outputData();
        groupInsurance.outputData();
    }
}