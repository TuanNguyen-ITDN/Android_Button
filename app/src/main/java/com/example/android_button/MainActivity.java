package com.example.android_button;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn1 = (Button)findViewById(R.id.btn1);
        btn1.setText("Text changed");


        btn1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
//                btn1.setText("Second Text");
                Toast.makeText(MainActivity.this, "Text changed" , Toast.LENGTH_SHORT).show();
            }

        });
    }
}
