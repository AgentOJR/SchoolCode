/*
 * Owen Rabe
 * Mar 8 23
 * Making a basketball simulator (Test harness for Player and team Classes)
 */
package rabebasketball4u;

import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class RabeBasketball4U {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Team[] teams;
        teams = readFile();
        mainMenu(teams);

    }

    /**
     * a method to read from a data file and create an array of team objects
     * from it
     *
     * @return an array with all of the team objects stored in it
     */
    public static Team[] readFile() {
        //initializing the variables
        File f = new File("src/RabeBasketball4U/ball.4u");
        int dunk;
        int threes;
        int def;
        int speed;

        String pName;
        String tName;
        int wins;
        int loss;
        Player[] players;
        try {
            Scanner s = new Scanner(f);
            //taking the number of records from the file
            int numTeams = Integer.parseInt(s.nextLine());
            //generating an array of teams based on how many teams there are
            Team[] teams = new Team[numTeams];
            //a loop to load each record into a team object in the array

            for (int i = 0; i < numTeams; i++) {
                tName = s.nextLine();
                wins = Integer.parseInt(s.nextLine());
                loss = Integer.parseInt(s.nextLine());
                players = new Player[5];
                //a loop to load each player and their stats into a player array, which is loaded into the team object which is loaded into the team array
                for (int j = 0; j < 5; j++) {
                    pName = s.nextLine();
                    speed = Integer.parseInt(s.nextLine());
                    threes = Integer.parseInt(s.nextLine());
                    dunk = Integer.parseInt(s.nextLine());
                    def = Integer.parseInt(s.nextLine());
                    //initializing this index's player object
                    players[j] = new Player(pName, speed, threes, dunk, def);
                }
                //initializing the team object in this index
                teams[i] = new Team(tName, players, wins, loss);
            }
            return teams;
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return null;

    }

    /**
     * The method that displays the main menu where the user chooses between the
     * team or player menus, or exits the program
     *
     * @param teams the teams that are used in the program
     */
    public static void mainMenu(Team[] teams) {
        String choice = "";
        // welcome message & variable initialization
        showMsg("Welcome to BasketBall4U!");
        boolean goodInput = false;
        boolean running = true;
        //loop so that this menu runs until user chooses to exit
        while (running) {
            goodInput = false;
            //loop to error check the user's input
            while (!goodInput) {
                //getting input from the user
                choice = getInput("What would you like to do?\n1. View Team menu"
                        + "\n2. View player menu\n"
                        + "or type \"q\" to exit.");
                //if the input is one of our accepted input terminate the loop
                if ((choice.equalsIgnoreCase("1") || choice.equalsIgnoreCase("2")) || choice.equalsIgnoreCase("q")) {
                    goodInput = true;
                    //otherwise tell the user they need to try again and repeat
                } else {
                    showMsg("I didn't understand that input, please try again...");
                }
            }
            //if the user chose option 1 call the team Menu method
            if (choice.equalsIgnoreCase("1")) {
                teamMenu(teams);

            } //if the user chose option 2 call the player menu method
            else if (choice.equalsIgnoreCase("2")) {
                playerMenu(teams);
            } //if the user entered q which is the only other accepted input, end the program.
            else {
                showMsg("Later gator!");
                running = false;
            }
        }
    }

    /**
     * helper method to display a joptionpane with a specified message
     *
     * @param msg the message to be displayed
     */
    public static void showMsg(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    /**
     * get input from the user using a JOptionPane Dialog box
     *
     * @param msg the message to give the user prompting for input
     * @return the input given by the user
     */
    public static String getInput(String msg) {
        boolean running = true;
        String input = "";
        while (running) {
            try {
                input = (JOptionPane.showInputDialog(msg));
                running = false;
            } catch (Exception e) {
                showMsg("Error: " + e);
            }
        }
        return input;
    }

    /**
     * The menu where the user chooses to do something with the teams, sim a
     * game, view info or make trades
     *
     * @param teams the teams used in the program
     */
    public static void teamMenu(Team[] teams) {
        //initializing some variables
        String teamMenuTxt = "Teams in the league: \n\n";
        String input = "";
        boolean goodInput = false;
        boolean running = true;
        //loop to make the menu repeat until the user chooses to exit it
        while (running) {
            goodInput = false;
            teamMenuTxt = "Teams in the league: \n\n";
            //adding the names of all the teams to the message given to the user
            for (int i = 0; i < teams.length; i++) {
                teamMenuTxt += ("-" + teams[i].getName() + "\n");
            }
            //adding the options to the message given to the user
            teamMenuTxt += "\n1. View team\n2. Simulate game\n3. Trade player\nOr type \"b\" to go back.";
            //error checking while loop
            while (!goodInput) {
                //Prompting the user for input with this generated message
                input = getInput(teamMenuTxt);
                //if the input is acceptable
                if (input.equalsIgnoreCase("1") || input.equalsIgnoreCase("2") || input.equalsIgnoreCase("b")||input.equalsIgnoreCase("3")) {
                    goodInput = true;
                }
            }
            //if the user chooses 1 call the viewteam method
            if (input.equalsIgnoreCase("1")) {
                viewTeam(teams);
            } //if they chose option 2 call the simgame method
            else if (input.equalsIgnoreCase("2")) {
                simGame(teams);
            } //if they entered b, end this menu and return to the previous
            else if (input.equalsIgnoreCase("b")) {
                running = false;
            }
            else if (input.equalsIgnoreCase("3")) {
                tradeMenu(teams);
            }
        }
    }

    /**
     * A menu where the user can search for a player and see if the player
     * exists
     *
     * @param teams the teams that are searched
     */
    public static void playerMenu(Team[] teams) {
        //initializing and instantiating variables
        boolean running = true;
        String choice = "";
        boolean found;
        int playerIndex = -1;
        Player[] players;
        Player wantedPlayer;
        //loop to keep the menu repeating until the user chooses to leave it
        while (running) {
            found = false;
            //prompting the user to enter the name of the player they want info on
            choice = getInput("Enter a player name to search for\nOr type \"b\" to go back.");
            //if the user did not choose to go back
            if (!choice.equalsIgnoreCase("b")) {
                //if the player is not found
                if (found == false) {
                    //taking the index of the player in this team
                    for (int i = 0; i < teams.length; i++) {
                        playerIndex = teams[i].getPlayerIndex(choice);
                        //if the searched player exists
                        if (playerIndex != -1) {
                            players = teams[i].getPlayers();

                            wantedPlayer = players[playerIndex];

                            found = true;
                            showMsg("FOUND!\nTeam: " + teams[i].getName() + "\n" + wantedPlayer.toString());
                            i = teams.length;
                        }

                    }
                    //if the program didn't find the wanted player
                }
                if (!found) {
                    showMsg("I couldn't find \"" + choice + "\", please try again...");
                }
            } else {
                //otherwise the user entered b so end the menu
                running = false;
            }
        }
    }

    /**
     * the method called when the user chooses to simulate a game
     *
     * @param teams the teams used in the program
     */
    public static void simGame(Team[] teams) {
        //initializing variables
        Team team1;
        Team team2;
        String input;
        String msg;
        int score1 = 0;
        int score2 = 0;
        int choice = -1;
        msg = "Select a team\n";
        //generating a message with all the team options and instructions to the player
        for (int i = 0; i < teams.length; i++) {
            msg += "-" + teams[i].getName() + "\n";
        }
        boolean goodInput = false;
        //error-checking loop
        while (!goodInput) {
            input = getInput(msg);
            //checking to see if the user enters a name that matches a team name
            for (int i = 0; i < teams.length; i++) {
                if (input.equalsIgnoreCase(teams[i].getName())) {
                    goodInput = true;
                    choice = i;
                }

            }
            //if the user enter's bad input force a repeat
            if (!goodInput) {
                showMsg("Sorry, team \"" + input + "\" not found. Try again");
            }
        }
        team1 = teams[choice];
        //for second team
        msg = "Select a team\n";
        //loop to make the message
        for (int i = 0; i < teams.length; i++) {
            if (!teams[i].getName().equalsIgnoreCase(team1.getName())) {
                msg += "-" + teams[i].getName() + "\n";
            }

        }

        goodInput = false;
        //error checking loop
        while (!goodInput) {
            input = getInput(msg);
            //loop to see if the user entered a match
            for (int i = 0; i < teams.length; i++) {
                if (input.equalsIgnoreCase(teams[i].getName())) {
                    goodInput = true;
                    choice = i;
                }

            }
            //if the user didn't enter a match give error message and repeat
            if (!goodInput) {
                showMsg("Sorry, team \"" + input + "\" not found. Try again");
            }
        }
        team2 = teams[choice];
        //shows the user who they have chosen and their record
        showMsg("Ready to sim?\n" + team1.getName() + " - W: " + team1.getWins() + " - L: " + team1.getLosses()
                + "\n\n  *****VS*****\n\n" + team2.getName() + " - W: " + team2.getWins() + " - L: " + team2.getLosses());
        boolean noTie = false;
        //loop ensures no tie, if tie it reapeats until there isn't
        while (!noTie) {
            score1 = team1.getScore();
            score2 = team2.getScore();

            if (score1 > score2 || score2 > score1) {
                noTie = true;
            }
        }
        String msg2;
        //determining who the winner is and updating their record
        if (score1 > score2) {
            team1.addWins();
            team2.addLoss();
            msg2 = "Game Results:\n" + team1.getName() + "(W: " + team1.getWins() + " - L: " + team1.getLosses() + ")\n\n******have defeated******\n\n" + team2.getName() + "(W: " + team2.getWins() + " - L: " + team2.getLosses() + ")\n\nby a score of " + score1 + " to " + score2 + ".";
        } else {
            team2.addWins();
            team1.addLoss();
            msg2 = "Game Results:\n" + team2.getName() + "(W: " + team2.getWins() + " - L: " + team2.getLosses() + ")\n\n******have defeated******\n\n" + team1.getName() + "(W: " + team1.getWins() + " - L: " + team1.getLosses() + ")\n\nby a score of " + score2 + " to " + score1 + ".";
        }
        //displaying the results of the game to the user
        showMsg(msg2);
    }

    /**
     * the method called when the user wants to see details about a specific
     * team
     *
     * @param teams the teams used in the program
     */
    public static void viewTeam(Team[] teams) {
        boolean running = true;
        String msg = "Teams in the league:\n\n";
        String choice = "";
        int name = -1;
        boolean goodInput = false;
        //loop to generate a list of the teams for the message to give the user
        for (int i = 0; i < teams.length; i++) {
            msg += ("-" + teams[i].getName() + "\n");
        }
        msg += "\nOr type \"b\" to go back";
        //loop to keep the menu up until the user wants to terminate it
        while (running) {
//error checking loop to see if user entered a valid team name
            while (!goodInput) {
                choice = getInput(msg);
                //loop to test each name against the user's input
                for (int i = 0; i < teams.length; i++) {
                    if (choice.equalsIgnoreCase(teams[i].getName())) {
                        goodInput = true;
                        name = i;
                    }

                }
                //if the user chooses to terminate this menu
                if (choice.equalsIgnoreCase("b")) {
                    goodInput = true;
                    running = false;
                    //if the input was not good/wasn't found as a team
                } else if (!goodInput) {
                    showMsg("I couldn't find \"" + choice + "\", please try again...");
                    choice = "";

                }
            }
            //if the name is not -1 (was found)
            if (name != -1) {
                showMsg("FOUND!\n" + teams[name].toString());
                goodInput = false;
                name = -1;

            }
            //if the user chose to terminate the program
            if (choice.equalsIgnoreCase("b")) {
                running = false;

            }
        }

    }
    /**
     * a menu where the user can trade a random player on a chosen team for a player with random stat
     * @param teams the team array
     */
    public static void tradeMenu(Team[] teams){
        boolean running = true;
        String msg = "Choose a Team:\n\n";
        String choice = "";
        int name = -1;
        boolean goodInput = false;
        String newName;
        Player temp;
        String tempName;
        //loop to generate a list of the teams for the message to give the user
        for (int i = 0; i < teams.length; i++) {
            msg += ("-" + teams[i].getName() + "\n");
        }
        msg += "\nOr type \"b\" to go back";
        //loop to keep the menu up until the user wants to terminate it
        while (running) {
//error checking loop to see if user entered a valid team name
            while (!goodInput) {
                choice = getInput(msg);
                //loop to test each name against the user's input
                for (int i = 0; i < teams.length; i++) {
                    if (choice.equalsIgnoreCase(teams[i].getName())) {
                        goodInput = true;
                        name = i;
                    }

                }
                //if the user chooses to terminate this menu
                if (choice.equalsIgnoreCase("b")) {
                    goodInput = true;
                    running = false;
                    //if the input was not good/wasn't found as a team
                } else if (!goodInput) {
                    showMsg("I couldn't find \"" + choice + "\", please try again...");
                    choice = "";

                }
            }
            //if the name is not -1 (was found)
            if (name != -1) {
                newName = getInput("Enter a name for the new Player");
                tempName = teams[name].getName();
                temp = teams[name].trade(new Player(newName));
                showMsg("Player " + temp.getName() + " Has been traded for "+ tempName );
                goodInput = false;
                name = -1;

            }
            //if the user chose to terminate the program
            if (choice.equalsIgnoreCase("b")) {
                running = false;

            }
        }
    }
}
