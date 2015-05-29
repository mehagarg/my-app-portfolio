package app.garg.meha.com.nanodegree;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MyAppPortfolio extends Activity{

    Button spotify;
    Button scores;
    Button library;
    Button build_bigger;
    Button xyz_reader;
    Button my_own_app;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_app_portfolio);

        //Spotify Streamer
        spotify = (Button) findViewById(R.id.spotify);
        spotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch my spotify app.", Toast.LENGTH_LONG).show();
            }
        });

        //Scores App
        scores = (Button) findViewById(R.id.scores);
        scores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch my scores app.", Toast.LENGTH_LONG).show();
            }
        });

        //Library App
        library = (Button) findViewById(R.id.library_app);
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch my library app.", Toast.LENGTH_LONG).show();
            }
        });

        //Build It Bigger
        build_bigger = (Button) findViewById(R.id.build_bigger);
        build_bigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch my build it bigger app.", Toast.LENGTH_LONG).show();
            }
        });

        //XYZ Reader
        xyz_reader = (Button) findViewById(R.id.xyz_reader);
        xyz_reader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch my XYZ reader app.", Toast.LENGTH_LONG).show();
            }
        });

        //My Own App
        my_own_app = (Button) findViewById(R.id.my_own_app);
        my_own_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch capstone: my own app.", Toast.LENGTH_LONG).show();
            }
        });
    }

//    public String getAppName(){
//        String appname = null;
//
//        if(findViewById(R.id.spotify) == spotify){
//            appname =  "spotify";
//        }
//        if(findViewById(R.id.scores) == scores){
//            appname =  "scores";
//        }
//        if(findViewById(R.id.library_app) == library){
//            appname =  "library";
//        }
//        if(findViewById(R.id.build_bigger) == build_bigger){
//            appname =  "build it bigger";
//        }
//        if(findViewById(R.id.xyz_reader) == xyz_reader){
//            appname =  "xyz reader";
//        }
//        if(findViewById(R.id.my_own_app) == my_own_app){
//            appname =  "capstone, my own app";
//        }
//        return appname;
//    }

//    @Override
//    public void onClick(View v) {
//
//        Toast.makeText(this, "This button will launch my " + getAppName() + " app!" , Toast.LENGTH_LONG).show();
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my_app_portfolio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
