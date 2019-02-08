import java.util.*;
public class GumballMachineTwo extends GumballMachine{
    public static final int COST = 50;
    public static final int QUARTER = 25;
    private HashSet<Integer> accepted_coins;
    private int current_coin_value;

    public GumballMachineTwo(int size){
        super(size);
        this.accepted_coins = new HashSet<Integer>();
        this.accepted_coins.add(QUARTER);
        this.current_coin_value = 0;
    }

    public void setCurrentCoinValue(int current_coin_value){
        this.current_coin_value = 0;
    }

    public void insertCoin(int coin1, int coin2){
        if(this.accepted_coins.contains(coin1) && this.accepted_coins.contains(coin2)) {
            this.current_coin_value = this.current_coin_value + coin1 + coin2;
        } else{
            System.out.println("One or both the coin(s) is(are) invalid.");
        }
    }

    public void turnCrank(){
        if(this.current_coin_value == COST){
        	this.setCurrentCoinValue(0);
            this.releaseGumBall();
        } else{
            System.out.println("The coin(s) value is less than the price"); 
        }
    }
}