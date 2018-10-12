package abnormal;

import java.util.ArrayList;
import java.util.List;

public class MyException extends Exception
{
    private List<Throwable> causes = new ArrayList<Throwable>();
    
    
}
