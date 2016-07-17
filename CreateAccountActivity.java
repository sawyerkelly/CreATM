package com.jgrundy.logintask;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class CreateAccountActivity extends AppCompatActivity {

    private TextView mCreateAccountView;
    private TextView mReturnToLoginPage;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_account_activity);

        //Clicking the button calls a function
        Button mCreateAccountButton = (Button) findViewById(R.id.create_account_button);
        mCreateAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                function here
            }
        });


        //Link back to main login
        mReturnToLoginPage = (TextView) findViewById(R.id.to_main_login_link);
        mReturnToLoginPage.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent myIntent = new Intent(CreateAccountActivity.this,LoginActivity.class);
                CreateAccountActivity.this.startActivity(myIntent);
            }
        });
    }
}
