//DinhMinhAnh-20214991
//Example 6.1: ChoosingOption.java

package LAB01;

import javax.swing.JOptionPane;
public class ChoosingOption {
    public static void main(String[] args) {
    	// Display a confirmation dialog and store 
        int option = JOptionPane.showConfirmDialog(null,
                " Dinh Minh Anh-20214991 - Do you want to change to the first class ticket?");
     // Show a message dialog to inform 
        JOptionPane.showMessageDialog(null, " Dinh Minh Anh-20214991 - You've chosen: "
                + (option == JOptionPane.YES_OPTION ? "Yes" : "No"));
        System.exit(0);
    }
}
