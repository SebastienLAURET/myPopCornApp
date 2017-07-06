package slb.popcornsdk;

import java.util.ArrayList;

import slb.popcornsdk.data.page.APage;
import slb.popcornsdk.data.page.movie.Movie;
import slb.popcornsdk.Network.requesthandler.MovieRequestHandle;

/**
 * Created by lauret_s on 30/06/2017.
 */

public class MoviesBook {
    private MovieRequestHandle _requestHandel = new MovieRequestHandle();
    private ArrayList<String> _pageName;
    private int _actPage = 0;
    private ArrayList<APage> _movies;

    public MoviesBook() {
        _pageName = _requestHandel.getNamePages();
        loadPage();
    }
    public ArrayList<APage> getMovies() {
        return _movies;
    }
    public ArrayList<APage> nextPage() {
        if (_actPage + 1 < _pageName.size())
            ++_actPage;
        loadPage();
        return _movies;
    }
    public ArrayList<APage> prevPage() {
        if (_actPage - 1 >= 0)
            --_actPage;
        loadPage();
        return _movies;
    }
    private void loadPage() {
        _movies = _requestHandel.getPage(_pageName.get(_actPage));
    }
}
