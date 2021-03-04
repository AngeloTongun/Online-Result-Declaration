package com.example.aidls;

public class StudentData {
    private  String studentName, studentID, studentClass, studentDept, studentCollege;
    private  String code, course, Grade;
    private  double GPA, CGPA, SGPA, Marks, gradePoint;
    private int semester, CH;
    private String Result;
    public StudentData() {

    }

    public StudentData(String code, String course, float marks, int CH,int semester) {
        this.code = code;
        this.course = course;
        this.Marks = marks;
        this.CH = CH;
        this.semester=semester;
    }

    public StudentData( String code, String course, String grade, double marks, double gradePoint, int semester, int CH) {
        this.code = code;
        this.course = course;
        Grade = grade;
        Marks = marks;
        this.gradePoint = gradePoint;
        this.semester = semester;
        this.CH = CH;
    }



    public StudentData(String studentName, String studentID, String studentClass, String studentDept, String studentCollege) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.studentClass = studentClass;
        this.studentDept = studentDept;
        this.studentCollege = studentCollege;
    }

    public String getResult() {
        return Result;
    }

    public void setResult(String result) {
        Result = result;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getStudentDept() {
        return studentDept;
    }

    public void setStudentDept(String studentDept) {
        this.studentDept = studentDept;
    }

    public String getStudentCollege() {
        return studentCollege;
    }

    public void setStudentCollege(String studentCollege) {
        this.studentCollege = studentCollege;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public double getSGPA() {
        return SGPA;
    }

    public void setSGPA(double SGPA) {
        this.SGPA = SGPA;
    }

    public double getMarks() {
        return Marks;
    }

    public void setMarks(double marks) {
        Marks = marks;
    }

    public double getGradePoint() {
        return gradePoint;
    }

    public void setGradePoint(double gradePoint) {
        this.gradePoint = gradePoint;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getCH() {
        return CH;
    }

    public void setCH(int CH) {
        this.CH = CH;
    }
}
