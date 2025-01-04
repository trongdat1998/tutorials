public class ThreadSafe {
    private ThreadSafe(){}
    private static ThreadSafe instance;

    public static synchronized ThreadSafe getInstance(){
        if (instance == null){
            instance = new ThreadSafe();
        }
        return instance;
    }
}
