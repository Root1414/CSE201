public class Undergrad extends Student {
    private String year;
    public Undergrad(String id, String name, Double gpa, String year) {
        super(id, name, gpa);
        this.year = year;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String newYear) {
        this.year = newYear;
    }
    public String toString() {
        return "Undergraduate "+super.toString()+"\n\t Year: "+year;
    }
}
