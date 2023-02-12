package listTask;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<String> tvShows=new ArrayList<>();
        tvShows.add("Breaking Bad");
        tvShows.add("Game of Thrones");
        tvShows.add("Friends");
        tvShows.add("Prison break");
//        for (String tvShow : tvShows){
//            System.out.println(tvShow);
//        }
//        for (int i = 0; i < tvShows.size(); i++) {
//            System.out.println(tvShows.get(i));
//
//        }
        Iterator<String> tvShowIterator=tvShows.iterator();
        while (tvShowIterator.hasNext()){
            String tvSow=tvShowIterator.next();
            System.out.println(tvSow);
        }
    }
}
