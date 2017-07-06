package slb.popcornsdk.Network.requesthandler;

import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

import slb.popcornsdk.data.page.APage;
import slb.popcornsdk.data.page.shows.Show;
import slb.popcornsdk.Network.requestbuilder.RequestBuilderShows;

/**
 * Created by lauret_s on 30/06/2017.
 */

public class ShowRequestHandle extends ARequestHandle {
    RequestBuilderShows _req = new RequestBuilderShows();
    @Override
    public ArrayList<String> getNamePages() {
        return getNamePages(_req);
    }
    public ArrayList<Show> getPage(String idPage) {
        Type listType = new TypeToken<ArrayList<Show>>(){}.getType();
        ArrayList<APage> res = super.getPage(_req, idPage, listType);
        ArrayList<Show> listShow = new ArrayList<Show>();
        for (APage tmp: res) {
            listShow.add((Show) tmp);
        }
        return listShow;
        // return null;
    }
  /*  public ShowDetail getDetail(String idImdb) {
        Type listType = new TypeToken<ShowDetail>(){}.getType();
        ShowDetail res = (ShowDetail) super.getDetail(_req, idImdb, listType);
        return res;
        //return null;
    }*/
}
