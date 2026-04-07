package construct;

public class Member {

    String name;
    int age;
    int grade;

    Member(String name, int age) {
        this(name, age, 0);
    }


    Member(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
