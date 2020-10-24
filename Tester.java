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


    int[][] C =  {
                  {1, 3, 4, 5, 6, -10, 1},
                  {4, 5, 5, 4, 3, 2, 3},
                }; //{5, 8, 9, 9, 9, -8, 4}
    int[][] D = {
                  {-1},
                  {0},
                  {3},
                  {4},
                  {5}
                };
    int[][] E = {{}};
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
    System.out.println("----------sum(2d)----------");
    System.out.println( ArrayOps.sum(f));
    System.out.println( ArrayOps.sum(A));
    System.out.println("----------sumCols----------");
    System.out.println( Arrays.toString(ArrayOps.sumCols(A)));
    System.out.println(Arrays.toString(ArrayOps.sumCols(C)));
    System.out.println(Arrays.toString(ArrayOps.sumCols(D)));
    System.out.println(Arrays.toString(ArrayOps.sumCols(E)));
  }
}
