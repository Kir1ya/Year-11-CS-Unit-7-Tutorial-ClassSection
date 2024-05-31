public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private int yearLevel;
    static int studentCount;

    public Student (String firstName, String lastName, int age, int yearLevel){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.yearLevel = yearLevel;
    }

    public Student () {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.yearLevel = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public boolean equals(Student student1) {
        if (firstName.equals(student1.firstName) && lastName.equals(student1.lastName) && age == student1.age && yearLevel == student1.yearLevel) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Student{" + "firstName='" + firstName + ", lastName='" + lastName + ", age=" + age + ", yearLevel=" + yearLevel + '}';
    }
}
