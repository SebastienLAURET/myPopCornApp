package slb.popcornsdk.Network.requesthandler;

import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

import slb.popcornsdk.data.page.APage;
import slb.popcornsdk.data.page.movie.Movie;
import slb.popcornsdk.Network.requestbuilder.RequestBuilderMovies;

/**
 * Created by lauret_s on 30/06/2017.
 */

public class MovieRequestHandle extends ARequestHandle {
    RequestBuilderMovies _req = new RequestBuilderMovies();

    @Override
    public ArrayList<String> getNamePages() {
        return getNamePages(_req);
    }
    //@Override
    //@Override
    public ArrayList<APage> getPage(String idPage) {
        Type listType = new TypeToken<ArrayList<Movie>>(){}.getType();
        ArrayList<APage> res = super.getPage(_req, idPage, listType);

        return res;
       // return null;
    }
    /*
    //@Override
    public Movie getDetail(String idImdb) {
        Type listType = new TypeToken<Movie>(){}.getType();
        Movie res = (Movie)super.getDetail(_req, idImdb, listType);
        return res;
        //return null;
    }*/
}
