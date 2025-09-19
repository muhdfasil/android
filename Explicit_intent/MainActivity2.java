package com.example.explicit_intent;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle=getIntent().getExtras();
        if (bundle!=null)
        {
            String ImgIndex=bundle.getString("ImageIndex");
            setImage(ImgIndex);
        }

    }
    private void setImage(String index)
    {
        ImageView imageView=findViewById(R.id.ImageViewCountry);
        if (index == null || index.isEmpty()) {
            imageView.setImageResource(R.drawable.img1);
            return;
        }

        switch (index)
        {
            case "1":
                imageView.setImageResource(R.drawable.img1);
                break;
            case "2":
                imageView.setImageResource(R.drawable.img2);
                break;
            case "3":
                imageView.setImageResource(R.drawable.img3);
                break;
            case "4":
                imageView.setImageResource(R.drawable.img4);
                break;
        }
    }
}
