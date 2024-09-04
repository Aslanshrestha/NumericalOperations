/**
 * Aslan Shrestha.
 * This class does math problems as an exercise to prove that 
 * the visual studio code will do the problem for you. This class
 * goes though the system operations to complete math operations. 
 */
public class NumericalOperations{
    public static void main(String args[]){
        String p1= "Problem 1: -79 + 3 * (4 + 82 - 68) / 7 % 19 = " ;
        double a1= -79 + 3 * (4 + 82 - 68) / 7 % 19 ;
        String r1 = p1 + a1;
        System.out.println(r1);

        String p2= "Problem 2: (179 + 21 +10)%7 / 181 * 2= ";
        double a2= (179 + 21 +10)%7 / 181 * 2 ;
        String r2= p2 + a2;
        System.out.println(r2); 

        String p3= "Problem 3: 10 / 2 * 2 + 10 % 2 =";
        double a3= 10 / 2 * 2 + 10 % 2 ;
        String r3=  p3 + a3;
        System.out.println(r3);

    }
}