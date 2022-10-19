public class HollowButterfly{
    public static void main(String[] args){
        int n = 5;

        // upper part -> rows
        for(int i=1;i<=n;i++){

            //half pyramid -> left side
            for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }        
            }
            // spaces
            for(int j=1;j<=2*n-2*i;j++){
                System.out.print(" ");
            }
            //half pyramid -> right side
            for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                    
            }
            System.out.println();
        }
        //lower part
        for(int i=n;i>=1;i--){

            //half pyramid -> left side
            for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                    
            }
            //spaces
            for(int j=1;j<=2*n-2*i;j++){
                System.out.print(" ");
            }
            //half pyramid -> right side
            for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                    
            }
            System.out.println();
        }
    }
}
