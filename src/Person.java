public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
    }
}
