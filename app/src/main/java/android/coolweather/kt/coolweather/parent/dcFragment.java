package android.coolweather.kt.coolweather.parent;

import android.coolweather.kt.coolweather.R;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by KT on 19/09/2017.
 */

public class dcFragment extends Fragment {

    public RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dc_fragment_layout, container, false);
        init(view);
        return view;
    }

    public void init(View parent) {
        recyclerView = parent.findViewById(R.id.dc_fragment_recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(parent.getContext());
        recyclerView.setLayoutManager(layoutManager);
    }


}
