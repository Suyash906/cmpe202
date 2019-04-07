/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String date = "" ;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }

	public String display() {
		if ( date.equals("") )
			return "MMYY" ;
		else{
			return date;
		}
	}	

	public void key(String ch, int cnt) {
		if ( cnt >= 17 && cnt <= 20  ){
			int dateLength = date.length();
			if(ch.equalsIgnoreCase("X") && dateLength>0){
				date = date.substring(0, dateLength - 1);
			} else {
				date += ch;
			}
		}
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}