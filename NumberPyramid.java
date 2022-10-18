import java.util.*;
public class NumberPyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how long pattern you want print: ");
        int n = sc.nextInt();
        //int num=1;

        for(int i=1; i<=n; i++){

            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //inner loop
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
                
            }
           
            System.out.println();
        }
        //  // Flipped
        // for(int k=n; k>=1; k--){

        //     for(int j=1; j<=n-k; j++){
        //         System.out.print(" ");
        //     }
        //     //inner loop
        //     for(int j=1; j<=k; j++){
        //         System.out.print(k+" ");
                
        //     }
        //     System.out.println();
        // }
    }
    
}
