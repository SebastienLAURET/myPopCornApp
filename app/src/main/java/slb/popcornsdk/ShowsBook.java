package slb.popcornsdk;

import java.util.ArrayList;

import slb.popcornsdk.data.page.shows.Show;
import slb.popcornsdk.Network.requesthandler.ShowRequestHandle;

/**
 * Created by lauret_s on 30/06/2017.
 */

public class ShowsBook {
    private ShowRequestHandle _requestHandel = new ShowRequestHandle();
    private ArrayList<String> _pageName;
    private int _actPage = 0;
    private ArrayList<Show> _shows;

    public ShowsBook() {
        _pageName = _requestHandel.getNamePages();
        loadPage();
    }
    public ArrayList<Show> getMovies() {
        return _shows;
    }
    public ArrayList<Show> nextPage() {
        if (_actPage + 1 < _pageName.size())
            ++_actPage;
        loadPage();
        return _shows;
    }
    public ArrayList<Show> prevPage() {
        if (_actPage - 1 >= 0)
            --_actPage;
        loadPage();
        return _shows;
    }
    private void loadPage() {
        _shows = _requestHandel.getPage(_pageName.get(_actPage));
    }
}
