import java.util.*;
/**
 * This class allows us to draw and manipulate a digit on the canvas
 * 
 * @author (Edgar Henao - Cesar Vasquez) 
 * @version 1.0(August 26, 2021)
 */
public class Digit
{
    private String color;
    private boolean isVisible;
    private byte digit;
    private Triangle triangle;
    private Rectangle[] rectangulos = new Rectangle[7];
    private Rectangle fond1 = new Rectangle();
    private Rectangle fond2 = new Rectangle();
    
    //Inicio miniciclo 1
    /**
     * Constructor of the class Digit
     */
    public Digit(byte digito){
        digit = digito;
        color = "green";
        isVisible = false;
        initialize();
        update();
    }
    /**
     * Returns the digit showed
     */
    public byte getdigit(){
        return digit;
    }
    //Fin miniciclo 1
    
    //Inicio miniciclo 2    
    /**
     * Shows the next digit. If it is 9, then shows 0
     */
    public void next(){
        if(digit != 9) digit ++;
        else digit = 0;
        update();
    }
    /**
     * Changes the number in the image
     */
    public void change(byte digito){
        digit = digito;
        update();
    }
    /**
     * Overcharge of previous method, which randomizes the 
     * changes
     */
    public void change(){
        digit = (byte)(Math.random()*10);
        update();
    }
    //Fin miniciclo 2
    
    //Inicio miniciclo 3
    /**
     * Makes invisible the segments
     */
    public void makeInvisible(){
        isVisible = false;
        for (Rectangle i: rectangulos){
            i.makeInvisible();
        }
    }
    /**
     * Makes visible the segments
     */
    public void makeVisible(){
        isVisible = true;
        for (Rectangle i: rectangulos){
            i.makeVisible();
        }
    }
    //Fin miniciclo 3
    
