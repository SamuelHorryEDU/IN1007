public class Singer {
    private String name;
    private int age;
    private boolean professional;

    public Singer(String name, int age) {
        this.name = name;
        this.age = age;
        professional = true;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getProfessional() {
        return professional;
    }

    public void setAge(int a) {
        if (age <= a) {
            this.age = a;
        }
    }

    public void reverseProfessional() {
        this.professional = !this.professional;
    }

    public boolean isAdult(){
        return this.age >= 18;
    }
}
