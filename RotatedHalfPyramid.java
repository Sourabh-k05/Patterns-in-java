public class RotatedHalfPyramid {
    public static void main(String[] args){
        int n = 4;

        // outer loop
        for(int i=1; i<=n; i++){
            //inner loop -> print space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //inner loop -> print star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
      
    
}
