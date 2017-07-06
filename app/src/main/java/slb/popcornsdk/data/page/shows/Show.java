
package slb.popcornsdk.data.page.shows;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import slb.popcornsdk.data.page.APage;
import slb.popcornsdk.data.page.Images;

public class Show extends APage {

    @SerializedName("num_seasons")
    @Expose
    private Integer numSeasons;

    public Integer getNumSeasons() {
        return numSeasons;
    }

    public void setNumSeasons(Integer numSeasons) {
        this.numSeasons = numSeasons;
    }

}
