package ArrayTask;

public class SplitExample {
    public static void main(String[] args) {
        String word="              Xelilov Intiqam Ferid       ";
        System.out.println(word);
        System.out.println("(((((((((((((((((((((");
//word=word.trim();
      //  System.out.println(word);

     String [] splits=  word.split("i");
        for (int i = 0; i < splits.length; i++) {
            System.out.println(splits[i].trim());
        }
        System.out.println("*********");

        System.out.println(splits[1]);

    }
}
