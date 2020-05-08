package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity {

    private EditText userName;
    private EditText userEmail;
    private EditText userPassword;
    private Button regButton;
    private TextView userLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        setupUIViews();

        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(validate()){
                  // we can add database
               }
            }
        });
        userLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegistrationActivity.this, MainActivity.class));
            }
        });
    }

    private void setupUIViews(){
        userName=(EditText)findViewById(R.id.etusername);
        userEmail=(EditText)findViewById(R.id.etmail);
        userPassword=(EditText)findViewById(R.id.etpassword);
        regButton=(Button)findViewById(R.id.btregister);
        userLogin=(TextView)findViewById(R.id.tvlogin);


    }

    private Boolean validate(){
        Boolean result = false;

        String name = userName.getText().toString();
        String password= userPassword.getText().toString();
        String email= userEmail.getText().toString();

        if(name.isEmpty() && password.isEmpty() && email.isEmpty()){
            Toast.makeText(this,"Please enter valid details",Toast.LENGTH_SHORT).show();
        }
        else{
            result = true;
        }
        return result;
    }
}
