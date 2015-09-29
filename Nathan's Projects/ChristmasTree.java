/* Nathan Chau
 * September 28, 2015
 * This program will use parameters to print out any size Christmas Tree.
 */

public class ChristmasTree {
    public static void drawTree(int max_segments, int max_height) {
        for (int segment = 1; segment <= max_segments; segment++) {
            for (int line = 1; line <= max_height; line++) {
                for (int space = 1; space <= (7 - segment) - line; space++) {
                    System.out.print(" ");
                }
                
                for (int star = 1; star <= (2 * line) + (2 * segment) - 3; star++) {
                    System.out.print("*");
                }
                
                System.out.println();
            }
        }
    }
        
    public static void bottom() {
        System.out.println("     *");
        System.out.println("     *");
        System.out.println("  *******");
    }
    
    public static void main(String[] args) {
        drawTree(3, 4);
        bottom();
        System.out.println();
        drawTree(2, 5);
        bottom();
    }
}