/*
 * Owen rabe
 * Mar 7 23
 * A team class for a basketball simulator, dependancies in Player class
 */
package rabebasketball4u;

import javax.swing.JOptionPane;
/**
 * 
 * @author owenrabe
 */
public class Team {

    private String name;
    private int wins;
    private int losses;
    private Player[] players = new Player[5];

    /**
     * Constructor to make a team with only a name and players given
     * @param name name of the team
     * @param players array of the player objects on the team
     */
    public Team(String name, Player[] players) {
        this.name = name;
        this.players = players;
        wins = 0;
        losses = 0;

    }
/**
 * Constructor for a team with given name, player array, win count and loss count
 * @param name name of team
 * @param players array of players
 * @param wins number of wins 
 * @param losses # of losses
 */
    public Team(String name, Player[] players, int wins, int losses) {
        this(name, players);
        this.wins = wins;
        this.losses = losses;
    }
/**
 * getter for team name
 * @return the name of the team object
 */
    public String getName() {
        return name;
    }
/**
 * getter for the team's win count
 * @return the number of wins
 */
    public int getWins() {
        return wins;
    }
/**
 * getter for the teams losses
 * @return the number of losses
 */
    public int getLosses() {
        return losses;
    }
/**
 * getter for a specific player in a list
 * @param choice the number of the player on the list
 * @return the player object
 */
    public Player getPlayer(int choice) {

        return players[choice - 1];
    }
    /**
     * getter method for the players array
     * @return the array of players
     */
    public Player[] getPlayers(){
        return players;
    }
/**
 * setter for the team name
 * @param name new team name
 */
    public void setName(String name) {
        this.name = name;
    }
/**
 * setter methid for the wins attribute
 * @param wins the new wins value
 */
    public void setWins(int wins) {
        this.wins = wins;
    }
/**
 * incriments the wins value by 1
 */
    public void addWins() {
        this.wins++;
    }
/**
 * incriments losses by 1
 */
    public void addLoss() {
        this.losses++;
    }
/**
 * setter method for the losses atribute
 * @param losses the new losses value
 */
    public void setLosses(int losses) {
        this.losses = losses;
    }
/**
 * sets a chosen existing player to a  new player
 * @param player the new player
 * @param choice the index of the existing player
 */
    public void setPlayer(Player player, int choice) {
        players[choice - 1] = player;
    }
/**
 * basic tostring method
 * @return the string version of the team
 */
    public String toString() {
        String msg = "";
        msg += "Team Name: " + name + "\n\nRecord: W: " + this.getWins() + " L: " + this.getLosses() +"\n\nRoster:\n";
        for (int i = 0; i < 5; i++) {
            msg += players[i].toString() + "\n\n";
        }

        return msg;
    }
/**
 * generate a score for the team based on the players stats
 * @return the generated score of the game
 */
    public int getScore() {
        int factor = 0;
        for (int i = 0; i < 5; i++) {
            factor += players[i].getSpeed();
            factor += players[i].getThreePoint();
            factor += players[i].getDunk();
            factor += players[i].getDefence();
        }
        factor = factor / 4;
        return (int) (Math.random() * factor) + 75;
    }
/**
 * gives the index of the requested player or -1 if the player doesn't exist
 * @param playerName the name of the player to look
 * @return  returns the index of the requested player
 */
    public int getPlayerIndex(String playerName) {
        for (int i = 0; i < 5; i++) {
            if (playerName.equalsIgnoreCase(players[i].getName())) {
                return i;
            }

        }
        return -1;
    }
/**
 * trade a random player on the team for a given player
 * @param other the new player for the team
 * @return the new player that has been put into the method
 */
    public Player trade(Player other) {
        int randPlayer = (int) (Math.random() * 5);
        Player temp = new Player(players[randPlayer].getName(), players[randPlayer].getSpeed(), players[randPlayer].getThreePoint(), players[randPlayer].getDunk(), players[randPlayer].getDefence());
        Player temp2 = players[randPlayer];
        players[randPlayer] = other;
        return temp;

    }

}
