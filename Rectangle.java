public class Rectangle{
  
  private int length;
  private int width; 
  
  public Rectangle(int length, int width){
    this.length = length;
    this.width = width;
  }
  
  public int getLength(){
    return length; 
  }
  
  public int getWidth(){
    return width;
  }
  
  public int getArea(){
    return this.width * this.length; 
  }
  
  public int getCircum(){
    return (this.length+this.width)*2;
}
