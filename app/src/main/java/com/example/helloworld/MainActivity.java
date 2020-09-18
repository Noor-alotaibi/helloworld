package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b ;
    EditText E ;
    TextView v1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b= (Button) findViewById(R.id.button)  ;
        E=(EditText) findViewById(R.id.personName) ;
        v1 = (TextView) findViewById(R.id.textView);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = E.getText().toString();

                v1.setText("Hello"+s);
               // sendData(s);


            }
        });
    }

    private void sendData(String s) {
        Intent intent = new Intent(this , MainActivity.class);
        intent.putExtra("personName",s);

        startActivity(intent);
    }

}