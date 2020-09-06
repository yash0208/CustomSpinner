package com.rajaryan.customspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;

import javax.xml.parsers.SAXParser;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=findViewById(R.id.spinner);
        String[] value={"1","2","3","4"};
        ArrayList<String> arrayList=new ArrayList<>(Arrays.asList(value));
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,R.layout.style_spinner,arrayList);
        spinner.setAdapter(arrayAdapter);
    }
}
