package com.example.explicit_intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onIndexSendButtonClicked(View view)
    {
        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
        EditText editText=(EditText) findViewById(R.id.EditTextIndex);
        String index=editText.getText().toString();
        intent.putExtra("ImageIndex",index);
        startActivity(intent);
    }
}