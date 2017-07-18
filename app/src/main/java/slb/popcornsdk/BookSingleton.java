package slb.popcornsdk;

/**
 * Created by snrla on 17/07/2017.
 */

public class BookSingleton {
    private static boolean moviesOrShow = true;
    private static ABook ourInstance = new MoviesBook();

    public ABook swMovShow(){
        moviesOrShow = !moviesOrShow;
        if (moviesOrShow) {
            ourInstance = new MoviesBook();
        } else {
            ourInstance = new ShowsBook();
        }
        return ourInstance;
    }

    public ABook getInstance() {
        return ourInstance;
    }

}
