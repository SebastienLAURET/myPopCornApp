package slb.mypopcornapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


import java.util.ArrayList;

import slb.popcornsdk.data.movie.Movie;
import slb.popcornsdk.requestbuilder.RequestBuilderMovies;
import slb.popcornsdk.requesthandler.ARequestHandle;
import slb.popcornsdk.requesthandler.MovieRequestHandle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MovieRequestHandle requestHandel = new MovieRequestHandle();
        ArrayList<String> res = requestHandel.getNamePages();
        ArrayList<Movie> movies =  requestHandel.getPage(res.get(0));
        Log.d("RESULT", movies.toString());
    }
}
