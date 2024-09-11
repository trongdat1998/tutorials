public class StaticBlockSingleton {
    //Start
    private StaticBlockSingleton() {}
    private static final StaticBlockSingleton INSTANCE;

    static {
        try {
            INSTANCE = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    public static StaticBlockSingleton getInstance() {
        return INSTANCE;
    }
    //End

    //Create object
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Run demo
    public static void main(String[] args) {
        StaticBlockSingleton eager1 = StaticBlockSingleton.getInstance();
        eager1.setName("Join");
        System.out.println("Name1: " + eager1.getName());

        StaticBlockSingleton eager2 = StaticBlockSingleton.getInstance();
        System.out.println("Name2: " + eager2.getName() +"\n");
        System.out.println("Như vậy eager2 đã không được tạo lại");
    }
}
