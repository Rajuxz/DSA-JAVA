package Recursion;

public class RemoveDuplicates {
    public static boolean map[] = new boolean[26];
    public static void removeDuplicates(String str,int index,String newString){
        if(index == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(index);
        if(map[currChar-'a']){
            removeDuplicates(str,index+1,newString);
            /**
             * Here if a-a =0
             * b-a =1 
             * c-a = 2
             * if current char -a index is true then we got character already.
             * So not adding to the newString.
             */
        }else{
            newString+=currChar;
            map[currChar - 'a'] = true;//if same character present twice in array, then false.
            removeDuplicates(str,index+1,newString);
        }
    }
    public static void main(String[] args) {
        String str = "sanamterikasam";
        removeDuplicates(str,0,"");
    }
}
