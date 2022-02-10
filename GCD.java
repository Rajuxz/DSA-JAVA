package Recursion;

public class GCD {
    public static int greatestCommonDivisor(int x,int y){
        if(y == 0){
            return x;
        }else{
            int remainder = x%y;
            return greatestCommonDivisor(y,remainder);
        }
    }
    public static void main(String[] args) {
        System.out.println(greatestCommonDivisor(15, 30));
        /**
         *  15 = 3 x 5 
         *  30 = 3 x 5 x 2
         * 
         * common:  3x5 so 15 is common divisor for 15 and 30.
         */
    }
}
