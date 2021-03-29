import java.util.ArrayList;
import java.util.Collections;

public class ChemistryClassroom implements Classroom
{
    private String classroomName;
    private ArrayList<Student> students;


   public ChemistryClassroom( ) {

       classroomName = "ChemClassroom";
       students = new ArrayList<Student>();

    }



    public String getClassroomName() {
        return classroomName;
    }

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String addStudent(Student student) {
           students.add( student);
       return student.getFirstName() + " has been added in "+ this.getClassroomName();

    }

    @Override
    public String removeStudent(int id) {
          String removeMessage="";
           int i=0;
           while(i < students.size()) {
               if (students.get(i).getStudentId() == id) {
                   students.remove(i);
                    removeMessage = "Student with id number " + id + " has been removed from " + this.getClassroomName();
                   return removeMessage;
               } else {
                   removeMessage = "Student with specified id " + id + " has not been registered in "+ this.getClassroomName();
               }
               i++;
           }

        return removeMessage ;
    }
}
