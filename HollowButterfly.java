public class HollowButterfly {
    public static void main(String[] args){

        int n = 5;
       // int m = 5;

        // upper part
        for(int i=1; i<=n; i++){
            //half pyramid -> upper left
            for(int j=1; j<=n; j++){
                if(j==1 || i==j || i==n){
                System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            //spaces
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            //half pyramid -> upper right
            for(int j=1; j<=i; j++){
                if(i==1 || i==j || i==n){
                    System.out.print("*");
                    } else{
                        System.out.print(" ");
                    }
            }
            
            System.out.println();
        }
    }
    
}

