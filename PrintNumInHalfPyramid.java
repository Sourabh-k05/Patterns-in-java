import java.util.*;
public class PrintNumInHalfPyramid {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how long pattern you want: ");
        int n = sc.nextInt();

        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
    
}



// logic explaination find relation between them
/* 1        <- row=1  no's 1 to 1
 * 12       <- row=2  no's 1 to 2
 * 123      <- row=3  no's 1 to 3
 * 1234     <- row=4  no's 1 to 4
 * 12345    <- row=5  no's 1 to 5
 */

// this explaination is for inverted half pyramid with numbers
// logic explaination find relation between them
/* 1        <- row=1  no's 1 to 5   
 * 12       <- row=2  no's 1 to 4
 * 123      <- row=3  no's 1 to 3
 * 1234     <- row=4  no's 1 to 2
 * 12345    <- row=5  no's 1 to 1
 * 
 *
 *  yha pe inner loop n-i+1 tak chlega.. for(int j=1; j<=n-i+1; j++) and print j
 * first iteration me i=1 rahega n=5
 * second iteration me i=2 rahega to n-i+1 = 4
 * same upto last iteration
 */