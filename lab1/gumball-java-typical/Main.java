import java.util.*;

public class Main {

    public static final int NICKEL = 5;

    public static final int DIME = 10;

    public static final int QUARTER = 25; 
    
    public static void main(String[] args) {
        
        GumballMachineOne gumballMachineOne = new GumballMachineOne(5);

        System.out.println(gumballMachineOne);

        gumballMachineOne.insertCoin( QUARTER );
        gumballMachineOne.turnCrank();

        System.out.println(gumballMachineOne);

        gumballMachineOne.insertCoin( NICKEL );
        gumballMachineOne.insertCoin( DIME );
        gumballMachineOne.insertCoin( DIME );

        gumballMachineOne.turnCrank();
        
        System.out.println(gumballMachineOne);
        System.out.println("\n");

        GumballMachineTwo gumballMachineTwo = new GumballMachineTwo(5);

        System.out.println(gumballMachineTwo);

        gumballMachineTwo.insertCoin( QUARTER, QUARTER );
        gumballMachineTwo.turnCrank();

        System.out.println(gumballMachineTwo);

        System.out.println("\n");

        gumballMachineTwo.insertCoin( QUARTER, 50 );
        gumballMachineTwo.turnCrank();

        System.out.println(gumballMachineTwo);

        System.out.println("\n");

        GumballMachineThree gumballMachineThree = new GumballMachineThree(5);

        System.out.println(gumballMachineThree);

        gumballMachineThree.insertCoin( QUARTER );
        gumballMachineThree.insertCoin( NICKEL );
        gumballMachineThree.insertCoin( DIME );
        gumballMachineThree.insertCoin( DIME );

        System.out.println(gumballMachineThree);

        gumballMachineThree.insertCoin( 50 );

        System.out.println(gumballMachineThree);
    }
}
