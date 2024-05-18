package models;

public class GiongCayTrongMienNam {
    public String getTenGiong() {
        return tenGiong;
    }

    public void setTenGiong(String tenGiong) {
        this.tenGiong = tenGiong;
    }

    private String  tenGiong;

    public GiongCayTrongMienNam(String tenGiong) {
        this.tenGiong = tenGiong;
    }
    public static GiongCayTrongMienNam createObject(String tenGiongs) {
        return new GiongCayTrongMienNam( tenGiongs);
    }
}
