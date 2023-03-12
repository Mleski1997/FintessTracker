package pl.FitnessTracker.FitnessTracker;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scUser = new Scanner(System.in);
        int userOption = 0;




        while (userOption != 3) {
            userClass.Users();
            userOption = scUser.nextInt();
            switch (userOption) {
                case 1:

                    String fileName = "hashList.cvs";


                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Wprowadz nazwe uzytkownika");
                    String userLogin = scanner.next();
                    System.out.println("Wprowadz wzrost uzytkoniwka");
                    String userHeight = scanner.next();
                    System.out.println("Wprowadz wage uzytnika");
                    String userWeight = scanner.next();
                    userClass newUser = new userClass(userLogin, userHeight, userWeight);

                    HashMap<Integer, userClass> userList = new HashMap<>();
                    userList.put(1, newUser);


                    BufferedReader reader = new BufferedReader(new FileReader(fileName));

                    String line2 = reader.readLine();
                    int userId = 1;




                    while (line2 != null) {
                        String[] splitLine = line2.split(",");


                        userClass user = new userClass(splitLine[1], splitLine[2], splitLine[3]);

                        int id = Integer.parseInt(splitLine[0]);
                        userList.put(id, user);
                    }

















                    for (Integer key: userList.keySet()) {

                        userClass user = userList.get(key);
                        System.out.println(key + ":" + user.toString());
                    }




















                    try {
                        Scanner scannerFile = new Scanner(fileName);
                        FileWriter fileWriter = new FileWriter(fileName, true);
                        BufferedWriter writer = new BufferedWriter(fileWriter);



                        for (Map.Entry<Integer, userClass> entry : userList.entrySet()) {
                            String line = entry.getKey() + ":" + entry.getValue();

                            writer.write(line);
                            writer.newLine();


                        }
                       writer.close();
                        System.out.println("Hasmapa zostala zapisana do pliku");
                    } catch (IOException e) {
                        System.out.println("Blad podczas zapisywania pliku");
                        e.printStackTrace();
                    }











//                    userList.put(userId++, newUser);
//
//
//                    File file = new File("hashList.cvs");
//                    Scanner in = new Scanner(file);
//                    String text = in.nextLine();
//                    System.out.println(text);
//
//
//
//
//                    for (Integer key : userList.keySet() ) {
//                        if(key <=userList.size() ) {
//                            userClass value = userList.get(key);
//                            userList.remove(key);
//                            userList.put(key++, newUser);
//                        }
//
//
//
//
//                    }
//



//                    try {
////                        Scanner scannerFile = new Scanner(file);
//                        FileWriter fileWriter = new FileWriter(file, true);
//                        BufferedWriter writer = new BufferedWriter(fileWriter);
//
//
//
//                        for (Map.Entry<Integer, userClass> entry : userList.entrySet()) {
//                            String line = entry.getKey() + ":" + entry.getValue();
//
//                            writer.write(line);
//                            writer.newLine();
//
//
//                        }
//                       writer.close();
//                        System.out.println("Hasmapa zostala zapisana do pliku");
//                    } catch (IOException e) {
//                        System.out.println("Blad podczas zapisywania pliku");
//                        e.printStackTrace();
//                    }








//
//
//
//
//
//
//
//
//
//
//
//
//
//                    Scanner scanner = new Scanner(System.in);
//                    System.out.println("Wprowadz nazwe uzytkownika");
//                    String userLogin = scanner.next();
//                    System.out.println("Wprowadz wzrost uzytkoniwka");
//                    String userHeight = scanner.next();
//                    System.out.println("Wprowadz wage uzytnika");
//                    String userWeight = scanner.next();
//
//                    userClass newUser = new userClass(userLogin, userHeight, userWeight);
//                    userList.put(userId, newUser);
//                    userId++;
//
//
//
//
//
//
//                    try {
////                        Scanner scannerFile = new Scanner(file);
//                        FileWriter fileWriter = new FileWriter(file, true);
//                        BufferedWriter writer = new BufferedWriter(fileWriter);
//
//
//
//                        for (Map.Entry<Integer, userClass> entry : userList.entrySet()) {
//                            String line = entry.getKey() + ":" + entry.getValue();
//                            writer.write(line);
//                            writer.newLine();
//
//
//                        }
//                       writer.close();
//                        System.out.println("Hasmapa zostala zapisana do pliku");
//                    } catch (IOException e) {
//                        System.out.println("Blad podczas zapisywania pliku");
//                        e.printStackTrace();
//                    }
//
//
//
//
//
//
//
//
//

                    break;

                case  2:
                    File file1 = new File("hashList.cvs");
                    Scanner scanner2 = new Scanner(file1);
                    while (scanner2.hasNext()) {
                        String line = scanner2.nextLine();
                        System.out.println(line);
                    }

                    break;

                default:
                    userClass.Users();


            }
            userOption = scUser.nextInt();




        }





//        Options options = new Options();
//        Scanner scan = new Scanner(System.in);
//        int choice = -1;
//
//        options.MenuData();
//        choice = scan.nextInt();
//
//        while (choice != 6) {
//            switch (choice) {
//                case 1:
//                    int x = 0;
//                    options.CardioOrStrenght();
//                    x = scan.nextInt();
//
//                    switch (x) {
//
//                        case 1:
//                            Scanner scanner1 = new Scanner(System.in);
//                            System.out.println("Cwiczenie silowe");
//                            String exerciseStrenght = scanner1.next();
//                            System.out.println("Wpisz ktora seria");
//                            int series = scanner1.nextInt();
//                            System.out.println("Wpisz cięzar");
//                            double load = scanner1.nextDouble();
//                            System.out.println("Wpisz powtrzenia");
//                            int repeat = scanner1.nextInt();
//                            System.out.println("Wpisz skale RIR");
//                            int rir = scanner1.nextInt();
//                            exerciseStrenghtClass exerciseStrenghtClass = new exerciseStrenghtClass(exerciseStrenght, series, load, repeat, rir);
//                            options.MenuData();
//
//
//
//
//                            break;
//
//
//                        case 2:
//                            Scanner scanner = new Scanner(System.in);
//                            System.out.println("Cwiczenie cardio");
//                            String exerciseName = scanner.next();
//                            System.out.println("Ilosc s palonych kalorii");
//                            int caloriesBurned = scanner.nextInt();
//                            exerciseClass exerciseClass1 = new exerciseClass(exerciseName, caloriesBurned);
//
//
//
//
//
//
//
//                            options.MenuData();
//                            break;
//
//
//                        case 3:
//                            options.MenuData();
//
//                            break;
//
//                        default:
//                            System.out.println("Wybierz opcje");
//                            options.MenuData();
//                            break;
//
//                    }
//                    break;
//
//
//                case 2:
//                    System.out.println("Wybor2");
//                    break;
//
//                case 3:
//                    break;
//
//                default:
//                    System.out.println("Wybierz opcje");
//                    break;
//            }
////
//            choice = scan.nextInt();
//
//
//        }
    }


}




