package wyh.test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

public class MoreDetailsActivity extends BaseActivity {
    private TextView tv_title;
    private  TextView tv_more_details;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_details);
        tv_title = findViewById(R.id.tv_title);
        tv_more_details = findViewById(R.id.tv_more_details);
        int position = getIntent().getIntExtra("position",0);
        tv_more_details.setText(getResources().getStringArray(R.array.more_details)[position]);
        tv_title.setText(getResources().getStringArray(R.array.main_title)[position]);
    }
}
