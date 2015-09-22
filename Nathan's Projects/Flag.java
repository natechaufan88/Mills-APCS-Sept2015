/* Nathan Chau
 * September 21, 2015
 * This program print out a flag pattern.
 */

public class Flag {
    public static void main(String[] args) {
        for (int line=1; line<=7; line++) {
            for (int asterisk=1; asterisk<=7-line; asterisk++) {
                System.out.print("*");
            }
            
            for (int space=1; space<=line; space++) {
                System.out.print(" ");
            }
            
            for (int slash=1; slash<=14-2*line; slash++) {
                System.out.print("/");
            }
            
            for (int backslash=1; backslash<=(line-1)*2; backslash++) {
                System.out.print("\\");
            }
            
            for (int space=1; space<=line; space++) {
                System.out.print(" ");
            }
            
            for (int asterisk=1; asterisk<=7-line; asterisk++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}