/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class FourDigitSpacerDecorator   implements IDisplayComponent, IKeyEventHandler{
    private String addedState;
    IDisplayComponent component;
    public FourDigitSpacerDecorator(IDisplayComponent component){
        this.component = component;
    }

    @Override
    public String display() {
        addedState = component.display();
        return "["+addedBehaviour(addedState)+"]   ";
    }

    @Override
    public void setNext(IKeyEventHandler next) {
        ((CreditCardNum)component).setNext(next);
    }

    @Override
    public void key(String ch, int cnt) {
        ((CreditCardNum)component).key(ch, cnt);
    }

    @Override
    public void addSubComponent(IDisplayComponent c) {
        ((CreditCardNum)component).addSubComponent(c);
    }

    /**
     * Add Spaces after every 4 digits
     * @param input Card Number
     * @return output
     */
    public String addedBehaviour(String input){
        String output="";
        int inputLength = input.length();
        if(inputLength<4) {
            output = input;
        } else {
            int count = 0;
            for(int i = 0; i <inputLength; i++) {
                output = output + input.charAt(i);
                if(input.charAt(i) != ' '){
                    if((count+1)%4 == 0 && (count+1)!=16){
                        output = output + ' ';
                    }
                    count++;
                }
            }
        }
        return output;
    }
}
