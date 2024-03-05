public class BillPugh {
    private BillPugh() {
    }

    public static BillPugh getInstance() {
        return SingletonHelper.INSTANCE;
    }

    private static class SingletonHelper {
        private static final BillPugh INSTANCE = new BillPugh();
    }
    // TODO - Khai báo các thuộc tính cho lớp
}
