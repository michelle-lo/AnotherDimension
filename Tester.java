import java.util.Arrays;

public class Tester {
  public static void main (String[] args) {

    int [] a = {1, 2, 3};
    int [] b = {5, 6, 7, 8, 9};
    int [] c = {5, 5, 5, 5, 9};
    int [] d = {10, 6, 4, 2, -1};
    int [] e = {-10, -4, -11, -20, -10000};

    int[][] f = {a, b, c, d, e};

    int[][]  A = { {  1,  0, 12, -1 },
                  {  7, -2,  2,  1 },
                  { -5, -2,  2, -9 }
               };
    int[]  B  =   {  1, 3, 5 };
    System.out.println("----------Sum----------");
    System.out.println(ArrayOps.sum(a));
    System.out.println(ArrayOps.sum(b));
    System.out.println(ArrayOps.sum(c));
    System.out.println(ArrayOps.sum(d));
    System.out.println(ArrayOps.sum(e));
    System.out.println("----------ArrayOps----------");
    System.out.println(ArrayOps.largest(a));
    System.out.println(ArrayOps.largest(b));
    System.out.println(ArrayOps.largest(c));
    System.out.println(ArrayOps.largest(d));
    System.out.println(ArrayOps.largest(e));
    System.out.println("----------sumRows----------");
    System.out.println(Arrays.toString(ArrayOps.sumRows(f)));
    System.out.println(Arrays.toString(ArrayOps.sumRows(A)));
    System.out.println("----------largestInRows----------");
    System.out.println(Arrays.toString(ArrayOps.largestInRows(f)));
    System.out.println(Arrays.toString(ArrayOps.largestInRows(A)));
  }
}
