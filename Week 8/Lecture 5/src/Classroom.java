public class Classroom {
    private int class_size;
    private Student classrep;

    public Classroom(int class_size, Student classrep) {
        this.class_size = class_size;
        this.classrep = classrep;
    }

    public int getClass_size() {
        return class_size;
    }
    public void setClass_size(int class_size) {
        this.class_size = class_size;
    }

    public int getRepAge(){
        return classrep.getAge();
    }

    public void setRepAge(int age){
        classrep.setAge(age);
    }
}
