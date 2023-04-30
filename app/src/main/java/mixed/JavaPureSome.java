package mixed;

import clojure.java.api.Clojure;

public class JavaPureSome {
    public static final String thing = "mixed.JavaPureSome";

    public JavaPureSome() {
        // JavaSome javaSome;
        System.out.println("Clojure: plus: " + Clojure.var("clojure.core", "+").invoke(1,2));

    }
}
