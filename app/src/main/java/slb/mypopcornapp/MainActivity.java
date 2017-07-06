package slb.mypopcornapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

import slb.popcornsdk.MoviesBook;
import slb.popcornsdk.data.page.APage;
import slb.popcornsdk.data.page.movie.Movie;

public class MainActivity extends AppCompatActivity {
    MoviesBook book = new MoviesBook();
    ArrayList<APage> listMovies;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listMovies = book.getMovies();
        Log.d("Debug", listMovies.toString());

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this, listMovies));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "" + position,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

}
