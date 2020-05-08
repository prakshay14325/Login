package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private TextView info;
    private Button Login;
    private int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=(EditText) findViewById(R.id.editText1);
        password=(EditText)findViewById(R.id.editText2);
        info=(TextView)findViewById(R.id.textView1);
        Login=(Button) findViewById(R.id.button1);

        info.setText("No of Attempts Remaining 3");

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(username.getText().toString(), password.getText().toString());
            }
        });
    }

    private void validate(String username,String password){

        if((username.equals("Prakshay")) && (password.equals("Prakshay1432"))){
            Intent intent =new Intent(MainActivity.this, Main2Activity.class);
            startActivity(intent);
        }
        else {
            counter--;

            info.setText("No of Attempts Remaining:"  + String.valueOf(counter));

            if (counter == 0){
                Login.setEnabled(false);
            }

        }


    }
}
