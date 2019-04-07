/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String number = "" ;
	private int count = 0;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }

	@Override
	public String operation() {
		return number;
	}

	public String display() {
		if ( number.equals("") )
			return "[4444 4444 4444 4444]" + "  " ;
		else{
			IDisplayComponent component = new FourDigitSpacerDecorator(this);
			String result = component.operation();
			return "["+result+"]  ";
		}
	}	

	public void key(String ch, int cnt) {
    	if ( count <= 15 ) {
			if(ch.equalsIgnoreCase("X") && number.length()>0){
				char lastVal = number.charAt(number.length()-2);
				if(lastVal == ' ')
					number = number.substring(0,number.length()-2);
				else
					number = number.substring(0,number.length()-1);
				count--;
			} else {
				number += ch;
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