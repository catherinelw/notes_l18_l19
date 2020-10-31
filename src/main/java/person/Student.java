package person;

public class Student extends Person {
    private String studentId;

    public String getStudentId() {
        return studentId;
    }


    public Student (String firstName, String studentId){
        super(firstName);
        this.studentId = studentId;
}

public void run(){
    this.breathe();
    Person cat = new Person("lala");
    cat.breathe();

}
@Override
public  void  walk(){
        super.walk();
        super.breathe();

//      or this.breathe();
//      or breathe();
    System.out.println("student walk");
}
}
