package Day_1;

public class MarsApplication {
    public static void main(String[] args) {
        MarsRobot spirit = new MarsRobot();     //创建新MarsRobot类型变量spirit
        spirit.status = "exploring";
        spirit.speed = 2;

        spirit.temperature = -60;
        spirit.showAttributes();                //调用函数showAttributes
        System.out.println("Increasing speed to 3.");

        spirit.speed = 3;
        spirit.showAttributes();
        System.out.println("Changing tempreature to -90.");

        spirit.temperature = -90;
        spirit.showAttributes();
        System.out.println("Checking the tempreature");

        spirit.checkTemperature();               //调用函数checkTemperature
        spirit.showAttributes();

    }
}
