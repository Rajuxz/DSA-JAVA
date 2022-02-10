package Recursion;

import java.util.HashSet;

public class Subsequences {
    public static void subsequences(String str,int index,String newString){
        /**
         * current character has two options:
         * - to be in subsequence
         * and not to be in subsequence.
         */
        if(index == str.length()){
            System.out.println(newString);
            return;
        }
        
        char curr = str.charAt(index);
        
        subsequences(str,index+1,newString+curr);//to be in subsequence.
        
        subsequences(str,index+1,newString); //not to be in susequence
    }

    public void uniqueSubsequences(String str,int idx,String ns,HashSet<String>set){
        if(idx == str.length()){
            if(set.contains(ns)){
                return;
            }else{
                System.out.println(ns);
                set.add(ns);
                return;
            }
        }
        //ns--> newString

        char ch = str.charAt(idx);
        uniqueSubsequences(str,idx+1,ns+ch,set);
        uniqueSubsequences(str,idx+1,ns,set);

    }
    public static void main(String[] args) {
        Subsequences obj = new Subsequences();
        HashSet<String>set = new HashSet<String>();
        subsequences("abcd",0,"");
        System.out.println("Unique elements:");
        obj.uniqueSubsequences("aaaa",0,"",set);
    }
}
