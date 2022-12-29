package com.example.optionmeny;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout CL;
    Button nextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CL = (ConstraintLayout) findViewById(R.id.CL);
        nextBtn = (Button) findViewById(R.id.goBTn);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
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
        return true;
    }

    public void clicked(View view) {
        Intent si = new Intent(this, MainActivity2.class);
        startActivity(si);
    }
}