public class CtoFTester {
  public static double celsiusToFahrenheit(double c) {
    return (9.0/5.0)*c + 32;
  }

  public static double fahrenheitToCelsius(double f) {
    return (f - 32.0)*(5.0/9.0);
  }

  public static void main(String args[]) {
    System.out.println(celsiusToFahrenheit(20.0));
    System.out.println(celsiusToFahrenheit(25.0));
    System.out.println(celsiusToFahrenheit(-40.0));

    System.out.println(fahrenheitToCelsius(90.0));
    System.out.println(fahrenheitToCelsius(70.0));
    System.out.println(fahrenheitToCelsius(50.0));
    System.out.println(fahrenheitToCelsius(-40.0));
  }
}