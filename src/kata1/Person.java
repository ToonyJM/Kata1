
package kata1;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private final String name;
    private final LocalDate birthdate;
    
    public String getName() {
        return name;
    }

    public LocalDate getBirhtdate() {
        return birthdate;
    }

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }
    
    public int getAge(){
        LocalDate today = LocalDate.now();
        return (int) Period.between(getBirhtdate(),today).getYears();       
    }
}
