package stratergyPattern;

import java.util.ArrayList;

public class PrintPackingOrder implements PrintOrderStrategy{

	public static final int TOP_BUN = 0;
	public static final int BOTTOM_BUN = 1;
	public static final int MEAT = 2;
	
	private ArrayList<String> order = new ArrayList<String>();
	private ArrayList<String> items = new ArrayList<String>();
	private ArrayList<Float> price = new ArrayList<Float>();
	private ArrayList<Integer> itemBunMaping = new ArrayList<Integer>();
	
	PrintPackingOrder(ArrayList<String> order, ArrayList<String> items, ArrayList<Float> price, ArrayList<Integer> itemBunMaping) {
		this.order = order;
		this.items = items;
		this.price = price;
		this.itemBunMaping = itemBunMaping;
	}
	
	public void printOrderStatement(){
		System.out.println("1    "+order.get(0));
		for(int i=0;i<this.itemBunMaping.size();i++){
			if(itemBunMaping.get(i) == TOP_BUN){
				System.out.println("        "+this.items.get(i));
			}
		}
		for(int i=0;i<this.itemBunMaping.size();i++){
			if(this.itemBunMaping.get(i) == MEAT){
				System.out.println("        -> | "+this.items.get(i));
			}
		}
		for(int i=0;i<this.itemBunMaping.size();i++){
			if(this.itemBunMaping.get(i) == BOTTOM_BUN){
				System.out.println("        "+this.items.get(i));
			}
		}
		System.out.println("1    "+this.order.get(1));
	}
}