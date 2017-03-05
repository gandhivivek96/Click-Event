package com.example.vivekgandhi.event1;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button myButton = (Button)findViewById(R.id.ButtonC);
        myButton.setOnClickListener(
                new Button.OnClickListener()//interface
                {
                    public void onClick(View v)//callback method
                    {
                        TextView t =(TextView) findViewById(R.id.myText);
                        t.setText("OnClick event called ");
                    }
                }
        );

        myButton.setOnLongClickListener(
                new Button.OnLongClickListener(){

                    public boolean onLongClick(View v)
                    {
                        TextView t = (TextView) findViewById(R.id.myText);
                        t.setText("Long click event called");
                        return true;
                    }
                }
        );


                }

    }


