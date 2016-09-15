package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Cristian David Estupiñán Ojeda ", new Date(96,6,4));
        System.out.println(person.getName() + "tiene " + person.getAge() + " años.");
    }
}
