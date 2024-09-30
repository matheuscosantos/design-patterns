package models;

public class Person {
    private String firstName ;
    private String lastName ;
    private int age ;
    private String address ;

    private Person(PersonBuilder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.address = builder.address;
    }

    public static class PersonBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private String address;

        public PersonBuilder(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public PersonBuilder setAge(int age){
            this.age = age;
            return this;
        }

        public PersonBuilder setAddress(String address){
            this.address = address;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }
}
