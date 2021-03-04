package com.example.aidls;

import android.util.Log;

import java.util.ArrayList;

public class StudentController {
    protected ArrayList<StudentData> getAllStudentResultGrade(ArrayList<StudentData> getStudent_List) {
        ArrayList<StudentData> studentList = new ArrayList<StudentData>();
        String Grade;
        double gradePoint = 0.0;
        try {
            for (StudentData get_All_Marks : getStudent_List) {
                StudentData studentData;
                if (get_All_Marks.getMarks() <= 100 && get_All_Marks.getMarks() >= 80) {
                    Grade = "A";
                    gradePoint = 4.0;
                } else if (get_All_Marks.getMarks() < 80 && get_All_Marks.getMarks() >= 70) {
                    Grade = "+B";
                    gradePoint = 3.5;
                } else if (get_All_Marks.getMarks() < 70 && get_All_Marks.getMarks() >= 60) {
                    Grade = "B";
                    gradePoint = 3.0;
                } else if (get_All_Marks.getMarks() < 60 && get_All_Marks.getMarks() >= 55) {
                    Grade = "+C";
                    gradePoint = 2.5;
                } else if (get_All_Marks.getMarks() < 55 && get_All_Marks.getMarks() >= 50) {
                    Grade = "C";
                    gradePoint = 2.0;
                } else if (get_All_Marks.getMarks() < 50 && get_All_Marks.getMarks() >= 55) {
                    Grade = "D";
                    gradePoint = 1.5;
                } else {
                    Grade = "F";
                    gradePoint = 0.0;
                }

                studentData = new StudentData(get_All_Marks.getCode(), get_All_Marks.getCourse(), Grade, get_All_Marks.getMarks(), gradePoint, get_All_Marks.getSemester(), get_All_Marks.getCH());
                studentList.add(studentData);
            }
        } catch (Exception exception) {
            Log.d(" Model Error", exception.getMessage());
        }
        return studentList;
    }

    protected StudentData SetGradePointsAverages(ArrayList<StudentData> getStudent_List, String StudentClass) {
        StudentData setGradePoints = new StudentData();
        double CGPA = 0.0, GPA = 0.0,  GP = 0.0, CCH = 0.0, CGP = 0.0, CH = 0.0;
        int setAcadimicYear = getAcademicYear(StudentClass);
        try {
            for (StudentData setGrades : getStudent_List) {

                CCH += setGrades.getCH();
                CGP += (setGrades.getCH()*setGrades.getGradePoint());
                if((setGrades.getSemester()==setAcadimicYear + setAcadimicYear -1) || (setGrades.getSemester()==setAcadimicYear + setAcadimicYear )){
                    GP +=(setGrades.getCH()*setGrades.getGradePoint());
                    CH +=setGrades.getCH();
                }
            }

            /* Setting Cumulative grade Point Average*/
            CGPA = CGP / CCH;
            setGradePoints.setCGPA(CGPA);

            /* Setting grade Point Average*/
            GPA = GP / CH;
            setGradePoints.setGPA(GPA);
            if (GPA >= 1.5) {
                setGradePoints.setResult("Pass");
            } else {
                setGradePoints.setResult("Fail");
            }
        } catch (Exception exception) {
            Log.d("Model Error :", exception.getMessage());

        }
        return setGradePoints;
    }
    protected int getCurrentSemester(ArrayList<StudentData> getResult, int _class) {
        int CurrentPosition = _class;
        try {
            for (StudentData Data : getResult) {
                if (Data.getSemester() >= CurrentPosition) {
                    CurrentPosition = Data.getSemester();
                }
            }
        } catch (Exception exception) {
            Log.d("Model Error :", exception.getMessage());
        }
        return CurrentPosition;
    }

    protected ArrayList<StudentData> getCurrentResult(ArrayList<StudentData> getResult, String StudentClass) {
        ArrayList<StudentData> currentStudentResult = new ArrayList<StudentData>();

        try {
            int _class = getAcademicYear(StudentClass);
            int semester = getCurrentSemester(getResult, _class);
            for (StudentData studentData : getResult) {
                if (semester == studentData.getSemester()) {
                    currentStudentResult.add(studentData);
                }
            }

        } catch (Exception exception) {
            Log.d("Model Error :", exception.getMessage());
        }
        return currentStudentResult;
    }

    protected int getAcademicYear(String StudentClass) {
        int position = 0;
        try {
            if (StudentClass.equalsIgnoreCase("first")) {
                position = 1;
            } else if (StudentClass.equalsIgnoreCase("second")) {
                position = 2;
            } else if (StudentClass.equalsIgnoreCase("third")) {
                position = 3;
            } else if (StudentClass.equalsIgnoreCase("fourth")) {
                position = 4;
            } else if (StudentClass.equalsIgnoreCase("fifth")) {
                position = 5;
            } else if (StudentClass.equalsIgnoreCase("sixth")) {
                position = 6;
            } else {
                position = 0;
            }
        } catch (Exception exception) {
            Log.d("Model Error :", exception.getMessage());
        }

        return position;
    }


}
