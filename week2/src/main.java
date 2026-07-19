public class main {
    public static void main(String[] args) {
        course math = new course("Math", 20);
        course science = new course("Physics", 30);
        course history = new course("History", 25);

        System.out.println("--- Initial Course Stats ---");
        math.displayCourseInfo();
        science.displayCourseInfo();
        history.displayCourseInfo();

        System.out.println("\n--- Initial University Stats ---");
        System.out.println("Total students in university: " + course.totalUniversityStudents);

        System.out.println("\n--- Actions ---");
        math.enrollStudents();

    }



}
