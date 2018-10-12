package serializable;

import java.io.Serializable;

public class Person implements Serializable
{

    /**
     * 
     */
    private static final long serialVersionUID = -5496450872578488311L;
    
    public final String name = initName();
    
    public String initName(){
        return "qqq";
    }
}
