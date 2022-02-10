package Recursion;

public class NokiaKeypad {
    public static String[] keypad= {".","abc","def","ghi","jkl","mno","pqrs","tu","vw","xyz"};
    public static void printCombination(String str,int index,String comb){
        if(index==str.length()){
            System.out.println(comb);
            return;
        }
        char curr = str.charAt(index);
        String mapping = keypad[curr-'0'];
        for(int i=0;i<mapping.length();i++){
            printCombination(str,index+1,comb+mapping.charAt(i));
        }

    }
    public static void main(String[] args) {
        String str = "72";
        printCombination(str,0,"");
    }
}
