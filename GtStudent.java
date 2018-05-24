public class GtStudent implements Comparable<GtStudent> {
    private String name;
    private String major;
    private double gpa;
    private String year;
    public GtStudent(String name,String major, double gpa, String year) {
        this.name = name;
        this.major = major;
        this.gpa = gpa;
        this.year = year;
}
    public GtStudent(){
        this.name = "Student";
        this.name = "name";
        this.gpa = 4.0;
        this.year = "FreshMan";
    }
    public String getName() {
        return this.name;
    }
    @Override
    public int compareTo(GtStudent other) {
        return (int) (this.gpa * 10 - other.gpa * 10);
    }
    @Override
    public boolean equals(Object o) {
        if (o == null) {return false;}
        if (this == o) {return true;}
        if (!(o instanceof GtStudent)) {return false;}
        GtStudent that = (GtStudent) o;
        return this.name.equals(that.name) && this.major.equals(that.major) &&
        this.gpa == that.gpa && this.year.equals(that.year);
    }
    @Override
    public String toString() {
        return this.major + " major named: " + this.name + " with a " + this.gpa + " gpa.";
    }
}