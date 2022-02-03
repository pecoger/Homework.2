package homeWork2;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        //1st condition of homework 2
        String myName = "My name is <myName>";

        System.out.println("Enter your name here: ");
        Scanner scanner = new Scanner(System.in);
        String replacedName = myName.replace("<myName>", scanner.nextLine());

        System.out.println(replacedName + ".");

        //2nd condition of homework 2
        System.out.println("Enter you nickname");
        String nickName = scanner.nextLine();

        System.out.println("Name equal nickname? - " + replacedName.equals(nickName));
        /*
        In this case it will always be false,
        unless we input replacedName value + nickName value
        in the console.
         */

        //3rd condition of homework 2
        String [] wordCountArray = replacedName.split(" ");

        System.out.println('\"' + replacedName + '\"' + " has " + wordCountArray.length + " words.");

        //4th condition of homework 2
        String yourName = "What is your name? \n" ;

        System.out.println(yourName + replacedName + " and my nickname is " + nickName + ".");

        //TODO find you hot to split the conditions in different classes
    }
}
