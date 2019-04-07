/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public interface IDisplayComponent
{

    String display() ;								// Display all UI commponents on a Screen
    String operation();                             // Modify UI compnent
    void addSubComponent( IDisplayComponent c ) ;	// Add a Nested / Subcomponent 
}
