import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import java.util.Scanner;

public class StudentDA {
    private ArrayList<Student> studentList;


    public StudentDA() throws FileNotFoundException {
        //read Student Info

        Scanner studentInfo = new Scanner(
                new FileReader("studentInfo.csv"));
        studentList = new ArrayList<Student>();
        while (studentInfo.hasNext()) {
            String rowStudent = new String();
             rowStudent = studentInfo.nextLine();

             String[]rowStudentSpecific = new String[4];
            rowStudentSpecific = rowStudent.split(",");

            Student student = new Student();

            student.setStudentNumber(rowStudentSpecific[0].trim());
            student.setName(rowStudentSpecific[1].trim());
            student.setProgram(rowStudentSpecific[2].trim());
            student.setTotalUnitsEnrolled(Integer.parseInt(rowStudentSpecific[3].trim()));

           CourseDA courseDA = new CourseDA((student.getStudentNumber()));
           student.setCourseList((courseDA.getCourseList()));
            studentList.add(student);
            }

        studentInfo.close();
        }

      public ArrayList<Student>getStudentList(){
        return studentList;
    }
}

