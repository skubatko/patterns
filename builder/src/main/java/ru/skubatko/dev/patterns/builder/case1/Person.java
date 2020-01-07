package ru.skubatko.dev.patterns.builder.case1;

public class Person {
    private final String name;
    private final String surname;
    private final String patronymic;
    private final String phone;
    private final String email;

    public Person(String name, String surname, String patronymic, String phone, String email ) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.phone = phone;
        this.email = email;
    }

    public static class PersonBuilder {
        private String name;
        private String surname;
        private String patronymic;
        private String phone;
        private String email;

        public PersonBuilder() {
        }

        public PersonBuilder setName( String name ) {
            this.name = name;
            return this;
        }

        public PersonBuilder setSurname( String surname ) {
            this.surname = surname;
            return this;
        }

        public PersonBuilder setPatronymic(String patronymic) {
            this.patronymic = patronymic;
            return this;
        }

        public PersonBuilder setPhone( String phone ) {
            this.phone = phone;
            return this;
        }

        public PersonBuilder setEmail( String email ) {
            this.email = email;
            return this;
        }

        public Person createPerson() {
            return new Person( name, surname, patronymic, phone, email );
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
