package person;

public class Person {
    private String firstName;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    private String lastName;
    private int age;
    private String gender;

    public void setGender(String gender){
        this.gender = gender;
    }


    public Person(){

    }
    public Person(String firstName){
        this.firstName = firstName;
    }

    public Person(String firstName, String lastName){
        this(firstName);
        this.lastName = lastName;

    }

    public Person(String firstName, String lastName, int age){
        this(firstName, lastName);
        this.age = age;
    }
    public Person(String firstName, String lastName, String gender){
        this(firstName, lastName);
        this.gender = gender;
    }
    public void walk(){
        System.out.println("walking");
    }
    public void breathe(){
        this.walk();
        System.out.println("breathe");
    }

}
