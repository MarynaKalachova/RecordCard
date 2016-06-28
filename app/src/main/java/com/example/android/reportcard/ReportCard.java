package com.example.android.reportcard;

public class ReportCard {


    private char grade;
    private String courseName;
    private double courseCredit;


    ReportCard(String courseName, double courseCredit, char grade){
        this.courseName = courseName;
        this.courseCredit = courseCredit;
        this.grade = grade;
    }

    public double getCourseCredit() {
        return courseCredit;
    }

    public String getCourseName(){
        return courseName;
    }

    public char getGrade(){
        return grade;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public void setGrade(char grade){
        this.grade = grade;
    }

    public void setcourseCredit (double courseCredit){
        this.courseCredit = courseCredit;
    }

    @Override
    public String toString() {
        return courseName + '\n' +
               grade + '\n' +
               courseCredit + '\n';
    }
}
