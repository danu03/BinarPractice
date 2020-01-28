class Oops4 {
    public static void main(String[] args) {
      int a = 7, b = 42;
      minimum(a,b); 
    }
  
    public static void minimum(int a, int b) {
      if (a < b){
        System.out.println("a is the smallest!");
      } else if (a >= b) {
        System.out.println("b is the smallest!");
      }
    }
  }