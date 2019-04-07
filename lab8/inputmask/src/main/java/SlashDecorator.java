/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class SlashDecorator extends CardDecorator{
    private String addedState;
    public SlashDecorator(IDisplayComponent component){
        super(component);
    }

    @Override
    public String operation() {
        addedState = super.operation();
        return addedBehaviour(addedState);
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
