package lab.ch04;

public class lab17_StringDemo
{
    public static void main(String[] args) {
        String str = "a d, m, i.n";
        String delimiters = "\\s+|,\\s*|\\.\\s*";

        String[] tokensVal = str.split(delimiters);

        System.out.println("Count of tokens = "+tokensVal.length);

        for(String a : tokensVal)
            System.out.print(a);
    }
}
