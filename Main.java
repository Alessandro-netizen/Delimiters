import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] tokens1 = {"(", "x + y", ")", "* 5"};
        Delimiters d1 = new Delimiters("(", ")");
        ArrayList<String> delimitersList1 = d1.getDelimitersList(tokens1);
        System.out.println("Delimiters List 1: " + delimitersList1);


        String open = "<sup>";
        String close = "</sup>";
        Delimiters d2 = new Delimiters(open, close);

        ArrayList<String> delimiters2 = new ArrayList<>();
        String[] delims = {open, open, close, open, close, close};
        for (String s : delims) {
            delimiters2.add(s);
        }

        System.out.println("Delimiters List 2: " + delimiters2);
        System.out.println("Is balanced (Test 2): " + d2.isBalanced(delimiters2));

        String[] tokens3 = {open, "text", open, close};
        ArrayList<String> delimitersList3 = d2.getDelimitersList(tokens3);
        System.out.println("Delimiters List 3: " + delimitersList3);
        System.out.println("Is balanced (Test 3): " + d2.isBalanced(delimitersList3)); 

        String[] tokens4 = {close, open};
        ArrayList<String> delimitersList4 = d2.getDelimitersList(tokens4);
        System.out.println("Delimiters List 4: " + delimitersList4);
        System.out.println("Is balanced (Test 4): " + d2.isBalanced(delimitersList4)); 
        String[] tokens5 = {open, close, open, close};
        ArrayList<String> delimitersList5 = d2.getDelimitersList(tokens5);
        System.out.println("Delimiters List 5: " + delimitersList5);
        System.out.println("Is balanced (Test 5): " + d2.isBalanced(delimitersList5));
    }
}
