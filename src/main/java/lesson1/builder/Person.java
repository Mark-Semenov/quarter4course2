package lesson1.builder;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;


    public static class Builder {
        private final Person person;

        public Builder() {
            person = new Person();
        }


        public Builder name(String name) {
            person.firstName = name;
            return this;
        }

        public Builder lastname(String lastname) {
            person.lastName = lastname;
            return this;
        }

        public Builder middleName(String middleName) {
            person.middleName = middleName;
            return this;
        }

        public Builder country(String country) {
            person.country = country;
            return this;
        }

        public Builder address(String address) {
            person.address = address;
            return this;
        }

        public Builder phone(String phone) {
            person.phone = phone;
            return this;
        }

        public Builder age(int age) {
            person.age = age;
            return this;
        }

        public Builder gender(String gender) {
            person.gender = gender;
            return this;
        }

        public Person build() {
            return person;
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
