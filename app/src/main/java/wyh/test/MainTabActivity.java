package wyh.test;

import android.content.Intent;
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

public class MainTabActivity extends FragmentActivity implements MoreListFragment.Callbacks,ClassicsListFragment.Callbacks{
    private ViewPager main_tab_pager;
    private IconPageIndicator main_tab_icon_indicator;

    private MainTabController mtc;
    private TextView tv_title;
    private MainTabPagerAdapter mtpa;

    private static Timer tExit;
    private static TimerTask task;
    private static boolean isExit = false;
    private static boolean hasTast = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main_tab);
        mtc = new MainTabController(this);
        main_tab_pager = (ViewPager) findViewById(R.id.main_tab_pager);

        main_tab_icon_indicator = (IconPageIndicator) findViewById(R.id.main_tab_icon_indicator);
        mtpa = mtc.getPagerAdapter(getSupportFragmentManager());
        main_tab_icon_indicator.setViewPager(main_tab_pager);
        int page = getIntent().getIntExtra("page", -1);
        if (page < 0) {
            switchPage(0);
        } else {
            switchPage(page);
        }
        tExit = new Timer();
        task = new TimerTask() {
            @Override
            public void run() {
                isExit = false;
                hasTast = true;
            }
        };
    }

    private void switchPage(int position) {
        tv_title = findViewById(R.id.tv_title);
        main_tab_pager.setCurrentItem(position);
        tv_title.setText(mtpa.getTitles().get(position));
        main_tab_pager.setOnPageChangeListener(getOnPageChangeListener());
    }

    public void onMoreItemSelected(int position) {
        Intent intent = null;
        switch (position) {
            case 0:
            case 1:
            case 2:
                intent = new Intent(this, MoreDetailsActivity.class);
                intent.putExtra("position", position);
                break;
            case 3:
                default:break;
        }
        if (intent!=null){
            startActivity(intent);
        }
    }

    private ViewPager.OnPageChangeListener getOnPageChangeListener() {
        return (new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                tv_title.setText(mtpa.getTitles().get(i));
                main_tab_icon_indicator.setCurrentItem(i);
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
    }

    @Override
    public void onClassicsIdSelected(int classicsId) {
        Intent intent = new Intent(this,ClassicsActivity.class);
        intent.putExtra("QuestionId",classicsId);
        startActivity(intent);
    }
}
