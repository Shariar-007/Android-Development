package com.example.p1_hello_world;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickButton(View view) {
        TextView txtMessage = findViewById(R.id.txtMessage);
        EditText editText = findViewById(R.id.editTxtName);
        txtMessage.setText(editText.getText().toString());
    }
}