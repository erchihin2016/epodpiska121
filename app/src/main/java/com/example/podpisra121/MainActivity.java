package com.example.podpisra121;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    private TextView textViewZagolovok;
    private TextView textViewName;
    private EditText editTextName;
    private TextView textViewEmail;
    private EditText editTextEmail;
    private Button buttonOK;
    private Button buttonClean;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        buttonOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = "Подписка на рассылку успешно оформлена для пользователя";
                textViewResult.setText(" ");
            }
        });

        buttonClean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewResult.setText(" ");
                editTextName.setText(" ");
                editTextEmail.setText(" ");
            }
        });

    }
    public void init() {
        textViewZagolovok = findViewById(R.id.textViewZagolovok);
        textViewName = findViewById(R.id.textViewName);
        editTextName = findViewById(R.id.editTextName);
        textViewEmail = findViewById(R.id.textViewEmail);
        editTextEmail = findViewById(R.id.editTextEmail);
        buttonOK = findViewById(R.id.buttonOK);
        buttonClean = findViewById(R.id.buttonClean);
    }
}
