package Day_6;

public class InstanceCounter {
    private static int numInstances = 0;        //私有类变量int型numInstance的值为0；

    protected static int getCount(){            //保护类方法int型getCount；
        return numInstances;                    //返回numInstances的值
    }

    private static void addInstance(){          //私有类方法 addInstance
        numInstances++;                         //将numInstance加一
    }

    InstanceCounter(){                          //InstanceCounter对象
        InstanceCounter.addInstance();          //调用方法addInstance，每创建一个InstanceCounter在addInstance中计算数量
    }

    public static void main(String[] args) {
        System.out.println("Starting with " +
                InstanceCounter.getCount() + "objects");    //调用方法getCount计算初始InstanceCounter对象数量
        for (int i = 0 ; i<500 ; ++i){
            new InstanceCounter();                          //创建五百个InstanceCounter对象
        }
        System.out.println("Created " +
                InstanceCounter.getCount() + "objects");    //显示对象数量
    }
}
