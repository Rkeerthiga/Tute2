package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.IntentsProj.MESSAGE";
    public static final String EXTRA_MESSAGE2 = "com.example.IntentsProj.MESSAGE2";

    Button btnok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btnok = (Button) findViewById(R.id.button1);
        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMessage();
            }
        });


    }

    public void sendMessage() {
        Intent intent1 = new Intent(this, SecondActivity.class);


        EditText text1 =(EditText) findViewById(R.id.No1);
        EditText text2 = (EditText) findViewById(R.id.No2_2);

        String num1 =text1.getText().toString();
        String num2 = text2.getText().toString();

        intent1.putExtra(EXTRA_MESSAGE, num1);
        intent1.putExtra(EXTRA_MESSAGE2, num2);


        Context context = getApplicationContext();

        CharSequence message = "You just clicked the OK button";

        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, message, duration); toast.show();

        toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);




        startActivity(intent1);
    }

}