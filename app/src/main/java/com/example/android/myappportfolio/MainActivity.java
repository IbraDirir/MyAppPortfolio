package com.example.android.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

 public void SpotifyStreamer(View view){
     Toast.makeText(this, "This button will launch the Spotify streamer project",Toast.
             LENGTH_SHORT).show();


 }
    public void ScoresApp(View view){
        Toast.makeText(this, "This button will launch the Scores  project",Toast.
                LENGTH_SHORT).show();

    }

    public void libraryApp(View view){
        Toast.makeText(this, "This button will launch the Library project",Toast.
                LENGTH_SHORT).show();

    }

    public void buildItBigger(View view){
        Toast.makeText(this, "This button will launch the Build it Bigger project",Toast.
                LENGTH_SHORT).show();

    }


    public void xyzReader(View view){
        Toast.makeText(this, "This button will launch the xyz reader  project",Toast.
                LENGTH_SHORT).show();

    }

    public void myOwnApp(View view){
        Toast.makeText(this, "This button will launch my capstone App",Toast.
                LENGTH_SHORT).show();

    }

}

