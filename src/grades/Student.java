package grades;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public List<Integer> getGrades() {
        return this.grades;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        int count = 0;
        double totalGrade = 0;
        for ( int grade : grades){
            totalGrade += grade;
            count++;
        }
        return totalGrade / count;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }
}
