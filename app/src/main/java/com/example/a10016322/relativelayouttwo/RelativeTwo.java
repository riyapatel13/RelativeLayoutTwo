package com.example.a10016322.relativelayouttwo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RelativeTwo extends AppCompatActivity{

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;

    TextView text1;
    TextView text2;
    TextView text3;
    TextView text4;
    TextView text5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_two);

        button1 = (Button)(findViewById(R.id.button1_id));
        button2 = (Button)(findViewById(R.id.button2_id));
        button3 = (Button)(findViewById(R.id.button3_id));
        button4 = (Button)(findViewById(R.id.button4_id));
        button5 = (Button)(findViewById(R.id.button5_id));

        text1 = (TextView)(findViewById(R.id.textView1_id));
        text2 = (TextView)(findViewById(R.id.textView2_id));
        text3 = (TextView)(findViewById(R.id.textView3_id));
        text4 = (TextView)(findViewById(R.id.textView4_id));
        text5 = (TextView)(findViewById(R.id.textView5_id));
    }

    public void onClickText(View view)
    {
        if(R.id.button1_id == view.getId())
        {
            if(text1.getText()=="ON")
                text1.setText("OFF");
            else
                text1.setText("ON");
        }
        if(R.id.button2_id == view.getId())
        {
            if(text2.getText()=="ON")
                text2.setText("OFF");
            else
                text2.setText("ON");
        }
        if(R.id.button3_id == view.getId())
        {
            if(text3.getText()=="ON")
                text3.setText("OFF");
            else
                text3.setText("ON");
        }
        if(R.id.button4_id == view.getId())
        {
            if(text4.getText()=="ON")
                text4.setText("OFF");
            else
                text4.setText("ON");
        }
        if(R.id.button5_id == view.getId())
        {
            if(text5.getText()=="ON")
                text5.setText("OFF");
            else
                text5.setText("ON");
        }
    }
}
