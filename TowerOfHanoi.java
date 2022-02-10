package Recursion;

class TowerOfHanoi {
    public static void towerOfHanoi(int n, String src,String help, String dest){
        if(n == 1){
            System.out.println("Move: "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1,src,dest,help);
        System.out.println("Move:"+src+" to "+dest);
        towerOfHanoi(n-1,help,src,dest);
    }
    public static void main(String[] args) {
        int n = 5;
        towerOfHanoi(n,"Source","Helper","Destination");
    } 
}
