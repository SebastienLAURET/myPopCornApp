
package slb.popcornsdk.data.detail.movie;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class _1080p {

    @SerializedName("provider")
    @Expose
    private String provider;
    @SerializedName("filesize")
    @Expose
    private String filesize;
 /*   @SerializedName("size")
    @Expose
    private Integer size;*/
    @SerializedName("peer")
    @Expose
    private Integer peer;
    @SerializedName("seed")
    @Expose
    private Integer seed;
    @SerializedName("url")
    @Expose
    private String url;

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getFilesize() {
        return filesize;
    }

    public void setFilesize(String filesize) {
        this.filesize = filesize;
    }
/*
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
*/
    public Integer getPeer() {
        return peer;
    }

    public void setPeer(Integer peer) {
        this.peer = peer;
    }

    public Integer getSeed() {
        return seed;
    }

    public void setSeed(Integer seed) {
        this.seed = seed;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
