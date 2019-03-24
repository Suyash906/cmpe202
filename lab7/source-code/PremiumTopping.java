
/**
 * Write a description of class PremiumTopping here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PremiumTopping extends LeafDecorator
{
    // instance variables - replace the example below with your own
    private String[] options ;

    public PremiumTopping( String d )
    {
        super(d) ;
    }

    // 4 toppings free, extra +.75
    public void setOptions( String[] options )
    {
        this.options = options ;
        for ( int i = 0; i<options.length; i++ )
        {
            if ( "Marinated Tomatoes".equals(options[i]) )
                this.price += 3.00 ;
            else 
                this.price += 1.00 ;
        }
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