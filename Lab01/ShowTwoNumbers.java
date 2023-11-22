//DinhMinhAnh-20214991
//Example 4: ShowTwoNumbers.java

package LAB01;
import javax.swing.JOptionPane; //Importing the JOptionPane class for user interaction.
public class ShowTwoNumbers {
    public static void main(String[] args) {
    	
    	String strNum1, strNum2; //Declare string variables to store numbers.
    	String strNotification = " Dinh Minh Anh-20214991 - You've just entered:  "; //Initialize a notification string.
    	
    	strNum1 = JOptionPane.showInputDialog(null,
    			" Dinh Minh Anh-20214991 - Please input the first number: ",
    			" Dinh Minh Anh-20214991 - Input the first number",
    			JOptionPane.INFORMATION_MESSAGE);
    	strNotification += strNum1 + " and " ; //Prompt for the first number and update the notification string.
    	
    	strNum2 = JOptionPane.showInputDialog(null,
    			"Dinh Minh Anh-20214991 - Please input the second number: ", 
    			" Dinh Minh Anh-20214991 - Input the second number",
    			JOptionPane.INFORMATION_MESSAGE);
    	strNotification += strNum2 ; //Prompt for the second number and complete the notification string.
    	
    	JOptionPane.showMessageDialog(null, strNotification,
    			" Dinh Minh Anh-20214991 - Show two numbers" , JOptionPane.INFORMATION_MESSAGE); 
    	//Display the notification with the entered numbers.
    	System.exit(0);// Terminate the program with an exit code of 0.
    }
}
