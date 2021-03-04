package com.example.aidls;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Button btnLogin;
    private EditText editUsername,editPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin=findViewById(R.id.btnlogin);
        editUsername=findViewById(R.id.editUsername);
        editPassword=findViewById(R.id.editPassword);
        try {
            btnLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        String unsername=editUsername.getText().toString().trim();
                        String password=editPassword.getText().toString().trim();

                        if(unsername.isEmpty() || password.isEmpty()){
                            Toast.makeText(getApplicationContext(),"Please Enter Username and Password",Toast.LENGTH_LONG).show();

                        }else{
                            Intent intent=new Intent(getApplicationContext(), HomeActivity.class);
                            startActivity(intent);
                            // Toast.makeText(getApplicationContext(),"Welcome",Toast.LENGTH_LONG).show();
                        }
                    }catch (Exception exception){
                        Toast.makeText(getApplicationContext(),"System Error",Toast.LENGTH_LONG).show();
                    }
                }
            });
        }catch (Exception exception){
            Log.d("Error ", exception.getMessage().toString());
        }
    }
}