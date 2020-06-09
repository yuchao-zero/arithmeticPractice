public class Test {

  public static void main(String[] args) {
    String[] strings = null;
    System.out.println(strings);
    System.out.println(strings.length);
    StringBuilder stringBuilder = new StringBuilder("");
    //stringBuilder.append('a');
    System.out.println(stringBuilder.toString().isEmpty());
    System.out.println(stringBuilder.toString().isBlank());
  }
}
