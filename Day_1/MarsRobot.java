package Day_1;

public class MarsRobot {
    String status;  //状态
    int speed;  //速度
    float temperature;  //温度

    void checkTemperature(){
        if(temperature < -80){
            status = "returning home";
            speed = 5;
        }
    }

    void showAttributes(){
        System.out.println("Status:" + status);     //双引号为字符（串），单引号为字符的ASCII码
        System.out.println("Speed:" + speed);
        System.out.println("Temperature:" + temperature);
    }
}