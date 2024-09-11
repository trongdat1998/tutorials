package service.iplm.plastic;

import service.Chair;
import service.iplm.FurnitureAbstractFactory;
import service.Table;

public class FlasticFactory extends FurnitureAbstractFactory {
    @Override
    public Chair createChair() {
        return new PlasticChair();
    }

    @Override
    public Table createTable() {
        return new PlasticTable();
    }
}
