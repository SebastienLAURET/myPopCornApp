package slb.popcornsdk.requesthandler;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

import slb.popcornsdk.data.showdetail.ShowDetail;
import slb.popcornsdk.data.shows.Show;
import slb.popcornsdk.requestbuilder.RequestBuilderMovies;
import slb.popcornsdk.requestbuilder.RequestBuilderShows;

/**
 * Created by lauret_s on 30/06/2017.
 */

public class ShowRequestHandle extends ARequestHandle {
    RequestBuilderShows _req = new RequestBuilderShows();

    public ArrayList<String> getNamePages() {
        return getNamePagesBase(_req);
    }
    public ArrayList<Show> getPage(String idPage) {
        String tmpJson = super.getPageBase(_req, idPage);
        Type listType = new TypeToken<ArrayList<Show>>(){}.getType();
        ArrayList<Show> res = new Gson().fromJson(tmpJson, listType);
        return res;
        // return null;
    }
    public ShowDetail getDetail(String idImdb) {
        String tmpJson = super.getDetailBase(_req, idImdb);
        Type listType = new TypeToken<Show>(){}.getType();
        ShowDetail res = new Gson().fromJson(tmpJson, listType);
        return res;
        //return null;
    }
}
