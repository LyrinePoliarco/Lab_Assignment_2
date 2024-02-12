public class COMReportVersion2 {

    public static void main(String[] args) {


        for (BlockSection blockSection : getBlockSectionList()) {
            System.out.println("Block section code: " + blockSection.getBlockCode());
            System.out.println("Description: " + blockSection.getDescription());
            System.out.println("Adviser: " + blockSection.getAdviser());
            System.out.println("Total Students: " + blockSection.getTotalStudent());

            for (Student student : blockSection.getStudentList()) {
                System.out.println("\tStudent number: " + student.getStudentNumber());
                System.out.println("\tStudent name: " + student.getName());
                System.out.println("\tProgram: " + student.getProgram());
                System.out.println("\tTotal units enrolled: " + student.getTotalUnitsEnrolled());

                System.out.println("\tCourse code\tDescription\tUnits\tDay\tTime");

                for (Course course : student.getCourseList()) {
                    System.out.println("\t" + course.getCourseCode() + "\t" +
                            course.getDescription() + "\t" +
                            course.getUnit() + "\t" +
                            course.getDay() + "\t" +
                            course.getTime());
                }

                System.out.println(); // Blank line between students
            }

            System.out.println(); // Blank line between block sections
        }
    }

    private static BlockSection[] getBlockSectionList() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBlockSectionList'");
    }
}
