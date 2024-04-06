public class simpleNumber{
  public static void main (String[] arg){
    for(int i = 2; i <= 50; i ++){
            boolean simple = true;

            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    simple = false;
                    break;
                }
            }

            if(simple){
                System.out.println(i);
            }
        }
  }
}