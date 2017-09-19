package android.coolweather.kt.coolweather.plugAdapter;

import android.coolweather.kt.coolweather.R;
import android.coolweather.kt.coolweather.plugBean.AppBean;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by KT on 19/09/2017.
 */

public class ServicePicListAdapter extends RecyclerView.Adapter <ServicePicListAdapter.ViewHolder> {

    private List<AppBean> mList;
    private ViewGroup viewGroup;

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView)itemView.findViewById(R.id.plug_service_pic_list_item_imageview);
        }
    }

    public ServicePicListAdapter(List<AppBean> mList) {
        this.mList = mList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.plug_service_pic_list_item, parent, false);
        viewGroup = parent;
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        AppBean appBean = mList.get(position);
        Glide.with(viewGroup.getContext()).load(appBean.getImageUrl()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}
