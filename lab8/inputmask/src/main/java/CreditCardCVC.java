/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardCVC implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String cvc = "" ;
	private int count = 0;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		if ( cvc.equals("") )
			return "[123]" + "  " ;
		else
			return "[" + cvc + "]" + "  " ;
	}

	public void key(String ch, int cnt) {
		if ( count >= 0  ) {
			if ( count >= 0 && count <= 2 ) {
				if(ch.equals("X") && cvc.length()>0){
					cvc = cvc.substring(0,cvc.length()-1);
					count--;
				} else {
					cvc += ch;
					count++;
				}

			}
			else if ( nextHandler != null )
				nextHandler.key(ch, cnt) ;
		}
		
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}