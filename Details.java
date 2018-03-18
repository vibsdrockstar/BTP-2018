package com.example.vibhor.daid;

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
            case R.id.b_read:
                startActivity(new Intent(this, Read.class));
                break;
            case R.id.b_listen:
                startActivity(new Intent(this, Listen.class));
                break;


        }
    }
}
