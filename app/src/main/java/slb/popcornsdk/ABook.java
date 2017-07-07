package slb.popcornsdk;

import java.util.ArrayList;

import slb.popcornsdk.Network.requesthandler.ARequestHandle;
import slb.popcornsdk.Network.requesthandler.MovieRequestHandle;
import slb.popcornsdk.data.page.APage;

/**
 * Created by lauret_s on 07/07/2017.
 */

public abstract class ABook {
    private ARequestHandle      _requestHandle;
    private ArrayList<String>   _pageName;
    private int                 _actPage = 0;
    private ArrayList<APage>    _page;

    public ABook (ARequestHandle reqHandle) {
        _requestHandle = reqHandle;
        _pageName = _requestHandle.getNamePages();
        loadPage();
    }

    public ArrayList<APage> getMovies() {
        return _page;
    }
    public ArrayList<APage> nextPage() {
        if (_actPage + 1 < _pageName.size())
            ++_actPage;
        loadPage();
        return _page;
    }
    public ArrayList<APage> prevPage() {
        if (_actPage - 1 >= 0)
            --_actPage;
        loadPage();
        return _page;
    }

    private void loadPage() {
        _page = _requestHandle.getPage(_pageName.get(_actPage));
    }
}
