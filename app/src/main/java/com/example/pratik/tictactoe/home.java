package com.example.pratik.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class home extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void startMethod(View view){
         EditText name1 = (EditText) findViewById(R.id.FirstPName);
         EditText name2 = (EditText) findViewById(R.id.SecondPName);
        TextView WelcomeMsg = (TextView) findViewById(R.id.Welcome);
        String msg = "Welcome " + name1.getText().toString() + " and " + name2.getText().toString() + "!";
        WelcomeMsg.setText(msg);

        Intent intent = new Intent(home.this,game.class);
        startActivity(intent);
    }
}
