package edu.utsa.cs3443.rowdyorganizer;

import android.os.Bundle;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;


public class Welcome extends AppCompatActivity {
    private Button dailytasksButton;
    private Button calendarButton;
    private Button logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

}