package Day_3;

class Birthday {
    public static void main(String[] arguments) {
        String birthday = "04/29/2016";
        String month = birthday.substring(0, 2);        //字符串的前两位，编程中的括号都是左闭右开
        String day = birthday.substring(3, 5);          //第3，4位，代表日
        String year = birthday.substring(6, 10);        //6，7，8，9位代表年份
        System.out.println("Birthday: " + birthday);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Year: " + year);    }
}

