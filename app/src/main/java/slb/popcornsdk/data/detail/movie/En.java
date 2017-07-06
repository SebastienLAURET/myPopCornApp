
package slb.popcornsdk.data.detail.movie;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class En {

    @SerializedName("1080p")
    @Expose
    private slb.popcornsdk.data.detail.movie._1080p _1080p;
    @SerializedName("720p")
    @Expose
    private slb.popcornsdk.data.detail.movie._720p _720p;

    public slb.popcornsdk.data.detail.movie._1080p get1080p() {
        return _1080p;
    }

    public void set1080p(slb.popcornsdk.data.detail.movie._1080p _1080p) {
        this._1080p = _1080p;
    }

    public slb.popcornsdk.data.detail.movie._720p get720p() {
        return _720p;
    }

    public void set720p(slb.popcornsdk.data.detail.movie._720p _720p) {
        this._720p = _720p;
    }

}
