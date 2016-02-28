package nju.brenda.msc.domain;

public class MscMovieResource {
    private Integer id;

    private Integer mscMovieId;

    private Integer mscSiteId;

    private String sourceUrl;

    private String downloadUrl;

    private Integer ctime;

    private Integer utime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMscMovieId() {
        return mscMovieId;
    }

    public void setMscMovieId(Integer mscMovieId) {
        this.mscMovieId = mscMovieId;
    }

    public Integer getMscSiteId() {
        return mscSiteId;
    }

    public void setMscSiteId(Integer mscSiteId) {
        this.mscSiteId = mscSiteId;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl == null ? null : sourceUrl.trim();
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl == null ? null : downloadUrl.trim();
    }

    public Integer getCtime() {
        return ctime;
    }

    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }

    public Integer getUtime() {
        return utime;
    }

    public void setUtime(Integer utime) {
        this.utime = utime;
    }
}