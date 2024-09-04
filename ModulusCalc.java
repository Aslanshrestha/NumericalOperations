/**
 * Aslan Shrestha.
 * This class find the reminder of 1234/103 without using modulus. 
 * Instead of using modulus this class uses quotient and product as 1234 stands in 
 * place of the dividend and 103 as divisor. 
 */
public class ModulusCalc {
    public static void main(String args[]){
        int number = 1234;
        int mod = 103;
        int quotient = number / mod;
        int product= quotient * mod;
        int remainder= number- product;
        System.out.println(remainder);
    }
}
