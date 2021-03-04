package com.example.aidls;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class StudentViewAllAdapter extends ArrayAdapter<StudentData> {
    private TextView item_code, item_course, item_marks;

    public StudentViewAllAdapter(@NonNull Context context, int resource, List<StudentData> list) {
        super(context, resource,list);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        StudentData model_data=getItem(position);
        try{
            if(convertView==null){
                convertView= LayoutInflater.from(getContext()).inflate(R.layout.list_all_semester,parent,false);
            }
            item_code=(convertView).findViewById(R.id.course_all_code);
            item_course=(convertView).findViewById(R.id.course_all_course);
            item_marks=(convertView).findViewById(R.id.course_all_marks);

            item_code.setText(model_data.getCode());
            item_course.setText(model_data.getCourse());
            item_marks.setText(model_data.getGrade());
        }catch (Exception exception){
            Log.d("Error :" , exception.getMessage());
        }

        return convertView;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }
}
