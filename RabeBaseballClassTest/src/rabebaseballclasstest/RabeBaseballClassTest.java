/*
 * Owen Rabe
22/02/23
 */
package rabebaseballclasstest;


public class RabeBaseballClassTest {

    
    public static void main(String[] args) {
        BaseballPlayer j = new BaseballPlayer("John");
        System.out.println(j.toString());
        j.setTeam("Blue Jays");
        j.setHomeRuns(4000);
        j.setBatAvg(6.5);
        System.out.println(j.toString());
    }
    
}
