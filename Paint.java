package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Paint {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert height:");
        double height = Double.parseDouble(scanner.nextLine());
        System.out.println("Insert length:");
        double length = Double.parseDouble(scanner.nextLine());
        System.out.println("Insert width:");
        double width = Double.parseDouble(scanner.nextLine());

        double paintArea = length*width + 2*height*(length+width);
        System.out.println("Area: "+paintArea);

        int fiveLiterBucketsNeeded = (int)(Math.floor(paintArea/140));

        double areaLeftToPaint = paintArea-fiveLiterBucketsNeeded*140;

        int oneLiterBucketsNeeded = (int) Math.ceil(areaLeftToPaint/30);

        if(paintArea<140){

            System.out.println("You need "+oneLiterBucketsNeeded+" 1-liter buckets and that will cost you $"+oneLiterBucketsNeeded*4+".");
        }else{

            if(areaLeftToPaint==0){

                System.out.println("You need "+fiveLiterBucketsNeeded+" 5-liter buckets and that will cost you $"+fiveLiterBucketsNeeded*15+".");
            }else{

                System.out.println("You need "+fiveLiterBucketsNeeded+" 5-liter buckets and "+oneLiterBucketsNeeded+" 1-liter buckets" +
                        " and that will cost you $"+(fiveLiterBucketsNeeded*15+oneLiterBucketsNeeded*4)+".");
            }
        }
    }
}
