package mixed;

import clojure.java.api.Clojure;
import clojure.lang.AFn;
import clojure.lang.Atom;
import clojure.lang.IFn;
import clojure.lang.PersistentVector;

import java.util.stream.Collectors;

public class JavaSome {
 
    public String thing = "javaSomeThing";

    public JavaSome(ScalaSome scalaSome) {
        // ScalaSome scalaSome = new ScalaSome();
        // System.out.println(scalaSome.thing());
        System.out.println("JavaSome: scalaSome: " + scalaSome.thing());

        IFn plus = Clojure.var("clojure.core", "+");
        System.out.println(plus.invoke(1, 2));
        // App app = new App();
        testSomeClojureCalls();

    }

    public void testSomeClojureCalls() {
        //Use existing Clojure classes - This can actually be fairly useful.
        // For example, java.util.Collections are mutable. Other immutable collection libraries aren't persistent and
        // don't have methods for destructive updates.
        final PersistentVector v = PersistentVector.create("I", "love", "turtles");
        System.out.println(v);
        System.out.println(v.assocN(1, "hate"));
        //One issue to be aware of is that Clojure doesn't care about generics so will show unchecked type warnings.
        //Be aware that generics erase all types anyways.
        System.out.println(v.stream().map(s -> ((String)s).length()).collect(Collectors.toList()));

        //If you want to use Clojure atoms in Java, go ahead.... It's a great way to manage application state.
        Atom a = new Atom(3);
        a.swap(new AFn() {
            @Override
            public Object invoke(Object arg1) {return (Integer)arg1 + 1;}
        });
        System.out.println("The state is: " + a.deref());
    }

    public static void main(String[] args) {
        ScalaSome scalaSome = new ScalaSome();
        JavaSome javaSome = new JavaSome(scalaSome);
        System.out.println(javaSome.thing);
    }
}
