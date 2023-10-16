//DinhMinhAnh2021491
//Example 6.3: TriangleStar.java
package LAB01;
import java.util.Scanner;
public class TriangleStar {
  public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  //input n
	  System.out.print("Enter the height of the triangle: n = ");
	  int n = scanner.nextInt();
     //check n 
      if (n <= 0) {
          System.out.println("Invalid height. Please re-enter. ");
      } else {
          for (int i = 1; i <= n; i++) {
              // Print spaces
              for (int j = i; j <= n; j++) {
                  System.out.print(" ");
              }
              // Print stars
              for (int k = 1; k <= 2 * i - 1; k++) {
                  System.out.print("*");
              }
              // Move to the next line
              System.out.println();
          }
      }
      scanner.close();
  }
}
