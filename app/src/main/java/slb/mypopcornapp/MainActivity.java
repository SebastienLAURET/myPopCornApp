package slb.mypopcornapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


import java.util.concurrent.ExecutionException;

import slb.popcornsdk.requestbuilder.ARequestBuilder;
import slb.popcornsdk.requestbuilder.RequestBuilderMovies;
import slb.popcornsdk.requesthandler.AsyncGETRequest;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("DEBUG","Love toto");
        ARequestBuilder reqBuilder = new RequestBuilderMovies();
        String urlRequest = reqBuilder.getNamePages();
        String tmp = null;


        try {
            for (int i = 0; i < 10; i++) {
                AsyncGETRequest reqHandler = new AsyncGETRequest();
                reqHandler.execute(urlRequest);
                tmp = reqHandler.get();
                Log.d("DEBUG",tmp);

            }
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
