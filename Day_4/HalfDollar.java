package Day_4;

public class HalfDollar {
    public static void main(String[] args) {
        int[] denver = {1_700_000 , 4_600_000 , 2_100_000};     //丹佛，创建一个整型数组，包含三个数字
        int[] philadelphia = new int[denver.length];            //费城,创建一个跟丹佛一样长的数组
        int[] total = new int[denver.length];                   //总和，创建一个跟丹佛一样长的数组
        int average;

        philadelphia[0] = 1_800_000;
        philadelphia[1] = 5_000_000;
        philadelphia[2] = 2_500_000;

        total[0] = denver[0] + philadelphia[0];
        total[1] = denver[1] + philadelphia[1];
        total[2] = denver[2] + philadelphia[2];

        average = (total[1] + total[0] +total[2]) / 3;

        System.out.println("2012 production: ");
        System.out.format("%,d%n",total[0]);            //format 指以特定格式输出
        System.out.println("2013 production: ");
        System.out.format("%d%n",total[1]);             //%d 代后面total[1]，以d整形输出，%n为换行
        System.out.println("2014 production: ");
        System.out.format("%，d%n",total[2]);            //%,d 每隔三位加分隔符“，”
    }
}
