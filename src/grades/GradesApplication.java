package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

        Student adam = new Student("Adam");
        adam.addGrade(80);
        adam.addGrade(75);
        adam.addGrade(68);
//        System.out.println(adam.getName());
//        System.out.println(adam.getGrades());
//        System.out.println("adam.getGradeAverage() = " + adam.getGradeAverage());


        Student chel = new Student("Chel");
        chel.addGrade(80);
        chel.addGrade(90);
        chel.addGrade(95);


        Student jim = new Student("Jim");
        jim.addGrade(76);
        jim.addGrade(92);
        jim.addGrade(30);


        Student tony = new Student("Tony");
        tony.addGrade(76);
        tony.addGrade(92);
        tony.addGrade(30);

        HashMap<String, Student> students = new HashMap<>();

        students.put("AdamRulzz", adam);
        students.put("ChelCilverstein", chel);
        students.put("AdamDrullzz", jim);
        students.put("TtheTyger", tony);

        InterAction(students);

    }

    public static void InterAction(HashMap<String, Student> students) {
        boolean confirmation;

        do {
            System.out.printf("-ReportCard- %nHere are the current list of Student's usernames: %n --------------------%n");
            for (String i : students.keySet()) {
                System.out.println(i);
            }
            System.out.println("Please enter the Username for your child to see their grades: ");
            Input hallMonitor = new Input();
            String child = hallMonitor.getString();
            if (students.containsKey(child)) {
                System.out.printf("Name: " + students.get(child).getName() + "%nUsername: " + child + "%nCurrent Average: " + students.get(child).getGradeAverage() + "%n -------------------------%n");
            } else {
                System.out.printf("The username you entered is not present.%n");

            }
            System.out.println("Would You like to look up another child?:");
            confirmation = hallMonitor.yesNo();

        } while (confirmation);

        System.out.println("Goodbye and thank you for using -ReportCard-");
    }
}
