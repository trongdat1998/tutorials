public class ClientTestEagerInitialization {
    public static void main(String[] args) {
        EagerInitialization eager1 = EagerInitialization.getInstance();
        eager1.setName("Join");

        EagerInitialization eager2 = EagerInitialization.getInstance();
        System.out.println(eager2);
    }

}
