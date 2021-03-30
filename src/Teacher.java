public class Teacher extends User{
  private int ptoDay = 10;

    public Teacher(String firstName, String lastName, String email, int absences) {
        super(firstName, lastName, email, absences);
    }



    @Override
    public void absentDays(int absentDay) {
        String message;
        ptoDay = ptoDay - absentDay;
        //Setting the total number absences day for Teacher
        this.setAbsences(absentDay);
        System.out.println("You have "+ptoDay+" ptoDay left after you take "+ absentDay +" day-off from work");
    }
}
