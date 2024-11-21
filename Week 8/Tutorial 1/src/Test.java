public class Test {
    public static void main(String[] args) {
        Singer singer1 = new Singer("Chris", 34);
        Singer singer2 = new Singer("Maria", 30);

        Duet d1 = new Duet(singer1,singer2);
        System.out.println(singer1.getName());
        System.out.println(singer1.isAdult());
        System.out.println(singer2.getName());
        System.out.println(singer2.isAdult());

        System.out.println(d1.bothProfessional());
    }
}
