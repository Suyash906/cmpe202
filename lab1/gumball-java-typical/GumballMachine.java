import java.util.*;
public class GumballMachine {
    
    private int num_gumballs;

    public GumballMachine(int size) {
        this.num_gumballs = size;
    }

    public void releaseGumBall() {
        if ( this.num_gumballs > 0 ) {
            this.num_gumballs-- ;
            System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
        } else {
            System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
        }
    }
}
