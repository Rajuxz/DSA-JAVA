package Recursion;

public class CheckPallindrome {
    public static boolean isPallindrome(String str,int first,int last){
        if(first>=last){
            return true;
        }
        if(str.charAt(first)!=str.charAt(last)){
            return false;
        }
        return isPallindrome(str,first+1,last-1);
    }
    public static void main(String[] args) {
        String str = "1233211";
        // System.out.println(isPallindrome(str,0,str.length()-1));
        if(isPallindrome(str,0,str.length()-1)){
           System.out.println("String is pallindrome."); 
        }else{
            System.out.println("String is not pallindrome.");
        }
    }
}
