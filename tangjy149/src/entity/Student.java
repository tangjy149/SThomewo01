package entity;

public class Student {

    private int Sid;
    private String SbirthDay;
    private String Sname;
    private boolean Ssex;

    public int getSid() {
        return Sid;
    }

    public void setSid(int Sid) {
        this.Sid = Sid;
    }

    public String getSbirthDay() {
        return SbirthDay;
    }

    public void setSbirthDay(String SbirthDay) {
        this.SbirthDay = SbirthDay;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String Sname) {
        this.Sname = Sname;
    }

    public boolean getSsex() {
        return Ssex;
    }

    public void setSsex(boolean Ssex) {
        this.Ssex = Ssex;
    }

}
