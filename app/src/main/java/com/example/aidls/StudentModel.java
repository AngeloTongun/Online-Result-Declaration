package com.example.aidls;

import android.util.Log;

import java.util.ArrayList;

public class StudentModel {

    protected StudentData getStudentInfo() {
        // database codes to retrieves student information

        StudentData model_data = new StudentData("XXX XXXX XXXXXX", "10002", "second", "Information Technology", "Engineering");

        return model_data;
    }
    protected ArrayList<StudentData> getStudentResult() {
        ArrayList<StudentData> studentList = new ArrayList<StudentData>();
        StudentData model_data = new StudentData();
        try {
            /*
            for (int i = 1; i < 81; i++) {
                model_data = new StudentData("EB100" + i, "Computer Course " + i, (80 +i)%2, 4, i % 12);
                studentList.add(model_data);
            }
            */
            model_data = new StudentData("EB1001", "Computer Course 1" , 40, 3,1);
            studentList.add(model_data);
            model_data = new StudentData("EB1002", "Computer Course 2" , 90, 3,1);
            studentList.add(model_data);
            model_data = new StudentData("EB1003", "Computer Course 3" , 50, 3,1);
            studentList.add(model_data);
            model_data = new StudentData("EB1004", "Computer Course 4" , 30, 3,2);
            studentList.add(model_data);
            model_data = new StudentData("EB1005", "Computer Course 5" , 70, 3,2);
            studentList.add(model_data);
            model_data = new StudentData("EB1006", "Computer Course 6" , 60, 3,2);
            studentList.add(model_data);
            model_data = new StudentData("EB1007", "Computer Course 7" , 44, 3,2);

            studentList.add(model_data);
            model_data = new StudentData("EB1008", "Computer Course 8" , 55, 3,3);
            studentList.add(model_data);
            model_data = new StudentData("EB1009", "Computer Course 9" , 90, 3,3);
            studentList.add(model_data);
            model_data = new StudentData("EB10010", "Computer Course 10" , 60, 3,4);
            studentList.add(model_data);
            model_data = new StudentData("EB10011", "Computer Course 11" , 90, 3,4);
            studentList.add(model_data);
            model_data = new StudentData("EB10012", "Computer Course 12" , 70, 3,4);
            studentList.add(model_data);
        } catch (Exception exception) {
            Log.d(" Model Error", exception.getMessage());
        }
        return studentList;
    }



}
