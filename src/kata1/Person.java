package kata1;

import java.util.Date;

public class Person {
    private final String name;
    private final Date birthdate;

    public Person(String name, Date bithdate) {
        this.name = name;
        this.birthdate = bithdate;
    }
    
    public String getName() {
        return name;
    }

    public Date getBithdate() {
        return birthdate;
    }
    
    public int getAge() {
        return (int) ((new Date().getTime() - birthdate.getTime())/31536000000L);
    }
    
    
}

