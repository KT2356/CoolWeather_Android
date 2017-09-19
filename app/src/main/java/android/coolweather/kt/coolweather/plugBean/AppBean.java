package android.coolweather.kt.coolweather.plugBean;

/**
 * Created by KT on 19/09/2017.
 */

public class AppBean {

    private String imageUrl;

    public AppBean(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
