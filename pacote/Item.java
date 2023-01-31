package pacote;

public class Item{
  private String name;
	private int vote;

  public void Name(String name){ this.name = name; }
  public String Name(){ return name; }

  public void Vote(int vote){ this.vote = vote; }
  public int Vote(){ return vote; }
}