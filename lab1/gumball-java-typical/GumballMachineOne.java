import java.util.*;
public class GumballMachineOne extends GumballMachine{
	public static final int COST = 25;
	public static final int QUARTER = 25;
    private HashSet<Integer> accepted_coins;
    private int current_coin_value;

	public GumballMachineOne(int size){
		super(size);
        this.accepted_coins = new HashSet<Integer>();
        this.accepted_coins.add(QUARTER);
        this.current_coin_value = 0;
	}

	public void setCurrentCoinValue(int current_coin_value){
		this.current_coin_value = 0;
	}

	public void insertCoin(int coin){
		if(this.accepted_coins.contains(coin)) {
			this.current_coin_value = this.current_coin_value + coin;
		} else{
			System.out.println("The inserted coin is invalid");
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