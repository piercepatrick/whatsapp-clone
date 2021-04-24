package com.example.whatsapp_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.FirebaseApp;

public class MainActivity extends AppCompatActivity {

    private EditText mPhoneNumber, mCode;
    private Button mSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseApp.initializeApp(this);


        mPhoneNumber = findViewById(R.id.phoneNumber);
        mCode = findViewById(R.id.code);
        mSend = findViewById(R.id.send);

        mSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startPhoneNumberVerification();
            }
        });

    }

    private void startPhoneNumberVerification() {
        //PhoneAuthProvider
    }
}