package android.coolweather.kt.coolweather;

import android.coolweather.kt.coolweather.plugs.ServicePicListFragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import java.util.List;

public class Test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        View view = LayoutInflater.from(this).inflate(R.layout.menu_item_layout,null,false);

        LinearLayout ly = (LinearLayout)findViewById(R.id.ioioioioioioi);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        //noinspection RestrictedApi
        List<Fragment> fragments = getSupportFragmentManager().getFragments();

        for (Fragment fragment : fragments) {
            transaction.remove(fragment);
        }
        transaction.add(R.id.ioioioioioioi, new ServicePicListFragment());
        transaction.commit();

    }
}
