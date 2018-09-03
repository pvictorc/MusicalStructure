package br.com.oaklabs.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener myMusicListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent player = new Intent(MainActivity.this,PlayerActivity.class);
                startActivity(player);
            }
        };

        CardView cv11 = (CardView) findViewById(R.id.cardview1_1);

        //I found this sintax is more clear
        cv11.setOnClickListener(myMusicListener);


    }

}
