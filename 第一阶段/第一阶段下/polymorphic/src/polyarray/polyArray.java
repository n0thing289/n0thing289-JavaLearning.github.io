package polyarray;

public class polyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("jack", 20);
        persons[1] = new Student("mary", 20, 100);
        persons[2] = new Student("smith", 20, 10);
        persons[3] = new Teacher("joey", 20, 10000);
        persons[4] = new Teacher("monica", 20, 20000);

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say());
            if (persons[i] instanceof Student) {
                ((Student) persons[i]).study();
            } else if (persons[i] instanceof Teacher) {
                ((Teacher) persons[i]).teach();

            } else if (persons[i] instanceof Person) {
//                System.out.println("你的类型有误");
            } else {
                System.out.println("你的类型有误");
            }
        }
    }
}
