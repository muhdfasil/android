package com.example.calculator;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bC,bA,bS,bM,bD,bE;
    EditText result;
    float mvalueone,mvaluetwo;
    boolean add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        b0=(Button)findViewById(R.id.b0);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        b9=(Button)findViewById(R.id.b9);
        bC=(Button)findViewById(R.id.bC);
        bA=(Button)findViewById(R.id.bA);
        bS=(Button)findViewById(R.id.bS);
        bM=(Button)findViewById(R.id.bM);
        bD=(Button)findViewById(R.id.bD);
        bE=(Button)findViewById(R.id.bE);
        result=(EditText)findViewById(R.id.edit);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"0");
            }
        });

        bA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result==null){
                    result.setText("");
                }
                else {
                    mvalueone=Float.parseFloat(result.getText()+"");
                    add=true;
                    result.setText(null);
                }
            }
        });

        bS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result==null){
                    result.setText("");
                }
                else {
                    mvalueone=Float.parseFloat(result.getText()+"");
                    sub=true;
                    result.setText(null);
                }
            }
        });

        bM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result==null){
                    result.setText("");
                }
                else {
                    mvalueone=Float.parseFloat(result.getText()+"");
                    mul=true;
                    result.setText(null);
                }
            }
        });
        bD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result==null){
                    result.setText("");
                }
                else {
                    mvalueone=Float.parseFloat(result.getText()+"");
                    div=true;
                    result.setText(null);
                }
            }
        });

        bC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
            }
        });
        bE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mvaluetwo=Float.parseFloat(result.getText()+"");
                if(add==true){
                    result.setText(mvalueone+mvaluetwo+"");
                    add=false;
                }
                if(sub==true){
                    result.setText(mvalueone-mvaluetwo+"");
                    sub=false;
                }
                if(mul==true){
                    result.setText(mvalueone*mvaluetwo+"");
                    mul=false;
                }
                if(div==true){
                    result.setText(mvalueone+mvaluetwo+"");
                    div=false;
                }
            }
        });

    }
}