/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CardDecorator implements IDisplayComponent{
    IDisplayComponent component;
    public CardDecorator(IDisplayComponent component){
        this.component = component;
    }

    @Override
    public String display() {
        return null;
    }

    @Override
    public String operation() {
        return this.component.operation();
    }

    @Override
    public void addSubComponent(IDisplayComponent c) {

    }
}
