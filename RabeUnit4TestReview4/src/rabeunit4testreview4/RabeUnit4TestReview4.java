/**
 * Owen Rabe
 * Apr 24 23
 * Given a string, compute recursively (no loops) a new string where all the 
 * lowercase 'x' chars have been changed to 'y' chars. 
 */
package rabeunit4testreview4;


public class RabeUnit4TestReview4 {

    public static String noX(String str){
        if(!str.contains("x")){
            return str;
        }else{
            return noX(str.substring(0,str.indexOf("x") )+ str.substring(str.indexOf("x") + 1));
        }
    }
    public static void main(String[] args) {
        System.out.println(noX("xaxbx"));
    }
    
}
