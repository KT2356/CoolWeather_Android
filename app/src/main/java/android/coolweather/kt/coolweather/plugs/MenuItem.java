package android.coolweather.kt.coolweather.plugs;

import android.content.Context;
import android.coolweather.kt.coolweather.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by KT on 18/09/2017.
 */

public class MenuItem extends LinearLayout {

    private TextView textView;
    private String text;

    public MenuItem(Context contxt, AttributeSet attrs) {
        super(contxt, attrs);

        LayoutInflater.from(contxt).inflate(R.layout.menu_item_layout,null,false);



    }



}
