package slb.popcornsdk.data.detail;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by snrla on 02/07/2017.
 */

public class ADetail {
    @SerializedName("title")//
    @Expose
    private String title;
    @SerializedName("year")//
    @Expose
    private String year;
    @SerializedName("synopsis")//
    @Expose
    private String synopsis;
    @SerializedName("runtime")//
    @Expose
    private String runtime;
    @SerializedName("genres")//
    @Expose
    private List<String> genres = null;
    @SerializedName("images")//
    @Expose
    private Images images;
  /*  @SerializedName("rating")//
    @Expose
    private Rating rating;
*/
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

  /*  public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }
*/
}
