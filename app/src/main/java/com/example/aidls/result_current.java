package com.example.aidls;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class result_current extends Fragment {
    private ArrayList<StudentData> AddGradePointResult;
    private ArrayList<StudentData> GetMarksOptained;
    private ArrayList<StudentData> CurrentMarksOptained;
    private ListView listView;
    private StudentData studentData;
    private StudentModel studentModel;
    private  StudentController studentController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_result_current, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        try {
            listView = view.findViewById(R.id.get_data);
            studentData = new StudentData();
            studentModel = new StudentModel();
            studentController=new StudentController();
            AddGradePointResult = new ArrayList<StudentData>();
            GetMarksOptained = new ArrayList<StudentData>();
            CurrentMarksOptained = new ArrayList<StudentData>();

            GetMarksOptained = studentModel.getStudentResult();
            AddGradePointResult = studentController.getAllStudentResultGrade(GetMarksOptained);
            CurrentMarksOptained = studentController.getCurrentResult(AddGradePointResult, studentData.getStudentClass());

            studentResultAdapter student_adapter = new studentResultAdapter(getContext(), 0, CurrentMarksOptained);
            listView.setAdapter(student_adapter);
        } catch (Exception e) {
            System.out.println("Error:" + e.getStackTrace());
        }

    }

}