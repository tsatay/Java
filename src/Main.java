import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Student student1 = new Student("Ted","Sata",101);
        Student student2 = new Student("Hen","Abay",102);
        Student student3 = new Student("Fev","Haile",103);
        Student student4 = new Student("Fred","Niamar",104);
        Student student5 = new Student("Ronaldo","Christiano",105);
//        ArrayList<Student> students = new ArrayList<Student>();
//         students.add(student1);
        // students.add(student2);
        // students.add(student3);


         ChemistryClassroom chemClass = new ChemistryClassroom( );
        System.out.println(chemClass.addStudent(student1));
        System.out.println(chemClass.addStudent(student2));
        System.out.println(chemClass.addStudent(student3));
        System.out.println(chemClass.addStudent(student4));
        System.out.println(chemClass.addStudent(student5));
        System.out.println("--------------------------------------");
        BiologyClassroom bioClass = new BiologyClassroom();
        System.out.println(bioClass.addStudent(student1));
        System.out.println(bioClass.addStudent(student2));
        System.out.println(bioClass.addStudent(student3));
        System.out.println(bioClass.addStudent(student4));
        System.out.println(bioClass.addStudent(student5));
        System.out.println("----------------------------------------");
        EnglishClassroom engClass = new EnglishClassroom();
        System.out.println(engClass.addStudent(student1));
        System.out.println(engClass.addStudent(student2));
        System.out.println(engClass.addStudent(student3));
        System.out.println(engClass.addStudent(student4));
        System.out.println(engClass.addStudent(student5));

        System.out.println("------------Chem-------------------------------");
        System.out.println(chemClass.getStudents());
        System.out.println("------------Bio----------------------------");
        System.out.println(bioClass.getStudents());
        System.out.println("------------Eng----------------------------");
        System.out.println(engClass.getStudents());
        System.out.println("------------Removing From Chem-------------------------------");
        System.out.println(chemClass.removeStudent(104));
        System.out.println("------------New Chem's classroom List-------------------------------");
        System.out.println(chemClass.getStudents());
        System.out.println("------------Removing From Bio-------------------------------");
        System.out.println(bioClass.removeStudent(104));
        System.out.println("------------New Bio's classroom List-------------------------------");
        System.out.println(bioClass.getStudents());
        System.out.println("------------Removing From Eng-------------------------------");
        System.out.println(engClass.removeStudent(104));
        System.out.println("------------New Eng's classroom List-------------------------------");
        System.out.println(engClass.getStudents());



    }
}
