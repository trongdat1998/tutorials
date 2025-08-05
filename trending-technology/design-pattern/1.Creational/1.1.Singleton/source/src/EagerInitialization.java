public class EagerInitialization {
//    Start
    private EagerInitialization(){}
    private static final EagerInitialization INSTANCE = new EagerInitialization();
    public static EagerInitialization getInstance(){
        return INSTANCE;
    }
//    End
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        EagerInitialization eager1 = EagerInitialization.getInstance();
        eager1.setName("Join");
        System.out.println("Name1: " + eager1.getName());

        EagerInitialization eager2 = EagerInitialization.getInstance();
        System.out.println("Name2: " + eager2.getName() +"\n");
        System.out.println("Như vậy eager2 đã không được tạo lại");
    }
}




