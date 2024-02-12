public class Course {

    private String courseCode;
    private String description;
    private int unit;
    private String day;
    private String time;



    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getDescription() {
        return description;
    }

    public int getUnit() {
        return unit;
    }

    public String getDay() {
        return day;
    }

    public String getTime() {
        return time;
    }
    public String toString(){
        String courseOutput = new String();
        courseOutput+= "Course code" + "\t"+ courseCode+
                "Description" + description+ "\t"+ "Units"+ unit+"\t"+
                "Day"+day+"\t"+"Time"+time+"\t";
        return courseOutput;
    }
}
