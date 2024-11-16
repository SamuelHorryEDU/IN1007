public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("ford", 155, 125000);
        Car car2 = new Car("Audi", 165, 40000);

        car2.updateSpeed(140);
        car2.updateMiles(140000);

        System.out.println(car1.getSpeed());
        System.out.println(car1.getMiles());
        System.out.println(car2.getSpeed());
        System.out.println(car2.getMiles());

        Sportperson s1 = new Sportperson("Jack","Swimming",25);

        s1.updateAge(30);

        System.out.println(s1.name);
        System.out.println(s1.sport);
        System.out.println(s1.getAge());
    }
}