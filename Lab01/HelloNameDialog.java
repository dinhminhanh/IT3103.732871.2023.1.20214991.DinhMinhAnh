//DinhMinhAnh-20214991
//Example 3: HelloNameDialog.java

package LAB01;
import javax.swing.JOptionPane;// Importing the JOptionPane class for user interaction.
public class HelloNameDialog {
  public static void main(String[]args) {
	  
	  String result;
	  result = JOptionPane.showInputDialog("Dinh Minh Anh-20214991 - Please enter your name:"); 
	   //Display a dialog box asking the user to enter a name and save it to the `result` variable.
	  JOptionPane.showMessageDialog(null," My name is Dinh Minh Anh-20214991. Hi " + result + " !"); 
	  // Display a greeting with the user's name.
	  System.exit(0);// Terminate the program with an exit code of 0.
  } //End of method main
}
