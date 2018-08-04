package InterviewBit;

/*
* Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB
    */
public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        int num = 701;
        String result = excelSheetColumnNumber(num);
        System.out.println("result = " + result);
    }

    private static String excelSheetColumnNumber(int num) {
        StringBuilder sb = new StringBuilder();
        while(num > 0){
            num--;
            sb.append((char)(num%26 + 'A'));
            num = num / 26;
        }
        return new String(sb.reverse());
    }
}
