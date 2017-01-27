package com.example2.acer.currency;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void butomConvert(View view){
        EditText convertField=(EditText) findViewById(R.id.convertField);
        Double doller =Double.parseDouble(convertField.getText().toString());
        Double pound = doller * 1.25 ;
        Toast.makeText(getApplicationContext(),"£ " +pound.toString(),Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
