public class DoubleCheckLocking {
    private DoubleCheckLocking(){}
    private static volatile  DoubleCheckLocking instance;

    public static DoubleCheckLocking getInstance(){
        if (instance == null){
            synchronized (DoubleCheckLocking.class){
                if (instance == null){
                    instance = new DoubleCheckLocking();
                }
            }
        }
        return instance;
    }
}
