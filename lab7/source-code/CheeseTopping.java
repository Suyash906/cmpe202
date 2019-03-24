
/**
 * Write a description of class CheeseTopping here.
 *
 * @author (Suyash Srivastava)
 * @version (a version number or a date)
 */
public class CheeseTopping extends LeafDecorator
{
    // instance variables - replace the example below with your own
    private String[] options ;

    /**
     * Constructor for objects of class CheeseTopping
     */
    public CheeseTopping(String d)
    {
        // initialise instance variables
        super(d) ;
    }

    // 1 cheese free, extra cheese +1.00
    public void setOptions( String[] options )
    {
        this.options = options ;
        if ( options.length > 0 )
            this.price += options.length * 1.50 ;
    }
    
    public String getDescription() 
    {
        String desc = "   " ;
        for ( int i = 0; i<options.length; i++ )
        {
            if (i>0) desc += " + " + options[i] ;
            else desc = options[i] ;
        }        
        return desc ;
    }
}