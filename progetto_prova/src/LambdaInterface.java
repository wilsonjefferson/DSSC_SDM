public class LambdaInterface {

    /*
    * INNER INTERFACE (OR NESTED INTERFACE)
    *
    * Since nested interface cannot be accessed directly, the main purpose
    * of using them is to resolve the namespace by grouping related
    * interfaces (or related interface and class) together.
    *
    * 1. solving the namespacing issue when the interface has a common name
    * 2. increasing encapsulation
    * 3. increasing readability by grouping related interfaces in one place
    *
    * They are implicitly public and static as well as their fields
    * when declared in another interface ( similar to field declarations
    * in top-level interfaces).
    * */

    // exactly one abstract method

    @FunctionalInterface
    interface DoubleDoubleFunction<T>{
        T apply(T x, T y);
    }

    @FunctionalInterface
    interface IntIntFunction<R>{
        R apply(R x, R y);
    }
}
