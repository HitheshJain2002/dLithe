package access;

public class ACCESS {
    public int age = 32;
    public String name = "hithesh";
  public void display() {
      System.out.println("this message");
  }
      public static void main(String[] args) {
          ACCESS a =new ACCESS();
          System.out.println(a.age);
          System.out.println(a.name);
          a.display();

    }
}
