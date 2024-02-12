import java.util.ArrayList;



public class BlockSection {
    private String blockCode;
    private String description;
    private String adviser;
    private int totalStudents;
    private ArrayList<Student> studentList;




    public void setBlockCode(String blockCode) {
        this.blockCode = blockCode;
    }


    public void setDescription(String description) {
        this.description = description;
    }
    public void setStudentList(ArrayList<Student> studentList){
        this.studentList = studentList;
    }

    public void setAdviser(String adviser) {
        this.adviser = adviser;
    }

    public void setTotalStudents(int totalStudents) {
        this.totalStudents = totalStudents;
    }

    public String getBlockCode() {
        return blockCode;
    }

    public String getDescription() {
        return description;
    }

    public String getAdviser() {
        return adviser;
    }
    public int getTotalStudent() {
        return totalStudents;

    }


    public ArrayList<Student> getStudentList() {
        return studentList;
    }
public String toString(){
        String result = new String();
        for (Student student:studentList){
            result+="Block section code: "+ blockCode +"\t"+
                    "Description: "+description+"\t"+
                    "Adviser: "+ adviser+ "\n\n";
            result+=student;
        }
        return result;
}

}
