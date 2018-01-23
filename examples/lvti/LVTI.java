public class LVTI {

  public static void main(String... args) throws Exception {

    var path = java.nio.file.Paths.get(args[0]);

    var lines = java.nio.file.Files.readAllLines(path);

    lines.forEach(System.out::println);

    for (var it = lines.iterator(); it.hasNext(); ) {
      System.out.println(it.next());
    }
  }
}
