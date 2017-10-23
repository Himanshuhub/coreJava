class AddingLowerType{
  public static void main(String[] args){
    byte a = 10;
    byte b = 10;
    // byte c = a + b;
    byte c = (byte)(b+a);
    System.out.println(c);
  }
}
