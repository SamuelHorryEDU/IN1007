public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.setID(1);
        s1.setName("Sam");
        s2.setID(2);
        s2.setName("Jimmy");

        //System.out.println(s1.getName());
        //System.out.println(s2.getName());
        //System.out.println(s1.getID());
        //System.out.println(s2.getID());

        Film f1 = new Film("name", 1998, 120);

        f1.soldTickets(1000);
        System.out.println(f1.getSoldTickets());
    }
}