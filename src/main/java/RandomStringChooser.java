import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
  private String[] wordArray;
  private ArrayList<String> coolList;
  public RandomStringChooser(String[] coolArray) {
    wordArray = new String[coolArray.length];
    for(int i = 0; i < coolArray.length; i++) {
      wordArray[i] = coolArray[i];
      coolList.add(coolArray[i]);
    }
  }
  public String getNext() {
    int chosenIndex = (int)(Math.random()*coolList.size());
    String temp = new String();
    if(coolList.size() > 0) {
      temp = coolList.get(chosenIndex);
      coolList.remove(chosenIndex);
      return temp;
    }
    return "NONE";
  }
}
