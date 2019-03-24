  

public class Client {

    public static void runTest()
    {
        Component firstOrder = BuildOrder.getFirstOrder() ;
        firstOrder.printDescription();
        
        Component secondOrder = BuildOrder.getSecondOrder() ;
        secondOrder.printDescription();

    }
}
 
