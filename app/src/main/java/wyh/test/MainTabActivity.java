package wyh.test;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
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
}
