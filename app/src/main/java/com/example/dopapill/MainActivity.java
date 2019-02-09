package com.example.dopapill;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mGreeting;
    private Button nGoodByeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nGoodByeButton=(Button) findViewById(R.id.goodbye_button);
        mGreeting=(TextView)findViewById(R.id.greeting);
        nGoodByeButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                nGoodByeButton.setVisibility(View.INVISIBLE);
                mGreeting.setVisibility(View.INVISIBLE);
            }
        };
    }
}
