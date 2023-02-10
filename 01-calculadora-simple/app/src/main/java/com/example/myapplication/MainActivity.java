package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnCalculate;
    private EditText editText1, editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalculate = (Button) this.findViewById(R.id.btn_calculate);
        btnCalculate.setOnClickListener(this);

        editText1 = (EditText) this.findViewById(R.id.txt_num1);
        editText2 = (EditText) this.findViewById(R.id.txt_num2);

    }

    public void calculate_operation(){

        String n1_cad = editText1.getText().toString();
        Integer n1 = Integer.parseInt(n1_cad);

        String n2_cad = editText2.getText().toString();
        Integer n2 = Integer.parseInt(n2_cad);


        Toast.makeText(getApplicationContext(), "El resultado es: "+(n1*n2), Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View view) {
        if (view == btnCalculate) calculate_operation();
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}