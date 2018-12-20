package wyh.test.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

import wyh.test.ExamFrament;
import wyh.test.widget.IconPagerAdapter;

public class MainTabPagerAdapter extends FragmentPagerAdapter implements IconPagerAdapter {
    private List<String> titles;
    private List<Integer> icons;
    private static final int PAGE_EXAM = 0;
    private static final int PAGE_CLASSICS = 1;
    private static final int PAGE_MORE = 3;

    public MainTabPagerAdapter(List<String> titles, List<Integer> icons, FragmentManager fm) {
        super(fm);
        this.titles = titles;
        this.icons = icons;
    }

    public List<String> getTitles() {
        return titles;
    }

    public List<Integer> getIcons() {
        return icons;
    }

    @Override
    public int getIconResId(int index) {
        return icons.get(index % icons.size());
    }

    @Override
    public int getCount() {
        return titles.size();
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment =null;
        switch (position){
            case PAGE_EXAM:
                fragment = new ExamFrament();
                break;
            case PAGE_CLASSICS:
                fragment = new ExamFrament();
                break;
            case PAGE_MORE:
                fragment = new ExamFrament();
                break;
        }
        return fragment;
    }
}
