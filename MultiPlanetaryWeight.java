package com.company;
import java.util.Scanner;
public class MultiPlanetaryWeight {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert your weight in kg:");
        double weight = Double.parseDouble(scanner.nextLine());

        System.out.println("Choose a planet out of these: Mercury, Venus, Mars, Jupiter, Saturn, Uranus, Neptune.");
        String planet = scanner.nextLine();
        boolean inputError = false;

        if(planet.equals("Mercury")){

            weight *= 0.38;
        }else if(planet.equals("Venus")){

            weight *= 0.91;
        }else if(planet.equals("Mars")){

            weight *= 0.38;
        }else if(planet.equals("Jupiter")){

            weight *= 2.36;
        }else if(planet.equals("Saturn")){

            weight *= 0.92;
        }else if(planet.equals("Uranus")){

            weight *= 0.89;
        }else if(planet.equals("Neptune")){

            weight *= 1.13;
        }else{

            inputError = true;
            System.out.println("Invalid planet input!");
        }

        if(!inputError){

            System.out.println("Your weight on "+planet+" is "+weight+" kg.");
        }
    }
}
