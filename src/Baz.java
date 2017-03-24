public class Baz {
    private static String x ;
    private String y ;
    public Baz ( String z ) {
        y = x ;
        x += z ;
    }
    public void printVals () {
        System.out.println ( x );
        System.out. println ( y );
    }
    public static void main (String[] args) {
        x = "enjoy" ;
        Baz b1 = new Baz ( "fall" );
        b1 . printVals ();
        Baz b2 = new Baz ( "break" );
        b1 . printVals ();
        b2 . printVals ();
    }
}