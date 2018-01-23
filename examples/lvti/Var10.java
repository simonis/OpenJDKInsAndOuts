public class Var10 {

  static class Var {
    int var(int var) { return var; }
  }

  public static void main(String[] args) {
    int var = 42;

    System.out.println(var);

    System.out.println(new Var().var(var));
  }
}
