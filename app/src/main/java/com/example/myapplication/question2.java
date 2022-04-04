package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class question2 extends AppCompatActivity implements View.OnClickListener {
    Button  bsuivant;
    RadioGroup rg;
    RadioButton rb;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        bsuivant = (Button) findViewById(R.id.btn_suiv);
        rg = (RadioGroup) findViewById(R.id.radio);
        bsuivant.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn_suiv:
                int id = rg.getCheckedRadioButtonId();
                rb = (RadioButton) findViewById(id);
                if (rb.getText().toString().equals("ira"))
                {
                    score = getIntent().getExtras().getInt("score");
                    score = score +1;
                }
                else
                {
                    score = getIntent().getExtras().getInt("score");
                }
                Intent i = new Intent(this,question3.class);
                i.putExtra("score",score);
                startActivity(i);

        }
    }
}