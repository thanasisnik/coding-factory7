package gr.aueb.cf.ch8;

public class NullPointerExceptionApp {
    public static void main(String[] args) {
        String s = null;
        if (s != null && s.equals("Athens")){
            System.out.println("EQUALS");
        } else {
            System.out.println("Not equals");
        }
    }
}
