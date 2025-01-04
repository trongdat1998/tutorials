package service.iplm.plastic;

import service.Chair;

public class PlasticChair implements Chair {
    @Override
    public void create() {
        System.out.println("Create wood chair");
    }
}
