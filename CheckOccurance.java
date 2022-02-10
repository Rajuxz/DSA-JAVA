package Recursion;

public class CheckOccurance {
    public static int first = -1;
    public static int last  = -1;
    public static void findOccurance(String str, int ind, char el){
        if(ind == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char firstChar = str.charAt(ind);
        if(firstChar == el){
            if(first == -1){
                first = ind;
            }else{
                last = ind;
            }
        }
        findOccurance(str,ind+1,el);
    }
    public static void main(String[] args) {
        String str = "abaacdaefaaabh";
        findOccurance(str,0,'b');
    }
    
}
