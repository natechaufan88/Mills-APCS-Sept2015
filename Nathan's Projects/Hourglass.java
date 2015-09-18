/* Nathan Chau
 * September 17, 2015
 * This program prints out an hourglass figure.
 */

public class Hourglass {
    public static void main(String[] args) {
        ends();
        for (int line=1; line<=4; line++) {
            for (int j=1; j<=line; j++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int k=1; k<=(10-2*line); k++) {
                System.out.print(":");
            }
            System.out.println("/");
        }
        System.out.println("     ||");
        for (int line=4; line>=1; line--) {
            for (int j=1; j<=line; j++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int k=1; k<=(10-2*line); k++) {
                System.out.print(":");
            }
            System.out.println("\\");
        }
        ends();
    }
    
    public static void ends() {
        System.out.println("|\"\"\"\"\"\"\"\"\"\"|");
    }
}