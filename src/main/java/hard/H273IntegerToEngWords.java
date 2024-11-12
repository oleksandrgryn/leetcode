package hard;

public class H273IntegerToEngWords {
    private final String[] belowTwenty = new String[]{"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty"};

    private final String[] tens = new String[]{"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public String numberToWords(int num) {

        return null;
    }

    private String helper(int num) {
        StringBuilder result = new StringBuilder();

        if (num < 20) {
            result.append(helper(num));
        } else if (num < 100) {
            result.append(tens[num / 10]).append(" ").append(belowTwenty[num % 10]);
        } else if (num < 1_000) {
            result.append(belowTwenty[num / 100]).append(" Hundred ").append(helper(num % 100));
        } else if (num < 1_000_000) {
            result.append(helper(num / 1000)).append(" Thousand ").append(helper(num % 1000));
        } else if (num < 1_000_000_000) {
        }


        return result.toString();
    }
}
