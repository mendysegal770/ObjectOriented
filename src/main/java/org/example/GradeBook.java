package org.example;

public class GradeBook {
    private  Student topStudent;

    @Override
    public String toString() {
        return "GradeBook{" +
                "topStudent=" + topStudent.getCoursesGrades() +
                '}';
    }

    public void updateTopStudent(Student student){
        this.topStudent=student;
    }

    public Student getTopStudent() {
        return topStudent;
    }

}

