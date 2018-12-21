package wyh.test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Window;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

import wyh.test.adapter.MainTabPagerAdapter;
import wyh.test.controller.MainTabController;
import wyh.test.widget.IconPageIndicator;

public class MainTabActivity extends FragmentActivity {
    private ViewPager main_tab_pager;
    private IconPageIndicator main_tab_icon_indicator;
    private MainTabPagerAdapter mtpa;
    private MainTabController mtc;
    private TextView tv_title;

     private  static Timer tExit;
     private static TimerTask task;
     private static boolean isExit = false;
     private static boolean hasTast = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main_tab);
        mtc =new MainTabController(conte)
    }
}
