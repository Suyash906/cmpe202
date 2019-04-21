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
		PrintOrderStrategy  printRecipt = () -> {
			float total_price = 0.0F;
			for(int i=0;i<price.size();i++){
				total_price+=price.get(i);
			}
			System.out.print("1    "+order.get(0));
			System.out.println("                      "+price.get(0));
			for(int i=0;i< items.size();i++){
				System.out.println("     "+items.get(i));
			}
			
			System.out.print("1    "+order.get(1));
			System.out.println("                  "+price.get(1));
			float tax = (float) ((total_price*TAX)/100);
			System.out.println("                              $"+tax);
			System.out.println("                              $"+ (total_price+tax));
		};
		
		printRecipt.printOrderStatement();
		
		System.out.println("\n\n");
		
		System.out.println("Packing Slip\n");
		PrintOrderStrategy  printPacking = () -> {
			System.out.println("1    "+order.get(0));
			for(int i=0;i<itemBunMaping.size();i++){
				if(itemBunMaping.get(i) == TOP_BUN){
					System.out.println("        "+items.get(i));
				}
			}
			for(int i=0;i<itemBunMaping.size();i++){
				if(itemBunMaping.get(i) == MEAT){
					System.out.println("        -> | "+items.get(i));
				}
			}
			for(int i=0;i<itemBunMaping.size();i++){
				if(itemBunMaping.get(i) == BOTTOM_BUN){
					System.out.println("        "+items.get(i));
				}
			}
			System.out.println("1    "+order.get(1));
		};
		
		printPacking.printOrderStatement();
	}
}