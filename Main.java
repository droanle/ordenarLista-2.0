import pacote.*;
import java.util.ArrayList;

class Main {
  private static Data dataRanking = new Data();
  
  public static void main(String[] args) {
    Btree a = new Btree();
    
    for (int i = 0; i < dataRanking.getArrayList().size(); i++)
      a.add(dataRanking.getItemName(i), dataRanking.getItemVote(i));

    
    ArrayList<Item> res = a.show();

    for (int i = 0; i < res.size(); i++) {

      String nome = res.get(i).Name();
      Integer votos = res.get(i).Vote();

      if (i == 0) {
        System.out.println("   1º    - " + nome + " com " + votos + " votos");
      } else if (i == 1) {
        System.out.println("   2º    - " + nome + " com " + votos + " votos");
      } else if (i == 2) {
        System.out.println("   3º    - " + nome + " com " + votos + " votos");
      } else {
        System.out.println("(〒﹏〒) - " + nome + " com " + votos + " votos");
      }
    }
  }
}