package Recursion;

public class Permutation {
    public static void permutation(String str,String perm){
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currCh = str.charAt(i);
            String newStr = str.substring(0,i)+str.substring(i+1);
            permutation(newStr,perm+currCh);
        }
    }
    public static void main(String[] args){
        permutation("pramisha","");
    }
}
