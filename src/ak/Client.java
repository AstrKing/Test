package ak;

public class Client
{
    public static void main(String[] args) {
        int count = 0;
        for(int i = 0;i<10;i++){
            count = count++;
        }
        System.out.println(count);
    }
}
