package temp;

public class Work01 {
    public static void main(String[] args) {
        Student student = new Student(123, "jack", 205104010, "计算机");
        Teacher teacher = new Teacher(321, "milan", 123, "国一");

        student.printInfo();
        System.out.println("============");
        teacher.printInfo();
    }
}

class Citizen {
    private int personID;
    private String name;

    public Citizen(int personID, String name) {
        this.personID = personID;
        this.name = name;
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "personID=" + personID +
                ", name='" + name + '\'' +
                '}';
    }
}

class Student extends Citizen {
    private int studentID;
    private String major;

    public Student(int personID, String name, int studentID, String major) {
        super(personID, name);
        this.studentID = studentID;
        this.major = major;
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", major='" + major + '\'' +
                '}';
    }
}

class Teacher extends Citizen {
    private int teacherID;
    private String title;

    public Teacher(int personID, String name, int teacherID, String title) {
        super(personID, name);
        this.teacherID = teacherID;
        this.title = title;
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID=" + teacherID +
                ", title='" + title + '\'' +
                '}';
    }

}