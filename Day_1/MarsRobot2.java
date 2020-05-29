package Day_1;


public class MarsRobot2 {
    String status;
    int speed;
    float temperature;
        void checkTemperature() {
            if (temperature < -80) {            //温度低于负80时
                status = "returning home";      //回家，速度为5
                speed = 5;
            }
        }
        void showAttributes() {                 //输出状态，速度，温度
            System.out.println("Status: " + status);
            System.out.println("Speed: " + speed);
            System.out.println("Temperature: " + temperature);
        }

        public static void main(String[] args) {
            MarsRobot2 spirit = new MarsRobot2();           //创建一个全新的MarsRobots2型变量 spirit

            spirit.status = "exploring";
            spirit.speed = 2;
            spirit.temperature = -60;

            System.out.println("\nSpirit:");                // \n为换行
            spirit.showAttributes();
            System.out.println("Increasing speed to 3.");

            spirit.speed = 3;
            spirit.showAttributes();
            System.out.println("Changing temperature to 670.");

            spirit.temperature = 670;
            spirit.showAttributes();
            System.out.println("Checking the temperature.");

            spirit.checkTemperature();
            spirit.showAttributes();
            MarsRobot2 opportunity = new MarsRobot2();      //创建一个全新的MarsRobot2型变量
            System.out.println("\nSpirit: ");

            opportunity.status = "exploring";
            opportunity.speed = 4;
            opportunity.temperature = -90;
            opportunity.showAttributes();
        }
}
