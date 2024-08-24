import Index.Persons.Person;
public class App {
    public static void main(String[] args) {
        Person p = new Person();
        p.birthDate.setDay(20);
        p.birthDate.setMonth(12);
        p.birthDate.setDay(2000);
        p.calAge();
    }
}
