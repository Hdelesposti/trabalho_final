package collection;

/**
 *
 * @author Heloiza
 */
public class RepublicaCollection {
    
    private static RepublicaCollection INSTANCE = null;
    
    
    
    public static RepublicaCollection instance() {
        if (INSTANCE == null) {
            INSTANCE = new RepublicaCollection();
        }
        return INSTANCE;
    }
    
}
