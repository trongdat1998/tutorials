package service.iplm;

import service.Chair;
import service.Table;

public abstract class FurnitureAbstractFactory {
    public abstract Chair createChair();

    public abstract Table createTable();
}
