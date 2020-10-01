package com.company;
import java.util.Scanner;
public class Project07_ex2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Tuition this year = ?");
        double currentTuition = Double.parseDouble(scanner.nextLine());
        double tuitionInTenYears = currentTuition;

        for(int i = 0; i < 10; i++){

            tuitionInTenYears*=1.06;
        }

        System.out.printf("Tuition in 10 years: $%.2f",tuitionInTenYears);
        double costOfFourYearsAfterTenth = 0.0;
        for(int j = 0; j < 14; j++){

            currentTuition*=1.06;

            if(j>=10){

                costOfFourYearsAfterTenth+=currentTuition;

            }
        }

        System.out.printf("%nTotal cost of four years worth of tuition after the tenth year: $%.2f",costOfFourYearsAfterTenth);
    }
}
