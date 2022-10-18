import java.util.*;
public class HollowRect {
    public static void main(String[] agrs){

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        for(int i=1; i<=x; i++){

            for(int j=1; j<=y; j++){

                //we are inside cell now -> (i,j)
                if(i==1 || j==1 || i==x || j==y){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
  
            }
            System.out.println();
        }
    }
    
}
