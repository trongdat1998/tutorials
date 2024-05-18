import models.GiongCayTrongTayNghuyen;
import service.GiongCayTrongFactoryService;
import service.iplm.TayNguyenFactoryServiceImpl;

public class MaiTestFactoryMethodPattern {
    public static void main(String[] args) {
        System.out.println("Chọn giống cho 12 nông dân ở Tây Nguyên");
        GiongCayTrongFactoryService tayNguyenFactory = new TayNguyenFactoryServiceImpl();
        for (int i = 1; i <= 12; i++) {
            GiongCayTrongTayNghuyen giongDuocChon = tayNguyenFactory.chonGiong();
            System.out.println(String.format("Nguời thứ %d nhận được giống của %s", i, giongDuocChon.getTenGiong()));
        }
//        System.out.println("-----");
//        System.out.println("Chọn giống cho 12 nông dân ở Đồng bằng sông Cửu Long");
//        GiongCayTrongFactoryService dbSCLFactory = new DBSongCuuLongFactoryServiceImpl();
//        for (int i = 1; i <= 12; i++) {
//            GiongCayTrong giongDuocChon  = dbSCLFactory.chonGiong();
//            System.out.println(String.format("Nguời thứ %d nhận được giống của %s", i, giongDuocChon));
//        }
    }
}