package Day_3;

class StringChecker {

    public static void main(String[] arguments) {
        String str = "A Lannister always pays his debts";
        System.out.println("The string is: " + str);
        System.out.println("Length of this string: "
                + str.length());                //长度从一开始G
        System.out.println("The character at position 6: "
                + str.charAt(6));               //第六个字母，注意第一个下标为0   s
        System.out.println("The substring from 12 to 18: "
                + str.substring(12, 18));       //[12，18)   h
        System.out.println("The index of the first 't': "
                + str.indexOf('t'));            //查找第一个t所在位置    e
        System.out.println("The index of the beginning of the "
                + "substring \"debts\": " + str.indexOf("debts"));      //第一个出现debts的位置 N
        System.out.println("The string in uppercase: "
                + str.toUpperCase());
    }
}