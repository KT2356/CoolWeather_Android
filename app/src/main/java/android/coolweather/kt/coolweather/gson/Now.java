package android.coolweather.kt.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by KT on 08/09/2017.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
