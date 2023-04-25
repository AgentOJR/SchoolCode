/**
 * Owen Rabe
 * Apr 24 23
 * The Lucas series is as follows: 2,1,3,4,7,11,18,29,47...Given n of 0 or more,
 * return the nth Lucas number, where Ln = Ln-1 + Ln-2 for n > 1, and L0 = 2 and 
 * L1 = 1.

 */
package rabeunit4testreview2;


public class RabeUnit4TestReview2 {

    public static int getLucas(int n){
        if(n ==0){
        return 2;
        }else if(n == 1){
            return 1;
        }else{
            return getLucas(n-1) + getLucas(n-2);
        }

    }
    public static void main(String[] args) {
        System.out.println(getLucas(75));
    }
    
}
