
/**
 * Write a description of class Bun here.
 *
 * @author (Suyash Srivastava)
 * @version (a version number or a date)
 */
public class Bun extends LeafDecorator
{
    private String[] options ;
    
    
    public Bun( String d )
    {
        super(d) ;
    }

    // 1 sauce free, extra +.75
    public void setOptions( String[] options )
    {
        this.options = options ;
        for ( int i = 0; i<options.length; i++ )
        {
            if ( "Glutten-Free Bun".equals(options[i]) ) this.price += 1 ;
            if ( "Pretzel Bun".equals(options[i]) ) this.price += 0.5 ;
            if ( "Hawaiian Bun".equals(options[i]) ) this.price += 1 ;
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