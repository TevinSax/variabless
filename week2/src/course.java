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
        System.out.println("Student enrolled " + courseName);
    }
    public void showPassPercentage(int studentsPassed) {
        double percentage = ((double) studentsPassed / this.studentsEnrolled) * 100;
    }

    public void displayCourseInfo() {
        System.out.println("Course: " + courseName + " | Enrolled: " + studentsEnrolled);
    }
}

}
