package javatraining.oletsky.generics;

import java.lang.reflect.Method;

/**
 * @author O.Oletsky
 * This example illustrates the effect of erasure
 * The class of generic is the raw type regardless of type substitutions
 * Return type is Object regardless of type substitutions
 */
public class ErasureExplorer {
    public static void main(String[] args) throws Exception {
        GenericClass<String> ekz = new GenericClass<>("qwerty");
        ekz.setPole("kvak");
        Class <GenericClass> kl = GenericClass.class;
        System.out.println(ekz.getClass()); //GenericClass
        Method met = kl.getMethod("getPole");
        Class retType = met.getReturnType();
        System.out.println (retType.getSimpleName());  //Object
    }

}

class GenericClass<T> {
    T pole;

    public GenericClass(T pole) {
        this.pole = pole;
    }

    public T getPole() {
        return pole;
    }

    public void setPole(T pole) {
        this.pole = pole;
    }
}
