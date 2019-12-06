public class Student {
    private String name;
    private String studentNumber;

    public Student(String studentName, String studentNumber){
        this.name = studentName;
        this.studentNumber = studentNumber;
    }

    public String getName(){
        return this.name;
    }
    public String getStudentNumber(){
        return this.studentNumber;
    }
    public String toString(){
        return this.name + " (" + this.studentNumber + ")";
    }
}
