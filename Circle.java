package za.ac.wsu.s221110232;

public class Circle {
    private int x;
    private int y;
    private float Radius;

    public void setx(int X){
        x=X;
    }
    public void sety(int Y){
        y=Y;
    }
    public void setRadius(float radius){
        if(radius>0){
            this.Radius=radius;
        }
        else{
            System.out.println("please enter the positive number radius should be greater than zero");
        }
    }
    public int getx(){
        return x;
    }
    public int gety(){
        return y;
    }
    public float getRadius(){
      return Radius;
    }
   public float getArea(){
        return (float) Math.PI*(getRadius()*getRadius());
   }
    public float getDiameter(){
        return (float) (2*getRadius());
    }
    public float getCircumference(){
        return(float)  (2*Math.PI*getRadius());
    }



}
