package lab1;

public class StudentsInfo {
    public static void main(String[] args) {

        Students student1 = new Students();
        student1.name = "Darus Slah";
        student1.age = 24;
        student1.letterGrade = "B+";

        student1.printStudentInfo();

        Students student2 = new Students();
        student2.name = "Sasha Serrano";
        student2.age = 23;
        student2.letterGrade = "A+";

        student2.printStudentInfo();
    }
}
