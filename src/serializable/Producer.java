package serializable;

public class Producer
{
    public static void main(String[] args) {
        SerializationUtils.writeObject(new Person());
    }
}
