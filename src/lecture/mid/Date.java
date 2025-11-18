package lecture.mid;

public class Date {
    public static void main(String[] args) {
        int day = 2;
        String dayStr = "None";
        switch (day){
            case 1:
                dayStr = "Sunday";
                break;
            case 2:
                dayStr = "Monday";
                break;
            case 3:
                dayStr = "Tuesday";
                break;
            case 4:
                dayStr = "Wedensday";
                break;
            case 5:
                dayStr = "Thursday";
                break;
            case 6:
                dayStr="Friday";
                break;
            case 7:
                dayStr = "Saturday";
                break;
            default:
                break;
        }
        System.out.println(dayStr);
    }
}
