package wyh.test.model;

import android.content.Context;

import java.util.ArrayList;
import java.util.Map;

public class QuestionTypeService extends CommonEntryDao {
    public ArrayList<Map<String,Object>> getQuestionClassList(Context context){
        return super.getEntryList(context);
    }
}
