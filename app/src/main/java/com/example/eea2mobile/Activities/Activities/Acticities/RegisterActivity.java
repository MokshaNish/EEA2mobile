package com.example.eea2mobile.Activities.Activities.Acticities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.eea2mobile.R;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void join(View view) {

        EditText editTextname = findViewById(R.id.editTextname);
        EditText editTextemail = findViewById(R.id.editTextemail);
        EditText editTextpassword = findViewById(R.id.editTextpassword);
        EditText editTextConfirmPassword = findViewById(R.id.editTextConfirmPassword);
        EditText editTextContactNumber = findViewById(R.id.editTextContactNumber);


        String name = editTextname.getText().toString();  //getText() get the content inside editText & toString() convert it to string format.
        String email = editTextemail.getText().toString();
        String password = editTextpassword.getText().toString();
        String confirmPassword = editTextConfirmPassword.getText().toString();
        String contactNo = editTextContactNumber.getText().toString();

        validateRegister(name, email, password, confirmPassword, contactNo);

    }

    private void validateRegister(String name, String email, String password, String confirmPassword, String contactNo) {

        if(name.isEmpty()||email.isEmpty()|| password.isEmpty()|| confirmPassword.isEmpty()|| contactNo.isEmpty()){

            Toast.makeText(this,"Fill the registration form " , Toast.LENGTH_SHORT).show();
        }else if (confirmPassword.equals(password)){

            String n=name;
            String e= email;
            String p =password;
            String c= confirmPassword;
            String o= contactNo;



           // User user = new User(e,p,n,o);
          //  user.save();

            Intent intent = new Intent( RegisterActivity.this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            Toast.makeText(this,"User registered successfully" , Toast.LENGTH_SHORT).show();



        }else{
            Toast.makeText(this,"Wrong password", Toast.LENGTH_SHORT).show();

        }
    }
}