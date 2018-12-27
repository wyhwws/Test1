package wyh.test.model;

import android.content.ContentValues;

import java.io.Serializable;

public class QuestionTypeEntry implements Serializable {
    private int _id;
    private String description ="";

    public QuestionTypeEntry(String description) {
        super();
        this.description = description;
    }

    public QuestionTypeEntry() {

    }

    public int get_id() {

        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public ContentValues getContentValuesByEntry(){
        ContentValues values = new ContentValues();
        values.put("description",description);
        return values;
    }
}
