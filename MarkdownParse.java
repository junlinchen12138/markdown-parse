// File reading code from https://howtodoinjava.com/java/io/java-read-file-to-string-examples/
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {
    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then take up to
        // the next )
        int currentIndex = 0;
<<<<<<< HEAD
        System.out.println(currentIndex);
        int lastClosedParen = markdown.lastIndexOf(")");
=======
        System.outprintln(curretIndex);
        int lastClosedParen = markdown.lastIndexOf(")");
        boolean carrotLink = false;
>>>>>>> a302cba020730df347c8f2b9cec99a7ad0361b4d
        while(currentIndex < markdown.length()) {
            int nextOpenBracket = markdown.indexOf("[", currentIndex);
            int nextOpeCarrot = markdown.indexOf("<", currentIndex);
            int nextCloseBracket = markdown.indexOf("]", nextOpenBracket);
            int nextCloseCarrot = markdown.indexOf(">", nextOpenCarrot);
            int openParen = markdown.indexOf("(", nextCloseBracket);
            int closeParen = markdown.indexOf(")", openParen);
            if(nextOpenCarrot < nextOpenBracket){
                carrotLink = true;
                toReturn.add(markdown.substring(nextOpenCarrot + 1, nextCloseCarrot));
            } else{
                toReturn.add(markdown.substring(openParen + 1, closeParen));
            }
            currentIndex = closeParen + 1;
<<<<<<< HEAD
            System.out.println(currentIndex);
            if (closeParen == lastCloseParen){
                break;
            }
=======
             System.outprintln(curretIndex);
             if (closeParen == lastClosedParen){
                 break;
             }
             if(carrotLink){
                 currentIndex = nextCloseCarrot + 1;
             }

>>>>>>> a302cba020730df347c8f2b9cec99a7ad0361b4d
        }
        return toReturn;
    }
    public static void main(String[] args) throws IOException {
		Path fileName = Path.of(args[0]);
	    String contents = Files.readString(fileName);
        ArrayList<String> links = getLinks(contents);
        System.out.println(links);
    }
}