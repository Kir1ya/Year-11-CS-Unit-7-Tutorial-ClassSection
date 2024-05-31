import java.util.ArrayList;

public class ClassSection {

    private String subject;
    private int capacity;
    private int yearLevel;
    private ArrayList<Student> students;

    public ClassSection(String subject, int capacity, int yearLevel) {
        this.subject = subject;
        this.capacity = capacity;
        this.yearLevel = yearLevel;
        this.students = new ArrayList<>();
    }

    public ClassSection() {
        this.subject = "";
        this.capacity = 0;
        this.yearLevel = 0;
    }

    public String getSubject() {
        return subject;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = new ArrayList<>(students);
    }

    public void addStudent(Student student1) {
        if (!isStudentEnrolled(student1) && students.size() < capacity) {
            students.add(student1);
        }
    }

    public void removeStudent(Student student1) {
        students.remove(student1);
    }

    public boolean isStudentEnrolled(Student student1) {
        return students.contains(student1);
    }

    @Override
    public String toString() {
        return "ClassSection{" +
                "subject='" + subject + '\'' +
                ", capacity=" + capacity +
                ", yearLevel=" + yearLevel +
                ", students=" + students +
                '}';
    }
}