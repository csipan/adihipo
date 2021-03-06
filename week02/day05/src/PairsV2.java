import java.util.*;
import java.util.Scanner;

public class PairsV2 {
  public static void main(String... args) {
    ArrayList<String> names = new ArrayList<String>();
    ArrayList<String> girls = new ArrayList<String>();
    ArrayList<String> boys = new ArrayList<String>();

    System.out.println("Ladies first. After typing each girl's name, hit ENTER. When done, type END then hit ENTER: ");
    names = getNames(names);
    for (int i = 0; i < names.size(); i++) {
      girls.add(names.get(i));
    }
    names.clear();

    System.out.println("Now the boys. After typing each boy's name, hit ENTER. When done, type END then hit ENTER: ");
    names = getNames(names);
    for (int i = 0; i < names.size(); i++) {
      boys.add(names.get(i));
    }
    names.clear();

    System.out.println("Your pairs are: ");
    System.out.println(makingMatches(girls, boys));
  }

  public static ArrayList getNames(ArrayList names) {
    boolean END = false;
    for (int i = 0; END == false; i++) {
      Scanner scanner = new Scanner(System.in);
      String Name = scanner.next();
      if (Name.equals("END")) {
        END = true;
      } else {
        names.add(Name);
      }
    }
    return names;
  }

  public static String makingMatches(ArrayList girls, ArrayList boys) {
    String pairs = "";
    if (girls.size() >= boys.size()) {
      for (int i = 0; i < boys.size(); i++) {
        girls.add(i * 2, boys.get(i));
      }
      for (int i = 0; i < girls.size() - 1; i += 2) {
        pairs += girls.get(i) + "  <3  " + girls.get(i + 1) + "\n";
        if (i + 3 == girls.size()) {
          pairs += girls.get(girls.size() - 1) + "  alone  :(  </3";
        }
      }
    }

    if (girls.size() < boys.size()) {
      for (int i = 0; i < girls.size(); i++) {
        boys.add(i * 2, girls.get(i));
      }
      for (int i = 0; i < boys.size() - 1; i += 2) {
        pairs += boys.get(i) + "  <3  " + boys.get(i + 1) + "\n";
        if (i + 3 == boys.size()) {
          pairs += boys.get(boys.size() - 1) + "  alone  :(  </3";
        }
      }
    }
    return pairs;
  }
}