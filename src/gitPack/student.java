package gitPack;

public class student {
    private int studentID;
    private String studentName;

    public student(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    private void calculateGPA(){
        System.out.println("This is a private Method to calculate the GPA");
    }
    protected void calculate_proGPA(){
        System.out.println("This is a protected Method  to calculate  the GPA");
    }
    public void calculate_pubGPA(){
        System.out.println("This is a public  Method  to calculate  the GPA");
    }
}
