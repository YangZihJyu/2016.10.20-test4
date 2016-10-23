package tw.com.a4040e034.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton imageButton2;
    private ImageButton imageButton5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       imageButton2 = (ImageButton)findViewById(R.id.imageButton2);
       // imageButton2=(Button)findViewById(R.id.imageButton2);
        imageButton5=(ImageButton)findViewById(R.id.imageButton5);


        ImageButton nextpage =(ImageButton)findViewById(R.id.imageButton2);
        nextpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this , page2.class);
                startActivity(intent);
            }
        });

        ImageButton nextpage2 =(ImageButton)findViewById(R.id.imageButton5);
        nextpage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this , page3.class);
                startActivity(intent);
            }
        });
    }
}
