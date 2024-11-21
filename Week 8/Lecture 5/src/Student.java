public class Student{
    private int age;
    private int year_group;
    String name;
    static int amount_saved = 0;

    public Student(){
        this.age = 0;
        this.year_group = 0;
        this.name = "";
    }

    public Student(int a, int b, String c){
        this();
        age = a;
        year_group = b;
        name = c;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getYear_group(){
        return year_group;
    }

    public void setYear_group(int year_group){
        this.year_group = year_group;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void printDetails(){
        System.out.println("Age: " + getAge());
        System.out.println("Year Group: " + getYear_group());
        System.out.println("Name: " + getName());
    }
}
