package tw.com.a4040e034.test;

import android.content.Intent;
import android.media.MediaPlayer;
import android.media.session.MediaController;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class page2 extends AppCompatActivity {
private Button button2;
    private VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
       VideoView videoView=(VideoView) this.findViewById(R.id.videoView);
        android.widget.MediaController mc = new android.widget.MediaController(this);
        videoView.setMediaController(mc);
        videoView.setVideoURI(Uri.parse("android.resource://"+ getPackageName() + "/" + R.raw.japanese));
        videoView.requestFocus();
        videoView.start();

        button2=(Button)findViewById(R.id.button2);


        Button nextpage =(Button)findViewById(R.id.button2);
        nextpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(page2.this , MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
