package wyh.test.model;

import android.content.Context;

import com.sj.dbtemplate.BaseDao;

import java.util.ArrayList;
import java.util.Map;

public  class SimplifyDao extends BaseDao {

    protected ArrayList<Map<String, Object>> getMapList(Context context, String table) {
        return super.getMapList(context, table,null, false, null,null, null,  null);
    }

    protected ArrayList<Map<String, Object>> getMapList(Context context, String table, String whereClause,  String limit) {
        return super.getMapList(context, table,whereClause, false, null, null, null, limit);
    }

    protected ArrayList<Map<String, Object>> getMapList(Context context, String table, String whereClause) {
        return super.getMapList(context, table,whereClause, false, null, null, null, null);
    }


    protected ArrayList<Integer> getIntegerList(Context context, String table, String showColumn, String whereClause) {
        return super.getIntegerList(context, table, showColumn, false, whereClause, null, null, null, null);
    }
    protected ArrayList<Integer> getIntegerList(Context context, String table, String showColumn) {
        return super.getIntegerList(context, table, showColumn, false, null, null, null, null, null);
    }


    protected ArrayList<Float> getFloatList(Context context, String table, String showColumn) {
        return super.getFloatList(context, table, showColumn, false, null, null, null, null, null);
    }
    protected ArrayList<Float> getFloatList(Context context, String table, String showColumn,String whereClause) {
        return super.getFloatList(context, table, showColumn, false, whereClause, null, null, null, null);
    }


    protected ArrayList<String> getStringList(Context context, String table, String showColumn) {
        return super.getStringList(context, table, showColumn, false, null, null, null, null, null);
    }
    protected ArrayList<String> getStringList(Context context, String table, String showColumn,String whereClause) {
        return super.getStringList(context, table, showColumn, false, whereClause, null, null, null, null);
    }


    protected ArrayList<byte[]> getBlobList(Context context, String table, String showColumn) {
        return super.getBlobList(context, table, showColumn, false, null, null, null, null, null);
    }
    protected ArrayList<byte[]> getBlobList(Context context, String table, String showColumn,String whereClause) {
        return super.getBlobList(context, table, showColumn, false, whereClause, null, null, null, null);
    }


    protected Map<String, Object> getMap(Context context, String table, String whereClause) {
        return super.getMap(context, table, whereClause, false, null, null, null, null);
    }

    protected Map<String, Object> getMap(Context context, String table, String whereClause,String orderBy,String limit) {
        return super.getMap(context, table, whereClause, false, null, null, orderBy, limit);
    }

}
