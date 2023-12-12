public class StudentMarks {
    private int[] marksArray;

    public StudentMarks() {
        marksArray = new int[5];
    }

    public void storeMarks(int[] marks) {
        if (marks.length == 5) {
            System.arraycopy(marks, 0, marksArray, 0, 5);
            System.out.println("Marks stored successfully.");
        } else {
            System.out.println("Invalid number of subjects. Please provide marks for all 5 subjects.");
        }
    }

    public void displayMarks() {
        System.out.println("Student Marks:");
        int subjectNumber = 1;
        for (int mark : marksArray) {
            System.out.println("Subject " + subjectNumber + ": " + mark);
            subjectNumber++;
        }
    }

    public static void main(String[] args) {
        StudentMarks student = new StudentMarks();

        int[] subjectMarks = {90, 85, 75, 92, 88};
        student.storeMarks(subjectMarks);
        
        student.displayMarks();
    }
}
