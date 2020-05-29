package Day_5;

public class MarsRobot3 {
    String status;  //状态
    int speed;  //速度
    float temperature;  //温度

    MarsRobot3(String status3 ,int speed3 , float temperature3){
        status = status3;
        speed = speed3;
        temperature = temperature3;
    }

    void checkTemperature(){            //检测安全温度的方法
        if(temperature < -80){
            status = "returning home";
            speed = 5;
        }
    }

    void showAttributes(){              //输出状态的方法
        System.out.println("Status:" + status);     //双引号为字符（串），单引号为字符的ASCII码
        System.out.println("Speed:" + speed);
        System.out.println("Temperature:" + temperature);
    }

    public static void main(String[] args) {
        MarsRobot3 spirit = new MarsRobot3("exploring",2,-80);

        spirit.showAttributes();        //调用上面的showAttributes输出初始状态

        System.out.println("Increasing speed to 3.");
        spirit.speed = 3;
        spirit.showAttributes();

        System.out.println("Changing temperature to -100.");
        spirit.temperature = -100;
        spirit.showAttributes();

        System.out.println("checking the temperature.");
        spirit.checkTemperature();
        spirit.showAttributes();
    }
}