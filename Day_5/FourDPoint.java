package Day_5;

import java.awt.Point;


class FourDPoint extends Point{
    int t;
    int z;
    //int x;
    //int y;
    FourDPoint(int x,int y,int z1,int t1){      //类与方法同名，使用this
        super(x,y);//this.x = x;  this.y = y
        this.z = z1;
        this.t = t1;
    }

    void showAttritubes(){                  //输出方法，一般用void
        System.out.println("x is " + x);
        System.out.println("y is " + y);
        System.out.println("z is " + z);
        System.out.println("t is " + t);

    }

    public static void main(String[] args) {
        FourDPoint np = new FourDPoint(1,2,3,4);
        np.showAttritubes();            //调用输出方法
    }

}
