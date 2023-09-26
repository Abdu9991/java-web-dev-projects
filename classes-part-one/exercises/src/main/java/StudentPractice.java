public class StudentPractice {
    public static void main(String[] args){
        //insantiate your Student class below
        Student student = new Student("Abdulrazig Mohammed", 1234456, 1,4.0);
       System.out.println(student.studentInfo());
       Teacher teacher = new Teacher("Adam","Ahamed","Math",3);
        System.out.println(teacher.teacherInfo());
    }
}
