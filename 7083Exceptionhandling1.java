class Exception_Handling{
  public static void main(String x[] ) {

    try {
      int divideByZero = 10 / 0;
    }

    catch (ArithmeticException e) {
      System.out.println("Arithmetic Exception : " + e.getMessage());
    }
  }
}