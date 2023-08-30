package javaExamples;
import java.util.*;

public class CollectionExamples {

    public static void main(String[] args) {

    String arr[] = {"blue", "red", "green", "pink", "white", "black", "purple", "brown", "orange"};
    List<String> listarr = new ArrayList<String>();
    List<String> listlinked = new LinkedList<String>();

    for (String s : arr){
        listarr.add(s);
        listlinked.add(s);
    }

    for (String s: listarr){
        System.out.println(s);
    }


    Collections.sort(listarr);

    for (String s: listarr){
        System.out.println(s);
    }



    }
}
