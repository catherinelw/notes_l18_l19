import jdk.swing.interop.SwingInterOpUtils;
import person.Group;
import person.Person;
import person.Student;
import person.Teacher;

import java.util.*;
import java.util.function.Function;

public class Main {
    //最后一个知识点，关于function，需传入连个参数，T and R, 一个input， 一个output，我们自己要写function也是函数式编程，java8以上 越来越多
//
//    static Function<Person, String> fetchPersonName = (Person person) -> {
//        return person.getFirstName();
//    };
    public static void main(String[] args) {
//        String returnedValue = fetchPersonName.apply(new Person("lily"));
//        System.out.println(returnedValue);
//        for(int i =0; i<5; i++){
//            System.out.println(i);
//        }

//        int[] arrInt = new int[]{1,2,3,4,5};
//        for (int i : arrInt){
//            System.out.println(i);
//        }

//        int count = 0;
//        while( count!=6){
//            System.out.println(count);
//            count++;
//        }
//        do{
//            System.out.println(count);
//            count++;
//        }while(count!=3);
//        String numberStr = "32";
//        int result = Integer.valueOf(numberStr);
//        int result1 = Integer.parseInt(numberStr);
//        String doubleStr = "34";
//        double s = Double.parseDouble(doubleStr);
//        System.out.println(s);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter your name" );
//        String enteredName = scanner.nextLine();
//        System.out.println(enteredName);

        Person person = new Person();
        person.setFirstName("oo");
        System.out.println(person.getFirstName());
//
//
//        Student student = new Student(
//                "12","j","j"
//        );
//
//        student.walk();
//        student.getStudentId();
//        System.out.println(student.getFirstName());
//
//        //Person 是 parent class, student 是sub class, polymorphism的应用
//        Person person1 = new Student(
//                "0","j","j"
//        );

//
//        Group<Student> studentGroup = new Group<>();
//        studentGroup.add(new Student());
//        Group<Teacher> teacherGroup = new Group<>();
//        teacherGroup.add(new Teacher());

        //上面的好处就是 Group里 我们只规定 <T> 但这里它自动提醒add后面要加 student group,
        //和 List<Person> person = new ArrayList<>(); 非常像，这也就是generic type 范型的运用


//        Person person2 = new Teacher();
//
//        List<Person> personList = List.of(
//                person1,
//                person2
//        );
//        for (Person person: personList){
//            person.walk();
//        }
//
//        List<Person> personList = List.of(
//                new Person("j","k"),
//                new Person("g","c"),
//                new Person("t","y")
//        );

//        Comparator comparator = new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge() > o2.getAge();
//            }
//        };错的！老师想展示old school 方法 但没写出来
//
//        Collections.sort(personList, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge() > o2.getAge()? 1: -1 ;
//            }
//        });

        //比上面传anonymous简单一些，传箭头函数就好
//        Collections.sort(personList, (Person p1, Person p2) -> p1.getFirstName().compareTo((p2.getFirstName())));
//        for (Person person:personList){
//            System.out.println(person.getFirstName());
//        }
    }
}
