public class Student {
    private String name;
    private String id;
    private double gpa;

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }
    public Student(String id, double gpa){
        this(id, "", gpa);
    }
    public String getName(){
        return name;
    }
    public String getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public String toString(){

        return "Student:\n\t ID: "+id+"\n\t Name: "+name+"\n\t GPA: "+gpa;
    }
}