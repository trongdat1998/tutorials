package models;

public class GiongCayTrongTayNghuyen {

    public String getTenGiong() {
        return tenGiong;
    }

    public void setTenGiong(String tenGiong) {
        this.tenGiong = tenGiong;
    }

    private String  tenGiong;

    public GiongCayTrongTayNghuyen(String tenGiong) {
        this.tenGiong = tenGiong;
    }
    public static GiongCayTrongTayNghuyen createObject(String tenGiongs) {
        return new GiongCayTrongTayNghuyen( tenGiongs);
    }
}
