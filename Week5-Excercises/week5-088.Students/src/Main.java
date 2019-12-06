
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Student pekka = new Student("Pekka Mikkola", "013141590");
//        System.out.println("name: " + pekka.getName());
//        System.out.println("studentnumber: " + pekka.getStudentNumber());
//        System.out.println(pekka);


        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        while (true){
            System.out.print("name: ");
            String name = reader.nextLine();
            if (name.equals("")){
                break;
            }else{
                System.out.print("studentnumber: ");
                String studentNumber = reader.nextLine();
                list.add(new Student(name,studentNumber));
            }
        }
        for (Student student:list) {
            System.out.println(student);
        }

        System.out.print("Give search term: ");
        String search = reader.nextLine();
        System.out.println("Result:");
        for (Student student:list){
            if (student.getName().contains(search)){
                System.out.print(student);
            }
        }

    }
}
