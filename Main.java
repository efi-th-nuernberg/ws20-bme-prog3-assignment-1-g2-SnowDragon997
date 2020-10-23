class Main {
    public static void main(String[] args) {
    checkNumbers(200);
  }


  public static void checkNumbers(int maxNum){

    for (int i =0; i< maxNum; i++){
      checkSingleNum(i);
    }
  }


public static void checkSingleNum(int currentNum){

  if (currentNum%5 == 0){
    System.out.println(currentNum +" ist durch 5 teilbar!");
  }
  if(currentNum%10 ==9){
    System.out.println(currentNum +" endet auf 9");
  }
  if((2*currentNum -1) % 3 == 0 ){
    System.out.println(currentNum +" und VORGAENGER addiert ergeben ERGEBNIS und ERGEBNIS ist durch 3 teilbar");
  }
}
}