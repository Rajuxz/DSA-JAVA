package Recursion;

public class MoveX {
    public static void moveX(String str, int index,int count,String newString) {
        if(index == str.length()){
            for(int i=0;i<count;i++){
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(index);
        if(currChar =='x'){
            count++;
            moveX(str,index+1,count,newString);
        }else{
            newString+=currChar;
            moveX(str,index+1,count,newString);
        }
    }
    public static void main(String[] args) {
      String str = "axbxcxdxexfxgxhxixjx";
      moveX(str,0,0,"");
    }
    
}
