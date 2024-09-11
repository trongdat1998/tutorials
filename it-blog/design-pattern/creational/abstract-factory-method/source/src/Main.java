import models.MaterialType;
import service.Chair;
import service.iplm.FurnitureAbstractFactory;
import service.Table;
import service.iplm.FurnitureFactory;

public class Main {
    public static void main(String[] args) {
        FurnitureAbstractFactory factory = FurnitureFactory.getFactory(MaterialType.FLASTIC);

        Chair chair = factory.createChair();
        chair.create(); // Create plastic chair

        Table table = factory.createTable();
        table.create(); // Create plastic table
    }
}