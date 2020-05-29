package Day_5;

public class Circle{
    int x,y,radius;
    Circle(int xPoint , int yPoint , int radiusLength){
        this.x = xPoint;
        this.y = yPoint;
        this.radius = radiusLength;
    }
    Circle(int xPoint,int yPoint){
        this(xPoint,yPoint,1);
    }
}