/**
 * Owen Rabe
 * Apr 24 23
 * Given a string, compute recursively (no loops) a new string where all the 
 * lowercase 'x' chars have been changed to 'y' chars. 

 */
package rabeunit4testreview4real;


public class RabeUnit4TestReview4REAL {

    
    public static void main(String[] args) {
        System.out.println(changeXY("Box"));
    }
    public static String changeXY(String str){
        return str.replace("x", "y");
    }
}
