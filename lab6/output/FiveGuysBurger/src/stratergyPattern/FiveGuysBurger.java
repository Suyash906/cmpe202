package stratergyPattern;
import java.util.*;

public class FiveGuysBurger {
	public static final int TOP_BUN = 0;
	public static final int BOTTOM_BUN = 1;
	public static final int MEAT = 2;
	public static final int TAX = 9;
	public static void main(String []args){
		ArrayList<String> order = new ArrayList<String>();
		ArrayList<String> items = new ArrayList<String>();
		ArrayList<Float> price = new ArrayList<Float>();
		ArrayList<Integer> itemBunMaping = new ArrayList<Integer>();
		
		order.add("LBB");
		
		items.add("{{{{ Bacon }}}}");
		itemBunMaping.add(BOTTOM_BUN);
		
		items.add("LETTUCE");
		itemBunMaping.add(TOP_BUN);
		
		items.add("TOMATO");
		itemBunMaping.add(TOP_BUN);
		
		items.add("G ONION");
		itemBunMaping.add(MEAT);
		
		items.add("JALA Grilled");
		itemBunMaping.add(MEAT);
		
		price.add(5.59F);
		
		order.add("LTL CAJ");
		price.add(2.79F);
		
		
		System.out.println("Recipt Slip\n");
		PrintOrderStrategy  printRecipt = new PrintReciptOrder(order, items, price, itemBunMaping);
		printRecipt.printOrderStatement();
		
		System.out.println("\n\n");
		
		System.out.println("Packing Slip\n");
		PrintOrderStrategy  printPacking = new PrintPackingOrder(order, items, price, itemBunMaping);
		printPacking.printOrderStatement();
	}
}