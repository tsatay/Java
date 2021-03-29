import java.util.ArrayList;

public class BiologyClassroom implements Classroom {


    private String classroomName;
    private ArrayList<Student> students;

    public BiologyClassroom() {
         this.classroomName = "BioClassroom";
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
             students.add(student);
        return student.getFirstName()+" has been added in "+ this.getClassroomName();
    }

    @Override
    public String removeStudent(int id) {
        String removeMessage ="";
        int i= 0;
        while(i < students.size()){
            if(students.get(i).getStudentId() == id){
                  students.remove(i);
                  removeMessage = "Student with a specified id "+ id + " has removed from "+ this.getClassroomName();
                  return removeMessage;
            }
            else{
                removeMessage = "Student with a specified id " + id +" has not been registered in "+ this.getClassroomName();
            }
            i++;
        }
        return removeMessage;
    }
}
