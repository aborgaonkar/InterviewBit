package InterviewBit;

/*
* Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28
* */
public class ExcelSheetColumnName {
    public static void main(String[] args) {
        String str = "ZY";
        int result = excelSheetColumnName(str);
        System.out.println("result = " + result);
    }

    private static int excelSheetColumnName(String str) {
        int result = 0;
        for(int i = 0 ; i < str.length(); i++){
            result = result * 26 + (int) (str.charAt(i) - 'A') + 1;
        }

        return result;
    }
}
