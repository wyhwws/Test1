package wyh.test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Map;

import wyh.test.model.QuestionBankService;

public class ClassicsActivity extends BaseActivity {
    private QuestionBankService questionBankService;
    private TextView tv_title;
    private TextView tv_classics_question;
    private TextView tv_classics_answer;
    private TextView tv_classics_show_answer;
    private Button btn_classics_show_answer;
    private boolean bl_answer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bl_answer = true;
        setContentView(R.layout.activity_classics);
        questionBankService = new QuestionBankService();
        Map<String,Object> enerty = questionBankService.getEntry(this,String.valueOf(getIntent().getIntExtra("questionId",1)));
        tv_title = findViewById(R.id.tv_title);
        tv_classics_answer = findViewById(R.id.tv_classics_answer);
        tv_classics_question = findViewById(R.id.tv_classics_question);
        btn_classics_show_answer = findViewById(R.id.btn_classics_show_answer);
        tv_title.setText("经典例题");
        tv_classics_question.setText(enerty.get("question").toString());
        tv_classics_question.setTextSize(22);
        tv_classics_answer.setText(enerty.get("answer").toString());
        tv_classics_question.setTextSize(18);
        tv_classics_answer.setVisibility(LinearLayout.INVISIBLE);


    }
    public void showAnswer(View view){
        if (bl_answer){
            btn_classics_show_answer.setText("隐藏答案");
            bl_answer=false;
        }else {
            btn_classics_show_answer.setText("显示答案");
            tv_classics_answer.setVisibility(View.INVISIBLE);
            bl_answer=true;
        }
    }
}
