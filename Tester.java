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
                }; 
    int[][] D = {
                  {-1},
                  {0},
                  {3},
                  {4},
                  {5}
                };
    int[][] E = {{}};
    int[][] F = { {  1,  2, 3, 4 },
                  {  2, 3,  4,  1 },
                  { 3, 4,  1, 2 } };
    int[][] G = {{0,0,0,0,0},
                {0,0,0,0,0}
                };
    int[][] H = {{10}};
    int[][] I =  {
                  {1, 2, 3, 4},
                  {-2, 3, 4, 5},
                  {-1, -1, -1, 13},
                  {20, -9, -3, 2}
                };
    int[][] J = {
                  {1, 2, 32, 4},
                  {-82, 763, 43, 95},
                  {-21, 231, -54351, 123},
                  {2230, -39, -23, 2443}
                };
    int[][] K = { {  1,  1, 1 },
                  {  2, 2, 2 },
                  { 3,  3, 3 } };

    int[][] L = {{  2,  4, 2 },
                {  2, 2, 2 } };
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
    System.out.println("----------isRowMagic----------");
    System.out.println(ArrayOps.isRowMagic(F));
    System.out.println(ArrayOps.isRowMagic(D));
    System.out.println(ArrayOps.isRowMagic(G));
    System.out.println(ArrayOps.isRowMagic(H));
    System.out.println(ArrayOps.isRowMagic(I));
    System.out.println(ArrayOps.isRowMagic(J));
    System.out.println("----------isColMagic----------");
    System.out.println(ArrayOps.isColMagic(K));
    System.out.println("----------isLocationMagic----------");
    System.out.println(ArrayOps.isLocationMagic(L, 0, 1));
    System.out.println(ArrayOps.isLocationMagic(L, 1, 1));
  }
}
