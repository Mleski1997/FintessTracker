package pl.FitnessTracker.FitnessTracker;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Options options = new Options();
        Scanner scan = new Scanner(System.in);
        int choice = -1;

        options.MenuData();
        choice = scan.nextInt();

        while (choice !=5) {
            switch (choice) {
                case 1:
                    int x = 0;
                    options.CardioOrStrenght();
                    x = scan.nextInt();

                    switch (x) {

                        case 1:
                            Scanner scanner1 = new Scanner(System.in);
                            System.out.println("Cwiczenie silowe");
                            String exerciseStrenght = scanner1.next();
                            System.out.println("Wpisz ktora seria");
                            int series = scanner1.nextInt();
                            System.out.println("Wpisz cięzar");
                            double load = scanner1.nextDouble();
                            System.out.println("Wpisz powtrzenia");
                            int repeat = scanner1.nextInt();
                            System.out.println("Wpisz skale RIR");
                            int rir = scanner1.nextInt();
                            exerciseStrenghtClass exerciseStrenghtClass = new exerciseStrenghtClass(exerciseStrenght, series, load, repeat, rir);
//                            options.MenuData();
                            break;


                        case 2:
                            Scanner scanner = new Scanner(System.in);
                    System.out.println("Cwiczenie cardio");
                    String exerciseName = scanner.next();
                    System.out.println("Ilosc s palonych kalorii");
                    int caloriesBurned = scanner.nextInt();
                    exerciseClass exerciseClass1 = new exerciseClass(exerciseName,caloriesBurned);
                    }
                    options.MenuData();

                    break;




                case 3:
                    System.out.println("Wybor2");
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Wybierz opcje");
                    break;
            }
//            options.MenuData();
            choice = scan.nextInt();



        }












//        Scanner scan = new Scanner(System.in);
//        System.out.println("Podaj swoj wzrost w cm");
//        String userHeight = scan.next();
//        System.out.println("Podaj swoja wage");
//        String userWeight = scan.next();
//
//        userClass userClass = new userClass(userHeight, userWeight);
//
//        System.out.println(userClass.ShowUserHeight());
//        System.out.println(userClass.ShowUserWieght());


//        System.out.println("Podaj nazwe cwiczenia");
//        String exerciseName = scan.next();
//        System.out.println("Podaj spalone kalorie");
//        int caloriesBurned = scan.nextInt();
//
//
//        exerciseClass exerciseClass = new exerciseClass(exerciseName, caloriesBurned);





//        int choice;
//
//        switch (choice) {
//            case 1:
//                exerciseClass exerciseClass1 = new exerciseClass();
//        }





    }







    }

