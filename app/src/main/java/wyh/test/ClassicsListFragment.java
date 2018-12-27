package wyh.test;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Map;

import wyh.test.R;
import wyh.test.controller.MainTabController;

public class ClassicsListFragment extends ListFragment {
    private MainTabController mtc;
    private ArrayList<Map<String,Object>> classicsEntryList;
    private static final String STATE_ACTIVATED_POSITION = "activated_position";
    private Callbacks mCallbacks = sDummyCallbacks;
    private int mActivatedPosition = ListView.INVALID_POSITION;

    public interface Callbacks {
        public void onClassicsIdSelected(int classicsId);
    }

    private static Callbacks sDummyCallbacks = new Callbacks() {
        @Override
        public void onClassicsIdSelected(int position) {

        }
    };

    public ClassicsListFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mtc = new MainTabController(getActivity());
        classicsEntryList = mtc.getClassicsEntryList();
        ArrayList<String> contents = new ArrayList<String>();

        for (int i = 0; i < classicsEntryList.size(); i++) {
            contents.add((i+1)+". "+(String.valueOf(classicsEntryList.get(i).get("question"))));
        }

        setListAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_expandable_list_item_1, android.R.id.text1, contents));
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState != null && savedInstanceState.containsKey(STATE_ACTIVATED_POSITION)){
            setActivatedPosition(savedInstanceState.getInt(STATE_ACTIVATED_POSITION));
        }
        view.setBackgroundResource(R.mipmap.bg_main_classics);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof Callbacks)){
            throw new IllegalStateException("Activity must implement framgment's callbacks.");
        }
        mCallbacks = (Callbacks) activity;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mCallbacks = sDummyCallbacks;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        int classicsId = (int) classicsEntryList.get(position).get("_id");
        mCallbacks.onClassicsIdSelected(classicsId);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        if (mActivatedPosition != ListView.INVALID_POSITION){
            outState.putInt(STATE_ACTIVATED_POSITION,mActivatedPosition);
        }
    }
    public void setActivateOnItemClick(boolean activateOnItemClick){
        getListView().setChoiceMode(activateOnItemClick ? ListView.CHOICE_MODE_SINGLE:ListView.CHOICE_MODE_NONE);
    }

    private void setActivatedPosition(int position){
        if (position == ListView.INVALID_POSITION){
            getListView().setItemChecked(mActivatedPosition,false);

        }else {
            getListView().setItemChecked(position,true);
        }
        mActivatedPosition =position;
    }
}
