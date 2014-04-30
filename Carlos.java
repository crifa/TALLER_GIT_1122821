public class Carlos{
    private static Carlos INSTANCE = new Singleton();
    private Singleton() {}
 
    public static Carlos getInstance() {
        return INSTANCE;
    }
}