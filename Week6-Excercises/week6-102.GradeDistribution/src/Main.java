import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        // 42, 61, 15, -2, -1
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter

        ArrayList<Integer> gradesList = getGrades(lukija);
        ArrayList<Integer> grades = gradePoints(gradesList);
        print(grades);

        ArrayList<Integer> afterremove = removeAllScores(gradesList);
        //System.out.println(afterremove);
        System.out.println("Acceptance percentage: " + (100 * accepted(grades)) / (double)afterremove.size());
        //System.out.println(removeAllScores(gradesList));
        //System.out.println(accepted(grades));

    }

    public static ArrayList<Integer> getGrades(Scanner scanner){
        ArrayList<Integer> gradesList = new ArrayList<Integer>();
        System.out.println("Type exam scores, -1 completes:");
        while (true){
            Integer input = Integer.parseInt(scanner.nextLine());
            if (input == -1){
                break;
            }else {
                gradesList.add(input);
            }
        }
        return gradesList;
    }

    public static ArrayList<Integer> gradePoints(ArrayList<Integer> gradesList){
        ArrayList<Integer> grades = new ArrayList<Integer>();
        for (Integer score:gradesList) {
            if (score > 60 || score < 0){
                continue;
            } else if (score >= 50){
                grades.add(5);
            }else if (score>=45 && score<=49){
                grades.add(4);
            }
            else if (score >= 40 && score<= 44){
                grades.add(3);
            }else if (score >= 35 && score<= 39){
                grades.add(2);
            }else if (score >= 30 && score<= 34){
                grades.add(1);
            }
            else {
                grades.add(0);
            }
        }
        return grades;
    }

    public static void print(ArrayList<Integer> grades){
        System.out.println("Grade distribution");

        for (int i = 5; i >= 0; i--){
            System.out.print(i + ": ");
            for (Integer grade:grades) {
                if (grade == i){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static Integer accepted(ArrayList<Integer> grades){
        int accepted = 0;
        for (Integer grade: grades) {
            if (grade != 0){
                accepted++;
            }
        }
        return accepted;
    }

    public static ArrayList<Integer> removeAllScores(ArrayList<Integer> gradesList){
        ArrayList<Integer> removed = new ArrayList<Integer>();
        for (int i = 0; i < gradesList.size(); i++){
            Integer element = gradesList.get(i);
            if (element <= 60 && element >= 0){
                removed.add(element);
            }
        }
        return removed;
    }


}
