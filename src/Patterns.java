public class Patterns {
    private static Patterns instance;
    private static Object obj;

    private Patterns() {

    }

    public static Patterns getobj() {

        if (instance == null) {
            Patterns obj = new Patterns();
        }
            return instance;
    }


    public static void main(String[] args) {
         Patterns s=Patterns.getobj();

    }

}
