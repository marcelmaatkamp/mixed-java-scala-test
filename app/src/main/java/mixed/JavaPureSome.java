package mixed;

import clojure.java.api.Clojure;

public class JavaPureSome {
    public String thing = "mixed.JavaPureSome";

    public void setThing(String thing) {
        this.thing = thing;
    }

    public String getThing() {
        return thing;
    }

    public JavaPureSome() {
        // JavaSome javaSome;
        System.out.println("Clojure: plus: " + Clojure.var("clojure.core", "+").invoke(1,2));
    }
}
