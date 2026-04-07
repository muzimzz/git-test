package class1;

public class StudentMain {
    public static void main(String args[]) {
        Student student1;
        student1 = new Student();
        student1.name = "Kim";
        student1.age = 15;
        student1.grade = 80;


//      Student student2;
//      student2 = new Student();
        Student student2 = new Student();
        student2.name = "Lee";
        student2.age = 17;
        student2.grade = 95;

//        Student[] students = new Student[2];
//        students[0] = student1;
//        students[1] = student2;

        Student[] students = new Student[] {student1, student2};

//        for (int i = 0; i < students.length ; i++) {
//            System.out.println(students[i].name + "\n" + students[i].age + "\n" + students[i].grade);
//        }
//
//        for (int i = 0; i < students.length ; i++) {
//            Student s = students[i];
//            System.out.println(s.name + "\n" + s.age + "\n" + s.grade);
//        }

        for (Student s : students) {
            System.out.println(s.name + "\n" + s.age + "\n" + s.grade);
        }

        int a = 5, b = 0;
        b = a;
        a = 3;
        System.out.println(a + " " + b);    // 값을 복사해서 대입

        student2.age = student1.age;
        student1.age = 20;
        System.out.println(student1.age + " " + student1.age);  // 참조값을 복사해서 대입


    }
}
