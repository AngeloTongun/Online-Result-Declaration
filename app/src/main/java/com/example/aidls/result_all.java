package com.example.aidls;

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


public class result_all extends Fragment {
    private ArrayList<StudentData> AddGradePointResult;
    private ArrayList<StudentData> GetMarksOptained;
    private ListView listView;
    private  StudentData studentData;
    private  StudentModel studentModel;
    private  StudentController studentController;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_result_all, container, false);
        return view;
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        try{

            listView = view.findViewById(R.id.get_all_data);

            studentData=new StudentData();
            studentModel=new StudentModel();
            AddGradePointResult = new ArrayList<StudentData>();
            GetMarksOptained = new ArrayList<StudentData>();
            studentController=new StudentController();

            GetMarksOptained= studentModel.getStudentResult();
            AddGradePointResult= studentController.getAllStudentResultGrade(GetMarksOptained);
            StudentViewAllAdapter student_adapter = new StudentViewAllAdapter(getContext(), 0, AddGradePointResult);
            listView.setAdapter(student_adapter);
        }catch (Exception exception){
            Log.d("Error :" , exception.getMessage());
        }

    }

}