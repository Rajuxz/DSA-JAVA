package Recursion;

import java.util.Scanner;

public class ReverseString {
    public static void printReverse(String str,int index){
        if(index == 0){//Base condition
            System.out.print(str.charAt(0));
            return;
        }
        
        System.out.print(str.charAt(index));
        printReverse(str,index-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();
        printReverse(str,str.length()-1);
    }
    
}
