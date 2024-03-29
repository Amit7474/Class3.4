package com.example.class31;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText main_EDT_input;
    private Button main_BTN_chk;
    private TextView main_LBL_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_EDT_input = findViewById(R.id.main_EDT_input);
        main_BTN_chk = findViewById(R.id.main_BTN_chk);
        main_LBL_info = findViewById(R.id.main_LBL_info);

        main_BTN_chk.setOnClickListener(myListener);

    }

    View.OnClickListener myListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            start();
        }
    };

    private void start() {
        try {
            String input = main_EDT_input.getText().toString();
            boolean answer = Logic.chkAnswer(input);
            main_LBL_info.setText(answer + "");
        } catch (Exception e) {
            Toast.makeText(this, "Ooopsss..", Toast.LENGTH_SHORT).show();
        }
    }
}
