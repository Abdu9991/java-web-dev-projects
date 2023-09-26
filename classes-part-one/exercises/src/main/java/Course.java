import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudent;

    public Course(String topic, Teacher instructor, ArrayList<Student> enrolledStudent) {
        this.topic = topic;
        this.instructor = instructor;
        this.enrolledStudent = enrolledStudent;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    public ArrayList<Student> getEnrolledStudent() {
        return enrolledStudent;
    }

    public void setEnrolledStudent(ArrayList<Student> enrolledStudent) {
        this.enrolledStudent = enrolledStudent;
    }
}
