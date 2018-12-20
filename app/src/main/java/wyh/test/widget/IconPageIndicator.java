package wyh.test.widget;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.widget.HorizontalScrollView;

import java.util.jar.Attributes;

import wyh.test.R;


public class IconPageIndicator extends HorizontalScrollView implements PageIndicator {
    private final IcsLinearLayout mIconsLayout;

    private ViewPager mViewPager;
    private ViewPager.OnPageChangeListener mListener;
    private Runnable mIconSelector;
    private int mSelectdIndex;
    public IconPageIndicator(Context context){
        this(context,null);
    }
    public IconPageIndicator(Context context ,AttributeSet attrs){
        super(context,attrs);
       setHorizontalFadingEdgeEnabled(false);
       mIconsLayout = new IcsLinearLayout(context, R.attr.vpiIconPageIndicatorStyle);
       addView(mIconsLayout,new LayoutParams(ViewPager.LayoutParams.WRAP_CONTENT,ViewPager.LayoutParams.MATCH_PARENT,Gravity.CENTER))
    }
    private void animateToIcon(final int position){
        final View iconView = mIconsLayout.getChildAt(position);
        if (mIconsLayout != null){
            removeCallbacks(mIconSelector);
        }
        mIconSelector = new Runnable() {
            @Override
            public void run() {
                final int scrollPos = iconView.getLeft()-(getWidth()-iconView.getWidth())/2;
                smoothScrollTo(scrollPos,0);
                mIconSelector = null;
            }
        };
        post(mIconSelector);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (mIconSelector != null){
            post(mIconSelector);
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (mIconSelector != null){
            removeCallbacks(mIconSelector);
        }
    }

    @Override
    public void onPageScrollStateChanged(int i) {
        if (mListener != null){
            mListener.onPageScrollStateChanged(i);
        }
    }

    @Override
    public void onPageScrolled(int i, float v, int i1) {
        if (mListener!=null){
            mListener.onPageScrolled(i, v, i1);
        }
    }

    @Override
    public void onPageSelected(int i) {
        setCurrentItem(i);
        if (mListener != null){
            mListener.onPageSelected(i);
        }
    }

    @Override
    public void setViewPager(ViewPager view) {
        if (mViewPager == view){
            return;
        }
        if (mViewPager != null){
            mViewPager.setOnPageChangeListener(null);
        }
        PagerAdapter adapter = view.getAdapter();
        if (adapter == null){
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        mViewPager = view;
        view.setOnPageChangeListener(this);
        notifyDataSetChanged();
    }

    @Override
    public void notifyDataSetChanged() {
        m
    }
}
