package com.exams.callsmsweb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button c,s,w;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c = findViewById(R.id.call);
        s = findViewById(R.id.sms);
        w = findViewById(R.id.web);

        c.setOnClickListener(new View.OnClickListener() {   //Above code is for calling
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent();
                i1.setAction(Intent.ACTION_CALL);
                i1.setData(Uri.parse("tel:9874948947")); // The number should br set for the Call
                startActivity(i1);


            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent();
                i2.setAction(Intent.ACTION_SENDTO);
                i2.setData(Uri.parse("smsto:9874948947")); // The number should be set for the SMS
                i2.putExtra("sms_body", "Come To Party With a Gift.");
                startActivity(i2);
            }
        });
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent();
                i3.setAction(Intent.ACTION_VIEW);
                i3.setData(Uri.parse("https://www.learncodeonline.in"));
                startActivity(i3);
            }
        });


    }
}
