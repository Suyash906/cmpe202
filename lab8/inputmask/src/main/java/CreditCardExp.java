/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String date = "" ;
	private int count;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }

	@Override
	public String operation() {
		return date;
	}

	public String display() {
		if ( date.equals("") )
			return "[MM/YY]" + "  " ;
		else{
			IDisplayComponent component = new SlashDecorator(this);
			String result = component.operation();
			return "["+result+"]  ";
		}
	}	

	public void key(String ch, int cnt) {
		if ( count >= 0 && count <= 3  ){
			int dateLength = date.length();
			if(ch.equalsIgnoreCase("X") && dateLength>0){
				char lastVal = date.charAt(dateLength-2);
				if(lastVal == '/')
					date = date.substring(0,dateLength-2);
				else {
					date = date.substring(0, dateLength - 1);
				}
				count--;
			} else {
				date += ch;
				count++;
			}
		}
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}