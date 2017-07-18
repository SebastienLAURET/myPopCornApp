package slb.popcornsdk.Network.requesthandler;

import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

import slb.popcornsdk.data.detail.ADetail;
import slb.popcornsdk.data.page.APage;
import slb.popcornsdk.data.page.movie.Movie;
import slb.popcornsdk.Network.requestbuilder.RequestBuilderMovies;

/**
 * Created by lauret_s on 30/06/2017.
 */

public class MovieRequestHandle extends ARequestHandle {
    public MovieRequestHandle () {
        super(new RequestBuilderMovies());
    }

    @Override
    public ArrayList<String> getNamePages() {
        return super.getNamePages();
    }

    @Override
    public ArrayList<APage> getPage(String idPage) {
        Type listType = new TypeToken<ArrayList<Movie>>(){}.getType();
        ArrayList<APage> res = super.getPageBase( idPage, listType);
        return res;
    }

    @Override
    public ADetail getDetail(String idImdb) {
        Type listType = new TypeToken<slb.popcornsdk.data.detail.movie.Movie>(){}.getType();
        ADetail res = super.getDetailBase( idImdb, listType);
        return res;
    }
}
