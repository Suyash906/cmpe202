import java.util.*;
public class GumballMachineThree extends GumballMachine{
	public static final int COST = 50;
	public static final int QUARTER = 25;
	public static final int DIME = 10;
	public static final int NICKEL = 5;
    private HashSet<Integer> accepted_coins;
    private int current_coin_value;

	public GumballMachineThree(int size){
		super(size);
        this.accepted_coins = new HashSet<Integer>();
        this.accepted_coins.add(QUARTER);
        this.accepted_coins.add(DIME);
        this.accepted_coins.add(NICKEL);
        this.current_coin_value = 0;
	}

    public void setCurrentCoinValue(int current_coin_value){
        this.current_coin_value = 0;
    }

	public void insertCoin(int coin){
		if(this.accepted_coins.contains(coin)) {
			this.current_coin_value = this.current_coin_value + coin;
			this.getState().insertCoin();
			if(this.current_coin_value == COST){
				this.setCurrentCoinValue(0);
				this.getState().turnCrank();
				this.getState().dispense();
			}
		} else{
			this.ejectCoin();
		}
	}

	public void ejectCoin(){
		this.setCurrentCoinValue(0);
		this.getState().ejectCoin();
	}
}