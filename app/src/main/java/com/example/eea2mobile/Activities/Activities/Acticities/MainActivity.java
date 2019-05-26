package com.example.eea2mobile.Activities.Activities.Acticities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.eea2mobile.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

        public void login(View view){

            EditText editTextUsername = findViewById(R.id.editTextUsername);
            //binding the xml view with java using its id  , it gives the id of the specific view which i defined in the XMl
            String email = editTextUsername.getText().toString(); //getText() get the content inside editText & toString() convert it to string format.


            EditText editText2Password = findViewById(R.id.editText2Password);
            String password = editText2Password.getText().toString();

            validate(email, password);
        }

    public void register(View view){

        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    private void validate(String email, String password) {

        Intent intent = new Intent(this, navActivity.class);
        startActivity(intent);
    }

}
