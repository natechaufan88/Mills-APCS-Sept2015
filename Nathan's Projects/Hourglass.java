/* Nathan Chau
 * September 18, 2015
 * This program prints out an hourglass figure. To change the size of the hourglass, one only needs
 * to change the value of the public variable "LINES", which will determine the number of lines in
 * each half of the hourglass (top and bottom).
 */

public class Hourglass {
    public static final int LINES=4;
    
    public static void main(String[] args) {
        ends();
        topHalf();
        middle();
        bottomHalf();
        ends();
    }
    
    public static void ends() {
        System.out.print("|");
        for (int i=1; i<=LINES*2+2; i++) {
            System.out.print("\"");
        }
        System.out.println("|");
    }
    
    public static void topHalf() {
        for (int line=1; line<=LINES; line++) {
            for (int j=1; j<=line; j++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int k=1; k<=((LINES*2+2)-2*line); k++) {
                System.out.print(":");
            }
            System.out.println("/");
        }
    }
    
    public static void middle() {
        for (int i=1; i<=LINES+1; i++) {
            System.out.print(" ");
        }
        System.out.println("||");
    }
    
    public static void bottomHalf() {
        for (int line=LINES; line>=1; line--) {
            for (int j=1; j<=line; j++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int k=1; k<=((LINES*2+2)-2*line); k++) {
                System.out.print(":");
            }
            System.out.println("\\");
        }
    }
}
