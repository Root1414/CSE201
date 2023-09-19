public class ResearchStudent extends Student {
    private String researchTopic;
    public ResearchStudent(String id, String name, double gpa, String researchTopic) {
        super(id, name, gpa);
        this.researchTopic = researchTopic;
    }

    public String getresearchTopic() {
        return researchTopic;
    }
    public void setresearchTopic(String newresearchTopic) {
        this.researchTopic = newresearchTopic;
    }

    public String toString(){
        return " ResearchStudent " +super.toString()+"\n\t ResearchTopic: "+researchTopic;
    }

}


