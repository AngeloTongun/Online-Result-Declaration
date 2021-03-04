package com.example.aidls;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class result_student_info extends Fragment {

private TextView student_name, student_id,student_class,student_Dept,student_College, student_GPA, student_SGPA, student_CGPA, student_result;
    StudentData studentdata, getGradePointAverageInformation ;
    ArrayList<StudentData> getAllMarks;
    ArrayList<StudentData> setAllGrades;
    ArrayList<StudentData> setGradesAverage;
    StudentModel studentModel;
    private  StudentController studentController;

@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_result_student_info, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        try{
            student_name=view.findViewById(R.id.student_name);
            student_id=view.findViewById(R.id.student_id);
            student_class=view.findViewById(R.id.student_class);
            student_Dept=view.findViewById(R.id.student_Dept);

            student_GPA=view.findViewById(R.id.student_GPA);
            student_CGPA=view.findViewById(R.id.student_CGPA);
            student_result=view.findViewById(R.id.student_result);


            /*  getting Model data and DStudent Data*/
            studentdata =new StudentData();
            studentModel=new StudentModel();
            studentController=new StudentController();
            getGradePointAverageInformation=new StudentData();

            getAllMarks =new  ArrayList<StudentData>();
            setAllGrades =new  ArrayList<StudentData>();
            setGradesAverage=new ArrayList<StudentData>();

            /* get  Student information*/
            studentdata=studentModel.getStudentInfo();
            setStudentInformation(view);

            /* get all Marks student optained Student information*/
            getAllMarks = studentModel.getStudentResult();

            /* get all Grade points  information*/
            setAllGrades=studentController.getAllStudentResultGrade(getAllMarks);

            /*  Set grade point Average */
            getGradePointAverageInformation= studentController.SetGradePointsAverages(setAllGrades,studentdata.getStudentClass());
            setGradesInformation(view);

        }catch (Exception exception){
            Log.d("Error :" , exception.getMessage());
        }

    }
    private  void setStudentInformation(View view){
        try {
            String name, id, dept, _class, college;
            name=student_name.getText().toString().trim();
            id=student_id.getText().toString().trim();
            _class=student_class.getText().toString().trim();
            dept=student_Dept.getText().toString().trim();

            student_name.setText(name+" "+studentdata.getStudentName());
            student_id.setText(id+" "+studentdata.getStudentID());
            student_class.setText(_class+" "+studentdata.getStudentClass()+" Year");
            student_Dept.setText(dept+" "+studentdata.getStudentDept());

        }catch (Exception exception){
            Log.d("Error :" , exception.getMessage());
        }

    }
    private  void setGradesInformation(View view){
        try {
            String Result, CGPA, GPA, SGPA;
            Result=student_result.getText().toString().trim();
            CGPA=student_CGPA.getText().toString().trim();
            GPA=student_GPA.getText().toString().trim();
           // SGPA=student_Dept.getText().toString().trim();

            student_GPA.setText(GPA+" "+getGradePointAverageInformation.getGPA());
            student_CGPA.setText(CGPA+" "+getGradePointAverageInformation.getCGPA());
            student_result.setText(Result+" "+getGradePointAverageInformation.getResult());

        }catch (Exception exception){
            Log.d("Error :" , exception.getMessage());
        }

    }
}