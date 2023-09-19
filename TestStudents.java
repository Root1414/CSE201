public class TestStudents {
    public static void main(String[] args) {
        Student s1 = new Student("0000", "N/a", 0.00);
        Student s2 = new Student("0000", 0.00);
        Undergrad u1 = new Undergrad("0000", "N/a", 0.00, "N/a");
        Graduate g1 = new Graduate("0000", "N/a", 0.00, "N/a");
        ResearchStudent r1 = new ResearchStudent("2220009654", "Hamed Alanzi", 4.00, "Cyber Security : New ip protocols");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(u1);
        System.out.println(g1);
        System.out.println(r1);




    }
}