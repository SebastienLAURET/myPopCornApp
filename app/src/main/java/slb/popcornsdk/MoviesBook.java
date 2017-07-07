package slb.popcornsdk;

import java.util.ArrayList;

import slb.popcornsdk.data.page.APage;
import slb.popcornsdk.data.page.movie.Movie;
import slb.popcornsdk.Network.requesthandler.MovieRequestHandle;

/**
 * Created by lauret_s on 30/06/2017.
 */

public class MoviesBook extends ABook{
    public MoviesBook() {
        super(new MovieRequestHandle());
    }

}
