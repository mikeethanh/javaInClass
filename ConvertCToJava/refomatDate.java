import java.util.HashMap;

public class refomatDate {
    public static String reformatDate(String date) {
        String[] dateArrays = date.split(" ");
        String day = dateArrays[0];
        String month = dateArrays[1];
        String year = dateArrays[2];

        HashMap<String, Integer> months = new HashMap<>();
        months.put("Jan", 1);
        months.put("Feb", 2);
        months.put("Mar", 3);
        months.put("Apr", 4);
        months.put("May", 5);
        months.put("Jun", 6);
        months.put("Jul", 7);
        months.put("Aug", 8);
        months.put("Sep", 9);
        months.put("Oct", 10);
        months.put("Nov", 11);
        months.put("Dec", 12);

        String dayReformat = day.replaceAll("\\D", ""); // Remove non-digit characters from day

        return String.format("%s-%02d-%s", dayReformat, months.get(month), year);
    }

    public static void main(String[] args) {
        String date = "20th Oct 2052";
        System.out.println(reformatDate(date));
    }
}
