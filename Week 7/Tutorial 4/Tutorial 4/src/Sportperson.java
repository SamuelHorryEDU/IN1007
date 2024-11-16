public class Sportperson {
    String name;
    String sport;
    private int age;

    public int getAge() {
        return age;
    }

    public void updateAge(int age){
        this.age = age + 1;
    }

    public Sportperson(String name, String sport, int age){
        this.name = name;
        this.sport = sport;
        this.age = 0;
    }
}
