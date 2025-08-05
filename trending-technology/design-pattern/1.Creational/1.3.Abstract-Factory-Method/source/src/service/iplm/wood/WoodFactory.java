package service.iplm.wood;

import service.Chair;
import service.iplm.FurnitureAbstractFactory;
import service.Table;

public class WoodFactory extends FurnitureAbstractFactory {
    @Override
    public Chair createChair() {
        return new WoodChair();
    }

    @Override
    public Table createTable() {
        return new WoodTable();
    }
}
