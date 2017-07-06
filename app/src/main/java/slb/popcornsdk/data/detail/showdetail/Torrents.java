
package slb.popcornsdk.data.detail.showdetail;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Torrents {

    @SerializedName("0")
    @Expose
    private slb.popcornsdk.data.detail.showdetail._0 _0;
    @SerializedName("480p")
    @Expose
    private slb.popcornsdk.data.detail.showdetail._480p _480p;
    @SerializedName("720p")
    @Expose
    private slb.popcornsdk.data.detail.showdetail._720p _720p;
    @SerializedName("1080p")
    @Expose
    private slb.popcornsdk.data.detail.showdetail._1080p _1080p;

    public slb.popcornsdk.data.detail.showdetail._0 get0() {
        return _0;
    }

    public void set0(slb.popcornsdk.data.detail.showdetail._0 _0) {
        this._0 = _0;
    }

    public slb.popcornsdk.data.detail.showdetail._480p get480p() {
        return _480p;
    }

    public void set480p(slb.popcornsdk.data.detail.showdetail._480p _480p) {
        this._480p = _480p;
    }

    public slb.popcornsdk.data.detail.showdetail._720p get720p() {
        return _720p;
    }

    public void set720p(slb.popcornsdk.data.detail.showdetail._720p _720p) {
        this._720p = _720p;
    }

    public slb.popcornsdk.data.detail.showdetail._1080p get1080p() {
        return _1080p;
    }

    public void set1080p(slb.popcornsdk.data.detail.showdetail._1080p _1080p) {
        this._1080p = _1080p;
    }

}
