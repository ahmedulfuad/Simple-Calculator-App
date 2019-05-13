package com.example.fuad.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText e1, e2;
    Button b1, b2, b3, b4;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText)findViewById(R.id.e1);
        e2 = (EditText)findViewById(R.id.e2);
        b1= (Button) findViewById(R.id.plus);
        b2= (Button) findViewById(R.id.min);
        b3= (Button) findViewById(R.id.mul);
        b4= (Button) findViewById(R.id.div);
        t1=(TextView) findViewById(R.id.tv);

        b1.setOnClickListener(this);
    }
    public void onClick(View v){
        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();
        Double d1 = Double.parseDouble(s1);
        Double d2 = Double.parseDouble(s2);

        switch(v.getId()){
            case R.id.plus:
                Double res = d1+d2;
                t1.setText(String.valueOf(res));
                break;

            case R.id.min:
                break;

            case R.id.mul:
                break;

            case R.id.div:
                break;
        }
    }
}
