package slb.popcornsdk;

import java.util.ArrayList;

import slb.popcornsdk.data.page.shows.Show;
import slb.popcornsdk.Network.requesthandler.ShowRequestHandle;

/**
 * Created by lauret_s on 30/06/2017.
 */

public class ShowsBook extends ABook{
    public ShowsBook () {
        super(new ShowRequestHandle());
    }
}
