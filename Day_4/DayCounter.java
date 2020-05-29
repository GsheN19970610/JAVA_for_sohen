package Day_4;

public class DayCounter {
    public static void main(String[] args) {
        int yearIn = 2016;
        int monthIn = 1;
        if(args.length>0)
            monthIn = Integer.parseInt(args[0]);
        if(args.length>1)
            yearIn = Integer.parseInt(args[1]);
        /*psvm中定义了一个string型数组args，包含两个变量 yearIn，monthIn
            Integer.parseInt（String）是将括号里内容转换成整数
         args长度大于0时，会将第一个收到的参数赋值给monthIn
            大于1时，会将第二个收到的参数赋值给yearIn                    */
        System.out.println(monthIn + "/" +yearIn + "has"
             + countDays(monthIn,yearIn) + "days.");
    }

    static int countDays(int month , int year){
        int count = -1;
        switch (month) {            //switch函数，选择框内值，对case里各项进行比较
            case 1:             // 1，3，5，7，8，10，12月 31天
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                count = 31;
                break;
            case 4:             //4.6.9.11月 30天
            case 6:
            case 9:
            case 11:
                count = 30;
                break;
            case 2:                                     //二月判断是否闰年
                if (year % 4 == 0)
                    count = 29;
                else
                    count = 28;
                if ((year % 100 == 0) & (year % 400 != 0))
                    count = 28;
        }
        return count;
    }
}
