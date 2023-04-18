/*
 * Owen Rabe
 * Mar 2 23
 * Piggy bank object for in class practice
 */
package rabemysavings;

public class PiggyBank {

    private int quarters;
    private int dimes;
    private int nickels;
    private int pennies;

    public PiggyBank() {
        quarters = 0;
        dimes = 0;
        nickels = 0;
        pennies = 0;
    }
    public void addCoin(int coin, int num){
        if (coin == 3) {
            pennies++;
        }else if (coin ==4) {
            nickels++;
        }else if (coin == 5) {
            dimes++;
        }else if (coin == 6) {
            quarters++;
        }
    }
    public double getTotal(){
        double total;
        total = (pennies * 0.1) + (nickels * 0.5) + (dimes * 0.1) + (quarters * 0.25);
        return total;
    }
public String toString(){
    String msg;
    msg = ("Pennies: " + pennies + "\nNickels: " + nickels + "\nDimes: " + dimes + "\nQuarters: " +  quarters);
    return msg;
}
public void removeCoin(int coin, int amt){
    if (coin == 1) {
        if(amt >  pennies){
            System.out.println("Error: not enough pennies in bank to do that!");
        }else{
            pennies--;
        }
            
        }else if (coin ==2) {
            if(amt >  nickels){
            System.out.println("Error: not enough nickels in bank to do that!");
        }else{
            nickels--;
        }
        }else if (coin == 3) {
            if(amt >  dimes){
            System.out.println("Error: not enough dimes in bank to do that!");
        }else{
            dimes--;
        }
        }else if (coin == 4) {
            if(amt >  quarters){
            System.out.println("Error: not enough quarters in bank to do that!");
        }else{
            quarters--;
        }
        }
}
public void takeMoney(){
     pennies = 0;
     nickels = 0;
     dimes = 0;
     quarters = 0;
     System.out.println("Your Piggy bank is now empty.");
   
}
}
