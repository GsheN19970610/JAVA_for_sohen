package Day_6;

public class ZipCode {
    private String zipCode;

    public String getZipCode() {                //一个取得方法，返回zipCode值
        return zipCode;
    }



    public ZipCode() {
        this.zipCode = "NO";                           //如果不是5，9位的，赋值”NO“，return
    }

    public void setZipCode(String inZipCode) {              //一个判断方法，若值的长度为5或者9，则转入实例变量zipCode
        if ((inZipCode.length() == 5) | (inZipCode.length() == 9)) {        //相对应的还有||作为短路运算符，相关区别请百度
            zipCode = inZipCode;
        }
    }
    public static void main(String[] arguments) {
        ZipCode zip1 = new ZipCode();                   //创建两个ZipCode型变量并调用方法判断是否为5或者9位
        zip1.setZipCode("72544");
        ZipCode zip2 = new ZipCode();
        zip2.setZipCode("320472");
        if (!"NO".equals(zip1.getZipCode())) {      //访问控制getZipCode
            //！表示取反，即分两步判断，第一步值是否等于”NO“，第二步，！取反进行if判断
            System.out.println("Zip1: " + zip1.getZipCode());      //取反判断为真，输出原邮编
        } else {
            System.out.println("Zip1 not set");                    //不符合标准
        }
        if (!"NO".equals(zip2.getZipCode())) {
            System.out.println("Zip2: " + zip2.getZipCode());
        } else {
            System.out.println("Zip2 not set");
        }

    }
}