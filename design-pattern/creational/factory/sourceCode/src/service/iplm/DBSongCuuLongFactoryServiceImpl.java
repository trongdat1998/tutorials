package service.iplm;

import models.GiongCayTrongMienNam;
import service.GiongCayTrongFactoryService;

public class DBSongCuuLongFactoryServiceImpl implements GiongCayTrongFactoryService {
    private int count = 0;

    @Override
    public GiongCayTrongMienNam chonGiong() {
        switch (count) {
            case 0:
                count++;
                return GiongCayTrongMienNam.createObject("Cam");
            case 1:
                count++;
                return GiongCayTrongMienNam.createObject("Cây Xoài");
            case 2:
                count++;
                return GiongCayTrongMienNam.createObject("Cây Nhãn");
            case 3:
                count = 0;
                return GiongCayTrongMienNam.createObject("Mít");
            default:
                count = 0;
                return null;
        }
    }
}
