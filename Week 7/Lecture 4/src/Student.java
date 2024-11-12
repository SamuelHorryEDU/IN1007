public class Student {
    private String name;
    private int id;

    public Student(){
        this.name = "";
        this.id = 0;
    }

    public int getID() {
        return id;
    }
    public void setID(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}