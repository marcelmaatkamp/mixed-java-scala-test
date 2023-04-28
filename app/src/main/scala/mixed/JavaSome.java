package mixed;

public class JavaSome {
 
    public String thing = "javaSomeThing";

    public JavaSome() {
        // ScalaSome scalaSome = new ScalaSome();
        // System.out.println(scalaSome.thing());
        var scalaSome = new mixed.ScalaSome();
        System.out.println("JavaSome: scalaSome: " + scalaSome.thing());

        // App app = new App();
        // App app = new App();

    }

    public static void main(String[] args) {
        JavaSome javaSome = new JavaSome();
        System.out.println(javaSome.thing);
    }
}
