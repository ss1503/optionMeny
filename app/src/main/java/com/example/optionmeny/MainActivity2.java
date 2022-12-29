package com.example.optionmeny;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    ConstraintLayout CL;
    Button backBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        CL = (ConstraintLayout) findViewById(R.id.CL);
        backBtn = (Button) findViewById(R.id.backBtn);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0, 0, 250, "White");

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        String st = item.getTitle().toString();

        if(st.equals("Black"))
            CL.setBackgroundColor(Color.BLACK);
        else if(st.equals("Red"))
            CL.setBackgroundColor(Color.RED);
        else if(st.equals("Yellow"))
            CL.setBackgroundColor(Color.YELLOW);
        else if(st.equals("White"))
            CL.setBackgroundColor(Color.WHITE);
        return true;
    }

    public void Back(View view) {
        finish();
    }
}