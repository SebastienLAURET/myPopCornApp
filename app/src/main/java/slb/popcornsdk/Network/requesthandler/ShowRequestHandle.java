package slb.popcornsdk.Network.requesthandler;

import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

import slb.popcornsdk.data.detail.ADetail;
import slb.popcornsdk.data.detail.showdetail.ShowDetail;
import slb.popcornsdk.data.page.APage;
import slb.popcornsdk.data.page.shows.Show;
import slb.popcornsdk.Network.requestbuilder.RequestBuilderShows;

/**
 * Created by lauret_s on 30/06/2017.
 */

public class ShowRequestHandle extends ARequestHandle {
    public ShowRequestHandle () {
        super(new RequestBuilderShows());
    }

    @Override
    public ArrayList<String> getNamePages() {
        return super.getNamePages();
    }

    @Override
    public ArrayList<APage> getPage(String idPage) {
        Type listType = new TypeToken<ArrayList<Show>>(){}.getType();
        ArrayList<APage> res = super.getPageBase(idPage, listType);
        return res;
    }

    @Override
    public ADetail getDetail(String idImdb) {
        Type listType = new TypeToken<ShowDetail>(){}.getType();
        ADetail res = super.getDetailBase(idImdb, listType);
        return res;
        //return null;
    }
}
