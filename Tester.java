public class Tester {
  public static void main (String[] args) {

    System.out.println("----------Sum----------");
    int [] a = {1, 2, 3};
    int [] b = {5, 6, 7, 8, 9};
    int [] c = {5, 5, 5, 5, 9};
    int [] d = {10, 6, 4, 2, -1};
    int [] e = {-10, -4, -11, -20, -10000};
    System.out.println(ArrayOps.sum(a));
    System.out.println(ArrayOps.sum(b));
    System.out.println(ArrayOps.sum(d));
    System.out.println("----------ArrayOps----------");
    System.out.println(ArrayOps.largest(a));
    System.out.println(ArrayOps.largest(b));
    System.out.println(ArrayOps.largest(c));
    System.out.println(ArrayOps.largest(d));
    System.out.println(ArrayOps.largest(e));
  }
}
