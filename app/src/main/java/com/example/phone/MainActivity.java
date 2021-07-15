package com.example.phone;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText phone;
    Button clikToDisp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IPhone iPhone = new IPhone("11 pro", 40, "Celcome", "Oping");
        Galaxy galaxy = new Galaxy("Grand Prime", 12, "Jawwal", "");
        phone = findViewById(R.id.Phone);
        clikToDisp = findViewById(R.id.clickToDisplay);
        clikToDisp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phone.setText("" + galaxy.unlock());
            }
        });

    }
}