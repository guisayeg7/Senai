package br.senai.sc.senai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.et_texto);
        editText2 = findViewById(R.id.et_texto2);
    }

    public void onClickBtnMostrar(View v) {

        Toast.makeText(MainActivity.this, editText.getText()+" "+editText2.getText(), Toast.LENGTH_LONG).show(); }

    public void onClickBtnLimpar(View v) {

        editText.setText("");
        editText2.setText("");
}}
