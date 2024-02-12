import java.util.List;

public class student {


    private String studentNumber;
    private String name;
    private String program;
    private int totalUnitsEnrolled;
    private List<Course> courseList;


    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setTotalUnitsEnrolled(int totalUnitsEnrolled) {
        this.totalUnitsEnrolled = totalUnitsEnrolled;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getName() {
        return name;
    }

    public String getProgram() {
        return program;
    }

    public int getTotalUnitsEnrolled() {
        return totalUnitsEnrolled;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public String toString() {
        String studentOutput = new String();
        studentOutput += "Student number: " + studentNumber + "\t" +
                "Student name: " + name + "\t" +
                "Program: " + program + "\t" +
                "Total unit enrolled: " + totalUnitsEnrolled + "\n";
        studentOutput += "\nCourse code\t" +
                         "Description\t" +
                         "Units\t" +
                         "Day\t"+
                         "Time\n";
        for(Course course: courseList){
            studentOutput += course;
        }
        studentOutput+="\n";
        return studentOutput;
    }
}

