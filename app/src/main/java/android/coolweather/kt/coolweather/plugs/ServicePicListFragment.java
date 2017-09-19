package android.coolweather.kt.coolweather.plugs;

import android.coolweather.kt.coolweather.parent.dcFragment;
import android.coolweather.kt.coolweather.plugAdapter.ServicePicListAdapter;
import android.coolweather.kt.coolweather.plugBean.AppBean;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KT on 19/09/2017.
 */

public class ServicePicListFragment extends dcFragment {

    private List<AppBean> mlist = new ArrayList<>();

    @Override
    public void init(View parent) {
        super.init(parent);
        AppBean a1 = new AppBean("http://www.zaichengdu.com/pic/2017/06/28/14/2affe7704adb46e3ab9b20c7c827ce40.jpg");
        AppBean a2 = new AppBean("http://www.zaichengdu.com/pic/2017/03/10/15/ec20e1fd6e7a48d8ae195e7e6950c733.jpg");
        AppBean a3 = new AppBean("http://www.zaichengdu.com/pic/2017/03/10/16/7797c38e271c4faca97c476b721512c5.jpg");

        mlist.add(a1);
        mlist.add(a2);
        mlist.add(a3);

        ServicePicListAdapter adapter = new ServicePicListAdapter(mlist);
        recyclerView.setAdapter(adapter);

    }

}
