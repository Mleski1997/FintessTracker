package pl.FitnessTracker.FitnessTracker;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class userClass {

    private String userLogin;

    private String userHeight;
    private String  userWeight;

    private static int userId = 0;




    // TODO: Create another properties and methods

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserHeight() {
        return userHeight;
    }

    public void setUserHeight(String userHeight) {
        this.userHeight = userHeight;
    }

    public String getUserWeight() {
        return userWeight;
    }

    public void setUserWeight(String userWeight) {
        this.userWeight = userWeight;
    }

    public static int getUserId() {
        return userId;
    }

    public static void setUserId(int userId) {
        userClass.userId = userId;
    }

    public userClass (String userLogin, String userHeight, String userWeight) {
        this.userHeight = userHeight;
        this.userWeight = userWeight;
        this.userLogin = userLogin;
        userId++;


    }





   public String ShowUserHeight () {
        return userHeight;

   }

   public String ShowUserWieght() {
        return userWeight;
   }


   public static void Users() {
       System.out.println("1 Utworz nowego uzytkownika");
       System.out.println("2 Wybierz uzytkownika");


   }

   public String toString() {
        return "User name " + userLogin + " wzrost " + userHeight + " waga " + userWeight;
   }














}
