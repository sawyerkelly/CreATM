package com.jgrundy.logintask;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class ForgotPasswordActivity extends AppCompatActivity {

    private TextView mReturnToLoginPage;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgot_password_activity);


        //Clicking the button calls a function
        Button mCreateAccountButton = (Button) findViewById(R.id.reset_password);
        mCreateAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                function here
            }
        });


        //Link back to main login
        mReturnToLoginPage = (TextView) findViewById(R.id.to_main_login_link);
        mReturnToLoginPage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(ForgotPasswordActivity.this, LoginActivity.class);
                ForgotPasswordActivity.this.startActivity(myIntent);
            }
        });
    }
}
