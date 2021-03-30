public class Main {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Tony","Alem","jeboa@gmail.com",0);
        Admin admin = new Admin("David","Gizaw","tsegayeg@gmail.com",0);

        teacher.absentDays(2);
        System.out.println("----------Teacher------------");
        System.out.println(teacher.getAbsences());

        System.out.println("-------------2 Time absent for teacher-----------------");

        teacher.absentDays(4);
        System.out.println("----------------------");
        System.out.println(teacher.getAbsences());

        System.out.println("----------Admin------------");
        admin.absentDays(4);
        System.out.println("----------------------");
        System.out.println(admin.getAbsences());


        System.out.println("----------2 time absent for Admin------------");
        admin.absentDays(17);
        System.out.println("----------------------");
        System.out.println(admin.getAbsences());

    }
}
