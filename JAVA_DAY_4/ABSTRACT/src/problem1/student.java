package problem1;

public abstract class student {
    abstract void message();

    interface  a {
        void display();
       void message();

    }
  class b implements a {

      @Override
      public  void display() {
          System.out.println("its is a message" +
                  "");
        }

      @Override
      public void message() {
          System.out.println("its is a message" +
                  "");
      }

  }

}
