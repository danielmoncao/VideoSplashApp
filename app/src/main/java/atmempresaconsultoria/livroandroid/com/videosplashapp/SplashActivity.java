package atmempresaconsultoria.livroandroid.com.videosplashapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.VideoView;

public class SplashActivity extends AppCompatActivity {

    //declara videoview
    VideoView videoview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //acrescentado esse codido dentro do metodo onCreate
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);

        //outro codigo inserido
        getSupportActionBar().hide();

        //no video a variavel esta como "videoView" com V maiusculo
        videoview = (VideoView) findViewById(R.id.videoView);


        Uri video = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video);

        videoview.setVideoURI(video);

        videoview.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {

                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();


            }
        });

videoview.start();

    }
}
