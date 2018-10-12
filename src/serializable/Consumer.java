package serializable;

public class Consumer
{
    public static void main(String[] args) {
        // 反序列化
        Person person = (Person)SerializationUtils.readObject();
        System.out.println(person.name);
    }
}
