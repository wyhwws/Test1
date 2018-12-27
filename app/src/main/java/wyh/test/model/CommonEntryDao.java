package wyh.test.model;

import android.content.ContentValues;
import android.content.Context;

import java.util.ArrayList;
import java.util.Map;

public abstract class CommonEntryDao extends SimplifyDao {
    private static final String SUFIX = "Service";
    private String tableName = getTableName();

    public ArrayList<Map<String, Object>> getEntryList(Context context) {
        return super.getMapList(context, tableName);
    }

    public ArrayList<Map<String, Object>> getEntryList(Context context, String whereClause) {
        return super.getMapList(context, tableName, whereClause);
    }

    public ArrayList<Map<String, Object>> getEntryList(Context context, String whereClause, String limit) {
        return super.getMapList(context, tableName, whereClause, limit);
    }


    protected ArrayList<Integer> getIntegerList(Context context, String showColumn) {
        return super.getIntegerList(context, tableName, showColumn);
    }

    protected ArrayList<Integer> getIntegerList(Context context, String showColumn, String whereClause) {
        return super.getIntegerList(context, tableName, showColumn, whereClause);
    }


    protected ArrayList<Float> getFloatList(Context context, String showColumn, String whereClause) {
        return super.getFloatList(context, tableName, showColumn, whereClause);
    }

    protected ArrayList<Float> getFloatList(Context context, String showColumn) {
        return super.getFloatList(context, tableName, tableName, showColumn);
    }


    protected ArrayList<String> getStringList(Context context, String showColumn) {
        return super.getStringList(context, tableName, showColumn);
    }

    protected ArrayList<String> getStringList(Context context, String showColumn, String whereClause) {
        return super.getStringList(context, tableName, showColumn, whereClause);
    }


    protected Map<String, Object> getEntry(Context context, String whereClause) {
        return super.getMap(context, tableName, whereClause);
    }

    public boolean add(Context context, ContentValues values) {
        return super.add(context, tableName, values);
    }

    public boolean update(Context context, ContentValues setValues, String whereClause) {
        return super.update(context, tableName, setValues, whereClause);
    }
    public boolean delete(Context context,String whereClause){
        return super.delete(context,tableName,whereClause);
    }

    private String getTableName() {
        String className = getClass().getSimpleName();
        int indexOfSuffix = className.indexOf(SUFIX);
        return className.substring(0, indexOfSuffix);
    }
}
