package slb.mypopcornapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import slb.popcornsdk.ABook;
import slb.popcornsdk.BookSingleton;
import slb.popcornsdk.data.detail.ADetail;
import slb.popcornsdk.data.page.APage;

/**
 * Created by snrla on 12/07/2017.
 */

public class NameItemActivity extends AppCompatActivity {
    public ABook book = (new BookSingleton()).getInstance();
    public ADetail detail = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.name_item);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_ID_ELEM);

        detail = book.getDetail(message);
        displayTitle();
    }

    private void displayTitle() {
        TextView titleTV = (TextView) findViewById(R.id.title_textView);
        if (detail != null)
            titleTV.setText(detail.getTitle());
        else
            titleTV.setText("titre");

        TextView synoTv = (TextView) findViewById(R.id.syno_textView);
        if (detail != null)
            synoTv.setText(detail.getSynopsis());
        else
            synoTv.setText("Synopsis");
    }
}
