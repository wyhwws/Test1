package wyh.test.model;

import android.content.ContentValues;

import java.io.Serializable;

public class QuestionBankEntry implements Serializable {
    private int _id;
    private int type;
    private int classId;
    private int subClassId;
    private int difficult;
    private String question = "";
    private String opt1 = "";
    private String opt2 = "";
    private String opt3 = "";
    private String opt4 = "";
    private String answer = "";
    private String explain = "";
    private int answeredTime;
    private int rightTime;
    private int wrongTime;
    private int collectedFlag;
    private int isWrongFlag;

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getSubClassId() {
        return subClassId;
    }

    public void setSubClassId(int subClassId) {
        this.subClassId = subClassId;
    }

    public int getDifficult() {
        return difficult;
    }

    public void setDifficult(int difficult) {
        this.difficult = difficult;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOpt1() {
        return opt1;
    }

    public void setOpt1(String opt1) {
        this.opt1 = opt1;
    }

    public String getOpt2() {
        return opt2;
    }

    public void setOpt2(String opt2) {
        this.opt2 = opt2;
    }

    public String getOpt3() {
        return opt3;
    }

    public void setOpt3(String opt3) {
        this.opt3 = opt3;
    }

    public String getOpt4() {
        return opt4;
    }

    public void setOpt4(String opt4) {
        this.opt4 = opt4;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public int getAnsweredTime() {
        return answeredTime;
    }

    public void setAnsweredTime(int answeredTime) {
        this.answeredTime = answeredTime;
    }

    public int getRightTime() {
        return rightTime;
    }

    public void setRightTime(int rightTime) {
        this.rightTime = rightTime;
    }

    public int getWrongTime() {
        return wrongTime;
    }

    public void setWrongTime(int wrongTime) {
        this.wrongTime = wrongTime;
    }

    public int getCollectedFlag() {
        return collectedFlag;
    }

    public void setCollectedFlag(int collectedFlag) {
        this.collectedFlag = collectedFlag;
    }

    public int getIsWrongFlag() {
        return isWrongFlag;
    }

    public void setIsWrongFlag(int isWrongFlag) {
        this.isWrongFlag = isWrongFlag;
    }

    public QuestionBankEntry(int type, int classId, int subClassId,
                             int difficult, String question, String opt1, String opt2, String opt3, String opt4,
                             String answer, String explain, int answeredTime, int rightTime, int wrongTime, int collectedFlag, int isWrongFlag) {
        super();
        this.type = type;
        this.classId = classId;
        this.subClassId = subClassId;
        this.difficult = difficult;
        this.question = question;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.answer = answer;
        this.explain = explain;
        this.answeredTime = answeredTime;
        this.rightTime = rightTime;
        this.wrongTime = wrongTime;
        this.collectedFlag = collectedFlag;
        this.isWrongFlag = isWrongFlag;
    }

    public QuestionBankEntry() {

    }

    public ContentValues getContentValuesByEntry() {
        ContentValues values = new ContentValues();
        values.put("type", type);
        values.put("classId", classId);
        values.put("subClassId", subClassId);
        values.put("difficult", difficult);
        values.put("question", question);
        values.put(" opt1", opt1);
        values.put("opt2", opt2);
        values.put("opt3",opt3);
        values.put("opt4", opt4);
        values.put("answer", answer);
        values.put("answeredTime",answeredTime);
        values.put(" rightTime", rightTime);
        values.put("wrongTime", wrongTime);
        values.put("collectedFlag",collectedFlag);
        values.put("isWrongFlag", isWrongFlag);
       return values;
    }


}
