public class course {
    String courseName;
    String regno;
    int studentsEnrolled;
    static int totalUniversityStudents = 0;

    public course(String name, int students) {
        this.courseName = name;
        this.studentsEnrolled = students;
        totalUniversityStudents += students;
    }

    public void enrollStudent() {
        this.studentsEnrolled++;
        totalUniversityStudents++;
        System.out.println(">> 1 student enrolled in " + courseName);
    }
}
