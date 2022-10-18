public class PalindromicPattern {
    public static void main(String[] args){

        int n = 5;

        //Outer loop -> rows
        for(int i=1; i<=n; i++){

            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");  //double space given
            }
            //first half -> j= i to 1    backward direction
            for(int j=i; j>=1; j--){
                System.out.print(j+" ");
            }
            // second half -> j= 2 to n  forward direction
            for(int j=2; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        } 
    }
    
}
