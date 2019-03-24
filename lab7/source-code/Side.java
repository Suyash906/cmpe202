
/**
 * Write a description of class Side here.
 *
 * @author (Suyash Srivastava)
 * @version (a version number or a date)
 */
public class Side extends LeafDecorator
{
    private String[] options ;
    
    
    public Side( String d )
    {
        super(d) ;
    }

    public void setOptions( String[] options )
    {
        this.options = options ;
        this.price+=3;
        
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