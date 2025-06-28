package Section_7;

public class ObjectMain extends Object {

    public static void main(String[] args) {

        Student max = new Student("Asha", 12);
        System.out.println(max);

        PrimarySchoolStudent sam = new PrimarySchoolStudent("Sam", 4,
                "Den");
        System.out.println(sam);
    }
}

class Student {

    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }

    @Override
    public String toString() {
        return name + " is " + age;
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}

class PrimarySchoolStudent extends Student {

    private String parentName;

    PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid, " + super.toString();
    }
}

