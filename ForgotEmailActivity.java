package com.jgrundy.logintask;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class ForgotEmailActivity extends AppCompatActivity {


    private TextView mReturnToLoginPage;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgot_email_activity);


        //Link back to main login
        mReturnToLoginPage = (TextView) findViewById(R.id.to_main_login_link);
        mReturnToLoginPage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(ForgotEmailActivity.this, LoginActivity.class);
                ForgotEmailActivity.this.startActivity(myIntent);
            }
        });
    }
}
