package lecture.mid;

public class StringDemo {
    public static void main(String[] args) {
//        String str = "a d, m, i.n";
        String str = "가나다라마, 바, 사.아";
        String delimiters = "\\s+|,\\s*|\\.\\s*";

        String[] tokensVal = str.split(delimiters);

        System.out.println("Count of tokens = "+ tokensVal.length);

        for(String token : tokensVal){
            System.out.print(token);
        }
    }
}
