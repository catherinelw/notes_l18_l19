package person;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Group<T extends Person> {
    private List<T> personGroup = new ArrayList<>();
    public T add(T person){
        personGroup.add(person);
        System.out.println(person);
        return person;
    }

    public class Group1<T extends Person>{

        //规定main在执行这里的时候只能是person的子类（student and teacher）或person
//        就可以在这里system print in （person.getFirstName）了， 上面的就不行 因为非常generic（范型）

    }

}
