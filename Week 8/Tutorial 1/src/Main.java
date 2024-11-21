public class Main {
    public static void main(String[] args) {
        Singer chris = new Singer("Chris", 34);
        Singer maria = new Singer("Maria", 30);
        Singer sam = new Singer("Sam", 20);
        Singer jess = new Singer("Jess", 18);

        Duet d1 = new Duet(chris,maria);
        Duet d2 = new Duet(sam,jess);

        Quatuor band  = new Quatuor(d1,d2);

        System.out.println("Age: " + band.getDuet2().getSinger1().getAge());
    }
}