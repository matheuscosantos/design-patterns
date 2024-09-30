import models.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder("John", "Doe").setAge(30).setAddress("123 Main St").build();
    }
}