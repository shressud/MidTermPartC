/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author sudin
 */
import java.util.Scanner;

public class TestUserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Profile Creation Window");

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Choose your favorite genre:");
        System.out.println("1. Action");
        System.out.println("2. Adventure");
        System.out.println("3. Comedy");
        System.out.println("4. Rom-Com");
        System.out.println("5. Animation");
        System.out.print("Kindly input the number that corresponds to your favorite genre: ");

        int choice = scanner.nextInt();
        String genre;
        switch (choice) {
            case 1:
                genre = "Action";
                break;
            case 2:
                genre = "Adventure";
                break;
            case 3:
                genre = "Comedy";
                break;
            case 4:
                genre = "Rom-Com";
                break;
            case 5:
                genre = "Animation";
                break;
            default:
                genre = "Unknown";
                break;
        }

        System.out.println("Great job, " + name + "! You have successfully created your userProfile, and your favorite genre is " + genre + ".");
    }
}

