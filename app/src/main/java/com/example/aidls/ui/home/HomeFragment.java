package com.example.aidls.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.aidls.R;
import com.example.aidls.ResultActivity;
import com.google.android.material.snackbar.Snackbar;

public class HomeFragment extends Fragment {
    private Button btn_result;
    private EditText Enrollment_No;
    private HomeViewModel homeViewModel;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.home_home, container, false);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        /* The buton that the user may enter username and password*/
        btn_result= view.findViewById(R.id.btnsearch);
        Enrollment_No=view.findViewById(R.id.editStudentId);
        btn_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(Enrollment_No.getText().toString().trim().isEmpty()){
                Snackbar.make(view, "Please Enter Your Enrollment No", Snackbar.LENGTH_LONG).setAction("Action", null).show();
            }else{

                Intent intent=new Intent(getContext(), ResultActivity.class);
                startActivity(intent);
            }

            }
        });
    }
}