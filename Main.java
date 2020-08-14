class Main {
  public static void main(String[] args) {
    
      double result = toTheNthPower(4, 9);
      System.out.println("the result is: " + result); 

  }

  public static double toTheNthPower(double base, int exp) {

      double total = 1; 

      for(int i = 1; i <= exp; i++){
          total = total * base; 
      }
        
      return total; 
  }
}