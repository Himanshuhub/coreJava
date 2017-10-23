class TwoPlusTwo{
  public static void main(String args[]){
    System.out.println(2+2);
    int cardValue = 11;
    switch (cardValue) {
      case 1:
      System.out.println("Ace");
      break;
      case 11:
      System.out.println("Jack");
      break;
      case 12:
      System.out.println("Queen");
      break;
      case 13:
      System.out.println("King");
      break;
      default:
      System.out.println(cardValue);
      // Break;
      }
  }
}
