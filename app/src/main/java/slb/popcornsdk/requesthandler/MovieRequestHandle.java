package slb.popcornsdk.requesthandler;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

import slb.popcornsdk.data.movie.Movie;
import slb.popcornsdk.requestbuilder.RequestBuilderMovies;

/**
 * Created by lauret_s on 30/06/2017.
 */

public class MovieRequestHandle extends ARequestHandle {
    RequestBuilderMovies _req = new RequestBuilderMovies();

    public ArrayList<String> getNamePages() {
        return getNamePagesBase(_req);
    }
    public ArrayList<Movie> getPage(String idPage) {
        String tmpJson = super.getPageBase(_req, idPage);
        Type listType = new TypeToken<ArrayList<Movie>>(){}.getType();
        ArrayList<Movie> res = new Gson().fromJson(tmpJson, listType);
        return res;
       // return null;
    }
    public Movie getDetail(String idImdb) {
        String tmpJson = super.getDetailBase(_req, idImdb);
        Type listType = new TypeToken<Movie>(){}.getType();
        Movie res = new Gson().fromJson(tmpJson, listType);
        return res;
        //return null;
    }
}
