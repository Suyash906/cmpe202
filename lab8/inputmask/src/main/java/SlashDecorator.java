/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class SlashDecorator implements IDisplayComponent, IKeyEventHandler{
    private String addedState;
    IDisplayComponent component;
    public SlashDecorator(IDisplayComponent component){
        this.component = component;
    }

    @Override
    public String display() {
        addedState = component.display();
        return "[" + addedBehaviour(addedState)+ "]  ";
    }

    @Override
    public void setNext(IKeyEventHandler next) {
        ((CreditCardExp)component).setNext(next);
    }

    @Override
    public void key(String ch, int cnt) {
        ((CreditCardExp)component).key(ch, cnt);
    }

    @Override
    public void addSubComponent(IDisplayComponent c) {
        ((CreditCardExp)component).addSubComponent(c);
    }

    /**
     * Add Slash after every 2 digits
     * @param input Date
     * @return output
     */
    public String addedBehaviour(String input){
        String output="";
        int inputLength = input.length();
        if(inputLength<2) {
            output = input;
        } else {
            int count = 0;
            for(int i = 0; i <inputLength; i++) {
                output = output + input.charAt(i);
                if(input.charAt(i) != '/'){
                    if((count+1)%2 == 0 && (count+1)!=4){
                        output = output + '/';
                    }
                    count++;
                }
            }
        }
        return output;
    }
}
