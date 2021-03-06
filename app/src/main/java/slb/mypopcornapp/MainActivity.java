package slb.mypopcornapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.GridView;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;

import slb.popcornsdk.ABook;
import slb.popcornsdk.BookSingleton;
import slb.popcornsdk.MoviesBook;
import slb.popcornsdk.ShowsBook;
import slb.popcornsdk.data.page.APage;
import slb.popcornsdk.data.page.movie.Movie;

public class MainActivity extends AppCompatActivity {

    public ArrayList<APage> listElem;
    public ABook book = (new BookSingleton()).getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayListElem();
        setButton();
        setSwitch();

    }

    private void setButton() {
        Button prevBtn = (Button) findViewById(R.id.prevPageBtn);
        prevBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                book.prevPage();
                displayListElem();

            }
        });
        Button nextBtn = (Button) findViewById(R.id.nextPageBtn);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                book.nextPage();
                displayListElem();
                Toast.makeText(MainActivity.this, ""+ book.getNbPage(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void setSwitch() {
        ToggleButton selectTgl = (ToggleButton) findViewById(R.id.selectorTgl);
        selectTgl.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                book = (new BookSingleton()).swMovShow();
                displayListElem();
            }
        });
    }
    public static final String EXTRA_ID_ELEM = "slb.popcornsdk.MESSAGE";
    public static final String EXTRA_BOOK = "slb.popcornsdk.MESSAGE";
    private void displayListElem (){
        listElem = book.getPage();

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this, listElem));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
              //  Toast.makeText(MainActivity.this, listElem.get(position).getTitle(),
             //           Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getBaseContext(), NameItemActivity.class);
                intent.putExtra(EXTRA_ID_ELEM, listElem.get(position).getImdbId());
                startActivity(intent);
            }
        });
    }

}