    //Inicio miniciclo 4
    /**
     * Moves the image x, y positions
     */
    public void moveTo(int x, int y){
        fond1.changePosition(80 + x, 45 +y);
        if(digit == 1) number1d(x,y);
        else if(digit == 2) number2d(x,y);
        else if (digit == 3) number3d(x,y);
        else if(digit == 4) number4d(x,y);
        else if(digit == 5) number5d(x,y);
        else if(digit == 6) number6d(x,y);
        else if(digit == 7) number7d(x,y);
        else if(digit == 8) number8d(x,y);
        else if(digit == 9) number9d(x,y);
    }    
    public void changeColor(String newColor){
        for (Rectangle i: rectangulos){
            i.changeColor(newColor);
        }
    }
    //Fin miniciclo 4
    
    
    /*
     * Design of the different numbers showed
     */
    private void designDigit(byte digito){
        fond1.modRectangle(170, 125, 80, 45);
        fond1.changeColor("black");
        fond1.makeVisible();
        if (isVisible) makeVisible();
        modRectangles();
        if (digito == 0) number0m();
        else if (digito == 1) number1m();
        else if (digito == 2) number2m();
        else if (digito == 3) number3m();
        else if (digito == 4) number4m();
        else if (digito == 5) number5m();
        else if (digito == 6) number6m();
        else if (digito == 7) number7m();
        else if (digito == 8) number8m();
        else if (digito == 9) number9m();        
    }
    /*
     * Updates the image 
     */
    private void update(){
        number8m();
        designDigit(this.digit);        
    }
    /*
     * Modifying the design of the rectangles 
     */
    private void modRectangles(){
        System.out.println(rectangulos);
        rectangulos[0].modRectangle(12,60,115,50); 
        rectangulos[1].modRectangle(12,60,115,123); 
        rectangulos[2].modRectangle(12,60,115,196);
        rectangulos[3].modRectangle(60,12,100,62);
        rectangulos[4].modRectangle(60,12,177,62);
        rectangulos[5].modRectangle(60,12,100,136);
        rectangulos[6].modRectangle(60,12,177,136);
    }
    /*
     * Next 9 methods change color of the segments, according to
     * the number shown
     */
    private void number0m(){
        rectangulos[1].changeColor("gray");
    }
    private void number1m(){
        rectangulos[0].changeColor("gray"); 
        rectangulos[1].changeColor("gray"); 
        rectangulos[2].changeColor("gray");
        rectangulos[3].changeColor("gray");   
        rectangulos[5].changeColor("gray");
    }
    private void number2m(){
        rectangulos[3].changeColor("gray");
        rectangulos[6].changeColor("gray");
    }
    private void number3m(){
        rectangulos[3].changeColor("gray");
        rectangulos[5].changeColor("gray");
    }
    private void number4m(){
        rectangulos[0].changeColor("gray");
        rectangulos[2].changeColor("gray");
        rectangulos[5].changeColor("gray");
        //rectangulos[6].changeColor("gray");
    }
    private void number5m(){
        rectangulos[4].changeColor("gray");
        rectangulos[5].changeColor("gray");
    }
    private void number6m(){
        rectangulos[4].changeColor("gray");
    }
    private void number7m(){
        rectangulos[1].changeColor("gray");
        rectangulos[2].changeColor("gray");
        rectangulos[3].changeColor("gray");
        rectangulos[5].changeColor("gray");
    }
    private void number8m(){
        for (Rectangle i: rectangulos){
            i.changeColor("green");
        }
    }
    private void number9m(){
        rectangulos[5].changeColor("gray");
    }
    private void reset(){
        rectangulos[0].changeColor("gray"); 
        rectangulos[1].changeColor("gray"); 
        rectangulos[2].changeColor("gray");
        rectangulos[3].changeColor("gray");
        rectangulos[4].changeColor("gray");
        rectangulos[5].changeColor("gray");
        rectangulos[6].changeColor("gray");
    }
    /*
     * The next 9 methods determine the new positions from 
     * the method "move to"
     */
    private void number1d(int x, int y){
        rectangulos[0].changePosition(115+x, 50+y);
        rectangulos[6].changePosition(177+x, 136+y);
    }
    private void number2d(int x, int y){
        rectangulos[0].changePosition(115+x, 50+y);
        rectangulos[1].changePosition(115+x, 123+y);
        rectangulos[2].changePosition(115+x, 196+y);
        rectangulos[4].changePosition(177+x, 62+y);
        rectangulos[5].changePosition(100+x, 136+y);
    }
    private void number3d(int x, int y){
        rectangulos[0].changePosition(115+x, 50 + y);
        rectangulos[1].changePosition(115+x, 123+y);
        rectangulos[2].changePosition(115+x, 196+y);
        rectangulos[4].changePosition(177+x, 62+y);
        rectangulos[6].changePosition(177+x, 136+y);
    }
    private void number4d(int x, int y){
        rectangulos[1].changePosition(115+x, 123+y);
        rectangulos[3].changePosition(100+x, 62+y);
        rectangulos[4].changePosition(177+x, 62+y);
        rectangulos[6].changePosition(177+x, 136+y);
    }
    private void number5d(int x, int y){
        rectangulos[0].changePosition(115+x, 50+y);
        rectangulos[1].changePosition(115+x, 123+y);
        rectangulos[2].changePosition(115+x, 196+y);
        rectangulos[3].changePosition(100+x, 62+y);
        rectangulos[6].changePosition(177+x, 136+y);
    }
    private void number6d(int x, int y){
        rectangulos[0].changePosition(115+x, 50+y);
        rectangulos[1].changePosition(115+x, 123+y);
        rectangulos[2].changePosition(115+x, 196+y);
        rectangulos[3].changePosition(100+x, 62+y);            
        rectangulos[5].changePosition(100+x, 136+y);
        rectangulos[6].changePosition(177+x, 136+y);
    }
    private void number7d(int x, int y){
        rectangulos[0].changePosition(115+x, 50+y);
        rectangulos[4].changePosition(177+x, 62+y);
        rectangulos[6].changePosition(177+x, 136+y);
    }
    private void number8d(int x, int y){
        rectangulos[0].changePosition(115+x, 50+y);
        rectangulos[1].changePosition(115+x, 123+y);
        rectangulos[2].changePosition(115+x, 196+y);
        rectangulos[3].changePosition(100+x, 62+y); 
        rectangulos[4].changePosition(177+x, 62+y);
        rectangulos[5].changePosition(100+x, 136+y);
        rectangulos[6].changePosition(177+x, 136+y);
    }
    private void number9d(int x, int y){
        rectangulos[0].changePosition(115+x, 50+y);
        rectangulos[1].changePosition(115+x, 123+y);
        rectangulos[2].changePosition(115+x, 196+y);
        rectangulos[3].changePosition(100+x, 62+y); 
        rectangulos[4].changePosition(177+x, 62+y);
        rectangulos[6].changePosition(177+x, 136+y);
    }
    /*
     * Initializer of the rectangles of each segment
     */
    private void initialize(){
        rectangulos[0] = new Rectangle();
        rectangulos[1] = new Rectangle();
        rectangulos[2] = new Rectangle();
        rectangulos[3] = new Rectangle();
        rectangulos[4] = new Rectangle();
        rectangulos[5] = new Rectangle();
        rectangulos[6] = new Rectangle();
    }
}
