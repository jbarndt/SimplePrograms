import java.util.Collection;
import java.util.*;

public class Bar extends Foo {
    public Bar ( String y ) {
        System.out.println ( y );
        System.out.println ( z );
    }
    public void print ( int x ) {
        print ( x / 4.0);
    }
    public void print ( String x ) {
        print ( x . length () / 2);
        System . out . println ( x );
    }
    public static void main (String [] args) {
        Foo test = new Bar ( "CS" + 251);
        test . print ( "Exam" );
    }



    public static int printWithIterator (
            Collection <String> collection ) {
        if (collection.isEmpty() == false){
            String s = null;
            Iterator <String> iter = collection.iterator();
            while ( iter.hasNext ()) {
                System.out.println ( iter.next());
                s = s + iter.next();
            }
            return s.length();
        }
        return -1;
    }
}