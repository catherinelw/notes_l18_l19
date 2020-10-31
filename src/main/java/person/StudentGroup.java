package person;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentGroup {
    private List<Student> studentList = new ArrayList<>();

    private Set<Student> studentSet = new HashSet<>();

    public void addStudent(Student student){
        studentList.add(student);
    }

    public void modifyStudent(int position, Student student){
        studentList.set(position, student);
    }
    public void printStudentList(){
//        for(Student student: studentList){
//            System.out.println(student.getFirstName());
//        }
        studentList.forEach(student -> {
            System.out.println(student.getFirstName());
        });
    }

    public void removeStudent(int position){
        studentList.remove(position);
    }
}
