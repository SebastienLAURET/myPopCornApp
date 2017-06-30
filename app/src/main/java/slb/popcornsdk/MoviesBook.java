package slb.popcornsdk;

import java.util.ArrayList;

import slb.popcornsdk.data.movie.Movie;
import slb.popcornsdk.requesthandler.MovieRequestHandle;

/**
 * Created by lauret_s on 30/06/2017.
 */

public class MoviesBook {
    private MovieRequestHandle _requestHandel = new MovieRequestHandle();
    private ArrayList<String> _pageName;
    private int _actPage = 0;
    private ArrayList<Movie> _movies;

    public MoviesBook() {
        _pageName = _requestHandel.getNamePages();
        loadPage();
    }
    public ArrayList<Movie> getMovies() {
        return _movies;
    }
    public ArrayList<Movie> nextPage() {
        if (_actPage + 1 < _pageName.size())
            ++_actPage;
        loadPage();
        return _movies;
    }
    public ArrayList<Movie> prevPage() {
        if (_actPage - 1 >= 0)
            --_actPage;
        loadPage();
        return _movies;
    }
    private void loadPage() {
        _movies = _requestHandel.getPage(_pageName.get(_actPage));
    }
}
