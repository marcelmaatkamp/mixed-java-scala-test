package mixed;

import clojure.java.api.Clojure;
import clojure.lang.IFn;

public class JavaSome {
 
    public String thing = "javaSomeThing";

    public JavaSome() {
        // ScalaSome scalaSome = new ScalaSome();
        // System.out.println(scalaSome.thing());
        var scalaSome = new ScalaSome();
        System.out.println("JavaSome: scalaSome: " + scalaSome.thing());

        IFn plus = Clojure.var("clojure.core", "+");
        System.out.println(plus.invoke(1, 2));
        // App app = new App();
        // App app = new App();

    }

    public static void main(String[] args) {
        JavaSome javaSome = new JavaSome();
        System.out.println(javaSome.thing);
    }
}
