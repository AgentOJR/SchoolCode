
package rabebaseballclasstest;


public class BaseballPlayer {
    private String name;
    private String team;
    private int homeRuns;
    private double batAvg;
    public BaseballPlayer(String name){
        this.name = name;
        team = "None";
        homeRuns = 0;
        batAvg = 0;
    }
    public BaseballPlayer(String name, String team, int homeRuns, double batAvg){
        this(name);
        this.team = team;
        this.homeRuns = homeRuns;
        this.batAvg = batAvg;
    }
    public void setTeam(String team){
    this.team = team;
}
    public String getTeam(){
        return team;
    }
    public int getHomeRuns(){
        return homeRuns;
    }
    public void setHomeRuns(int homeRuns){
        this.homeRuns = homeRuns;
    }
    public double getBatAvg(){
        return batAvg;
    }
    public void setBatAvg(double batAvg){
        this.batAvg = batAvg;
    }
    public void bat(int bases){
        if(bases == 4){
            homeRuns +=1;
        }
    }
    public String toString(){
    String msg  = "Player Info\n"
            + "Name: " + name +"\n"
            + "Team: " + team +"\n"
            + "Home Runs: " + homeRuns +"\n"
            + "Batting Average: " +batAvg ;
    return msg;
}
}
