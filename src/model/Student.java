package model;

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feespaid;
    private int feesTotal;

    public Student(int id, String name, int grade){
        this.feespaid=0;
        this.feesTotal=8000;
        this.id = id;
        this.name=name;
        this.grade=grade;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }

    public void payFees(int newfee){
        feespaid=feespaid + newfee;
        School.updateTotalMoneyEarned(feespaid);
    }
    public int getFeespaid(){
        return feespaid;
    }
    public int getFeesTotal(){
        return feesTotal;
    }

    public int getRemainingFees(){
        return feesTotal-feespaid;
    }

}
