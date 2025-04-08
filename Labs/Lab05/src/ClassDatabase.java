import java.util.ArrayList;

public class ClassDatabase {
    // ArrayList to store course names.
    private ArrayList<String> courses;
    // Parallel ArrayList to store, for each course, an ArrayList of student names.
    private ArrayList<ArrayList<String>> studentLists;

    public ClassDatabase() {
        courses = new ArrayList<>();
        studentLists = new ArrayList<>();
    }

    // Adds a student to a given course.
    public void addCourseStudent(String student, String course) {
        // Find the index of the course in the courses list.
        int index = courses.indexOf(course);
        if (index == -1) {
            // If the course does not exist, add it.
            courses.add(course);
            // Create a new list for the course's students.
            ArrayList<String> students = new ArrayList<>();
            students.add(student);
            studentLists.add(students);
        } else {
            // If the course exists, add the student to the corresponding list.
            ArrayList<String> students = studentLists.get(index);
            students.add(student);
        }
    }

    // Returns the number of students enrolled in the given course.
    public int countStudents(String course) {
        int index = courses.indexOf(course);
        if (index == -1) {
            return 0;
        }
        return studentLists.get(index).size();
    }

    public static void main(String[] args) {
        ClassDatabase db = new ClassDatabase();
        db.addCourseStudent("Alan Turing", "CITS2005");
        db.addCourseStudent("Alan Turing", "CITS2200");
        db.addCourseStudent("Max", "CITS9999");
        db.addCourseStudent("Gozz", "CITS9999");
        db.addCourseStudent("Jane Doe", "CITS2005");
        System.out.println("Students in CITS2005: " + db.countStudents("CITS2005"));
        System.out.println("Students in CITS2200: " + db.countStudents("CITS2200"));
        System.out.println("Students in CITS9999: " + db.countStudents("CITS9999"));
    }
}