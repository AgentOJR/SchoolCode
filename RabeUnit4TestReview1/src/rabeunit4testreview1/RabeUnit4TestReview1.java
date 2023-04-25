/**
 * Owen Rabe
 * Apr 24 23
 * Given a non-negative int n, return the sum of its digits recursively 
 * (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6)
 * , while divide (/) by 10 removes the rightmost digit (126 / 10 is 12)
 */
package rabeunit4testreview1;


public class RabeUnit4TestReview1 {

    
    public static void main(String[] args) {
        System.out.println(sumDig(49,0));
    }
    public static int sumDig(int n,int sum){
        if(n%10==0){
            return sum;
        }else{
            sum += n %10;
            n= n/10;
            return sumDig(n,sum);
        }
        
    }
        
        
}
