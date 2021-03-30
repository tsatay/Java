public class Admin extends User {
    private int ptoDays = 20;

    public Admin(String firstName, String lastName, String email, int absences) {
        super(firstName, lastName, email, absences);
    }

    @Override
    public void absentDays(int absentDay) {
        String message;
        ptoDays = ptoDays - absentDay;
        this.setAbsences(absentDay);
        System.out.println("You have "+ ptoDays+" ptoDays left after you take "
                + absentDay+" days-off from work.");

    }
}
