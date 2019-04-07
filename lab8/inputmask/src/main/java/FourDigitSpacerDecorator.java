/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class FourDigitSpacerDecorator  extends CardDecorator{
    private String addedState;
    public FourDigitSpacerDecorator(IDisplayComponent component){
        super(component);
    }

    @Override
    public String operation() {
        addedState = super.operation();
        return addedBehaviour(addedState);
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
