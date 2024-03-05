public class LazyInitialization {
//  start
    private static LazyInitialization instance;

    private LazyInitialization(){

    }
    public static LazyInitialization getInstance(){
        if (instance == null){
            instance = new LazyInitialization();
        }
        return instance;
    }
//    end
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //     Chạy hàm main để hiểu rõ cách hoạt động EagerInitialization
    public static void main(String[] args) {
        LazyInitialization lazy1 = LazyInitialization.getInstance();
        lazy1.setName("Join");
        System.out.println("Name1: " + lazy1.getName());

        LazyInitialization lazy2 = LazyInitialization.getInstance();
        System.out.println("Name2: " + lazy2.getName() +"\n");
        System.out.println("Như vậy eager2 đã không được tạo lại");
     }
}
