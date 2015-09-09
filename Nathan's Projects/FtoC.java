/* Nathan Chau
 * September 8, 2015
 * This program will convert degrees Fahrenheit to degrees Celsius.
 */

public class FtoC {
    public static void main(String[] args) {
        double Fahrenheit = 100.0;
        double Celsius = ((double)5/9)*(Fahrenheit-32);
        System.out.println(Celsius);
    }
}