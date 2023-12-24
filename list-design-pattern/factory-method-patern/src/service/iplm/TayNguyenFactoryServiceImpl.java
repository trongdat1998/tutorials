package service.iplm;

import models.GiongCayTrongTayNghuyen;
import service.GiongCayTrongFactoryService;

import java.util.Random;

public class TayNguyenFactoryServiceImpl implements GiongCayTrongFactoryService {
    @Override
    public GiongCayTrongTayNghuyen chonGiong() {
        Random chonGiongNgauNhien = new Random();
        int ramdom = chonGiongNgauNhien.nextInt(3);
        switch (ramdom) {
            case 0:
                return GiongCayTrongTayNghuyen.createObject("Cây Cam");
            case 1:
                return GiongCayTrongTayNghuyen.createObject("Cây Xoài");
            case 2:
                return GiongCayTrongTayNghuyen.createObject("Cây Nhãn");
            default:
                return null;
        }
    }
}
