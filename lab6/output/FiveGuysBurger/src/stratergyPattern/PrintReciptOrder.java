package stratergyPattern;

import java.util.ArrayList;

public class PrintReciptOrder implements PrintOrderStrategy {
	public static final int TOP_BUN = 0;
	public static final int BOTTOM_BUN = 1;
	public static final int MEAT = 2;
	public static final int TAX = 9;
	
	private ArrayList<String> order = new ArrayList<String>();
	private ArrayList<String> items = new ArrayList<String>();
	private ArrayList<Float> price = new ArrayList<Float>();
	private ArrayList<Integer> itemBunMaping = new ArrayList<Integer>();
	
	PrintReciptOrder(ArrayList<String> order, ArrayList<String> items, ArrayList<Float> price, ArrayList<Integer> itemBunMaping) {
		this.order = order;
		this.items = items;
		this.price = price;
		this.itemBunMaping = itemBunMaping;
	}
	
	public void printOrderStatement(){
		float total_price = 0.0F;
		for(int i=0;i<this.price.size();i++){
			total_price+=this.price.get(i);
		}
		System.out.print("1    "+order.get(0));
		System.out.println("                      "+this.price.get(0));
		for(int i=0;i< items.size();i++){
			System.out.println("     "+items.get(i));
		}
		
		System.out.print("1    "+this.order.get(1));
		System.out.println("                  "+this.price.get(1));
		float tax = (float) ((total_price*TAX)/100);
		System.out.println("                              $"+tax);
		System.out.println("                              $"+ (total_price+tax));
		
	}
}