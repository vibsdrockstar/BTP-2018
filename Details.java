package com.example.vibhor.handicapped;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
    }

    public void OpenDetails(View view) {
        switch (view.getId()) {
            case R.id.b_goep:
                startActivity(new Intent(this, Academia.class));
                break;
            case R.id.b_jobedu:
                startActivity(new Intent(this, JOBS.class));
                break;
        }
    }
}
