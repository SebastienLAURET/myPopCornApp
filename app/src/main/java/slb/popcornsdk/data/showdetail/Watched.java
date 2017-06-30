
package slb.popcornsdk.data.showdetail;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Watched {

    @SerializedName("watched")
    @Expose
    private Boolean watched;

    public Boolean getWatched() {
        return watched;
    }

    public void setWatched(Boolean watched) {
        this.watched = watched;
    }

}
