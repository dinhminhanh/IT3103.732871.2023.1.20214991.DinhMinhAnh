//DinhMinhAnh-20214991
//Example 6.2: InputFromKeyboard.java
package LAB01;

import java.util.Scanner;
public class InputFromKeyboard {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //input name
        System.out.println(" My name is Dinh Minh Anh-20214991. What's your name?");
        String strName = keyboard.nextLine();
        //input old
        System.out.println(" My name is Dinh Minh Anh-20214991. How old are you?");
        int iAge = keyboard.nextInt();
        //input tall
        System.out.println("My name is Dinh Minh Anh-20214991. How tall are you (m)?");
        double height = keyboard.nextDouble();
        //display values
        System.out.println("Mrs/Ms. " + strName + " , " + iAge + " year old." + " Your height is " + height + ".");
    }
}


