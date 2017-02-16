package labWork_2_2_4c;

/**
 * Created by Bulik on 14.07.2016.
 */
public class Main {
    public static void main(String[] args) {
        Person person= new Person();
        person.set("Igor", "Nikonov");
        person.view();
        person.set("Lena", 23);
        person.view();
        person.set("Sveta", "Volkova","femele", 33, 123456789);
        person.view();
        person.set(45, "Egorov");
        person.view();
        person.set(55, 80070011);
        person.view();
    }
}
