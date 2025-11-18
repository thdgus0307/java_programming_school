package lecture.mid;

public class FindStringWithFor {
    public static void main(String[] args) {
        String[] cities = {"New York", "Beijing", "Seoul"};
        boolean found = false;
        for (int i = 0; i < cities.length; i++){
            if(cities[i].equals("Seoul")){
                System.out.printf("%d %s\n", i,cities[i]);
                found = true;
                break;
            }
        }
        if(found== false){
            System.out.println("Seoul not found");
        }
    }
}
