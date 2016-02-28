package nju.brenda.msc.domain;

public class MscSiteCrawlRule {
    private Integer id;

    private Integer mscSiteId;

    private String nextPageUrlPtn;

    private String detailPageUrlPtn;

    private String downloadUrlPtn;

    private String mvNamePtn;

    private String mvChineseNamePtn;

    private String mvDirectorPtn;

    private String mvCountryPtn;

    private String mvCastingPtn;

    private String mvReleaseDatePtn;

    private String mvDoubanRatingPtn;

    private String mvImdbRatingPtn;

    private String mvDoubanRulPtn;

    private String mvPosterUrlPtn;

    private String uploadDatePtn;

    private Integer ctime;

    private Integer utime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMscSiteId() {
        return mscSiteId;
    }

    public void setMscSiteId(Integer mscSiteId) {
        this.mscSiteId = mscSiteId;
    }

    public String getNextPageUrlPtn() {
        return nextPageUrlPtn;
    }

    public void setNextPageUrlPtn(String nextPageUrlPtn) {
        this.nextPageUrlPtn = nextPageUrlPtn == null ? null : nextPageUrlPtn.trim();
    }

    public String getDetailPageUrlPtn() {
        return detailPageUrlPtn;
    }

    public void setDetailPageUrlPtn(String detailPageUrlPtn) {
        this.detailPageUrlPtn = detailPageUrlPtn == null ? null : detailPageUrlPtn.trim();
    }

    public String getDownloadUrlPtn() {
        return downloadUrlPtn;
    }

    public void setDownloadUrlPtn(String downloadUrlPtn) {
        this.downloadUrlPtn = downloadUrlPtn == null ? null : downloadUrlPtn.trim();
    }

    public String getMvNamePtn() {
        return mvNamePtn;
    }

    public void setMvNamePtn(String mvNamePtn) {
        this.mvNamePtn = mvNamePtn == null ? null : mvNamePtn.trim();
    }

    public String getMvChineseNamePtn() {
        return mvChineseNamePtn;
    }

    public void setMvChineseNamePtn(String mvChineseNamePtn) {
        this.mvChineseNamePtn = mvChineseNamePtn == null ? null : mvChineseNamePtn.trim();
    }

    public String getMvDirectorPtn() {
        return mvDirectorPtn;
    }

    public void setMvDirectorPtn(String mvDirectorPtn) {
        this.mvDirectorPtn = mvDirectorPtn == null ? null : mvDirectorPtn.trim();
    }

    public String getMvCountryPtn() {
        return mvCountryPtn;
    }

    public void setMvCountryPtn(String mvCountryPtn) {
        this.mvCountryPtn = mvCountryPtn == null ? null : mvCountryPtn.trim();
    }

    public String getMvCastingPtn() {
        return mvCastingPtn;
    }

    public void setMvCastingPtn(String mvCastingPtn) {
        this.mvCastingPtn = mvCastingPtn == null ? null : mvCastingPtn.trim();
    }

    public String getMvReleaseDatePtn() {
        return mvReleaseDatePtn;
    }

    public void setMvReleaseDatePtn(String mvReleaseDatePtn) {
        this.mvReleaseDatePtn = mvReleaseDatePtn == null ? null : mvReleaseDatePtn.trim();
    }

    public String getMvDoubanRatingPtn() {
        return mvDoubanRatingPtn;
    }

    public void setMvDoubanRatingPtn(String mvDoubanRatingPtn) {
        this.mvDoubanRatingPtn = mvDoubanRatingPtn == null ? null : mvDoubanRatingPtn.trim();
    }

    public String getMvImdbRatingPtn() {
        return mvImdbRatingPtn;
    }

    public void setMvImdbRatingPtn(String mvImdbRatingPtn) {
        this.mvImdbRatingPtn = mvImdbRatingPtn == null ? null : mvImdbRatingPtn.trim();
    }

    public String getMvDoubanRulPtn() {
        return mvDoubanRulPtn;
    }

    public void setMvDoubanRulPtn(String mvDoubanRulPtn) {
        this.mvDoubanRulPtn = mvDoubanRulPtn == null ? null : mvDoubanRulPtn.trim();
    }

    public String getMvPosterUrlPtn() {
        return mvPosterUrlPtn;
    }

    public void setMvPosterUrlPtn(String mvPosterUrlPtn) {
        this.mvPosterUrlPtn = mvPosterUrlPtn == null ? null : mvPosterUrlPtn.trim();
    }

    public String getUploadDatePtn() {
        return uploadDatePtn;
    }

    public void setUploadDatePtn(String uploadDatePtn) {
        this.uploadDatePtn = uploadDatePtn == null ? null : uploadDatePtn.trim();
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