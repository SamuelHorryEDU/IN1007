public class Main {
    public static void main(String[] args) {
        Student me = new Student(18,1, "Me");
        Student you = new Student(21,3, "You");

        Classroom in1007 = new Classroom(450,me);
        Classroom in1013 = new Classroom(450,you);

        me.setAge(24);

        System.out.println(in1013.getRepAge());

        Student.amount_saved = 500;
        //System.out.println(Student.amount_saved);

        me.printDetails();
        you.printDetails();
    }
}