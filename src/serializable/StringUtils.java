package serializable;

public class StringUtils
{
    public static String remove(String source,String sub){
        return source.replaceAll(sub, "");
    }
}
