package com.example.kyle.t6simpleflagquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final Button btnA = (Button) findViewById(R.id.button6);
        final Button btnB = (Button) findViewById(R.id.button5);
        final Button btnC = (Button) findViewById(R.id.button8);
        final Button btnD = (Button) findViewById(R.id.button7);

        final TextView result = (TextView) findViewById(R.id.textView2);

        btnB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result.setText("Incorrect!");
            }
        });

        btnC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result.setText("Incorrect!");
            }
        });


        btnD.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result.setText("Incorrect!");
            }
        });


        btnA.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result.setText("Your answer is correct!");
                Intent startQ3Activity = new Intent(v.getContext(), Main3Activity.class);
                startActivity(startQ3Activity);
            }
        });
    }
}
