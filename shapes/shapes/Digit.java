import java.util.List;

/**
 * La clase Digit .
 * 
 * @author (Cesar Vasquez) 
 * @version (25/08/2021)
 */
public class Digit
{
    private String color;
    private boolean isVisible;
    private byte digit;
    private List <Object> objects;
    private Triangle triangle;
    private Rectangle rectangle1, rectangle2, rectangle3;
    private Rectangle rectangle4, rectangle5, rectangle6, rectangle7;
    private Rectangle fond = new Rectangle();
    
    // MiniCiclo 1
    /**
     * Constructor for objects of class Digit
     */
    public Digit(byte _digit)
    {
        digit = _digit;
        color = "green";
        isVisible = false;
        
        this.desingDigit(digit);
        
    }
    /**
     * Retorna el digito ingresado
     */
    public byte get()
    {
        return digit;
    }    
    // MiniCiclo 2    
    /**
     * Aumenta una unidad el digito ingresado 
     */
    public void next()
    {
        if(this.digit != 9)
        {
            this.digit ++;            
        }
        else
        {
            this.digit = 0;
        }
    }    
    /**
     * Cambia el digito por uno ingresado
     * @param _digit; byte , replazo del digito 
     */
    public void change(byte _digit)
    {
        this.digit = _digit;
    }    
    /**
     * Cambiar el digito por uno aleatorio entre cero y nueve 
     */
    public void change()
    {
        digit = (byte)(Math.random()*(10));
    }
    // MiniCiclo 3
    /**
     * Vuelve invisible el digito
     */
    public void makeInvisible()
    {
        rectangle1.makeInvisible();
        rectangle2.makeInvisible();
        rectangle3.makeInvisible();
        rectangle4.makeInvisible();
        rectangle5.makeInvisible();
        rectangle6.makeInvisible();
        rectangle7.makeInvisible();
        
    }
    // MiniCiclo 4
    /**
     * Metodo que desplaza "x" y "y" posiciones a todo el digito 
     * @param _x,_y; enteros , desplazamiento el las direcciones respectivas 
     */
    public void moveTo(int _x, int _y)
    {
        fond.changePosition(80+_x, 45+_y);
        if(digit == 1)
        {
            rectangle1.changePosition(115+_x, 50+_y);
            rectangle7.changePosition(177+_x, 136+_y);
        }
        else if(digit == 2)
        {
            rectangle1.changePosition(115+_x, 50+_y);
            rectangle2.changePosition(115+_x, 123+_y);
            rectangle3.changePosition(115+_x, 196+_y);
            rectangle5.changePosition(177+_x, 62+_y);
            rectangle6.changePosition(100+_x, 136+_y);
            
        }
        else if(digit == 3)
        {
            rectangle1.changePosition(115+_x, 50+_y);
            rectangle2.changePosition(115+_x, 123+_y);
            rectangle3.changePosition(115+_x, 196+_y);
            rectangle5.changePosition(177+_x, 62+_y);
            rectangle7.changePosition(177+_x, 136+_y);
        }
        else if(digit == 4)
        {
            rectangle2.changePosition(115+_x, 123+_y);
            rectangle4.changePosition(100+_x, 62+_y);
            rectangle5.changePosition(177+_x, 62+_y);
            rectangle7.changePosition(177+_x, 136+_y);
        }
        else if(digit == 5)
        {
            rectangle1.changePosition(115+_x, 50+_y);
            rectangle2.changePosition(115+_x, 123+_y);
            rectangle3.changePosition(115+_x, 196+_y);
            rectangle4.changePosition(100+_x, 62+_y);
            rectangle7.changePosition(177+_x, 136+_y);
        }
        else if(digit == 6)
        {
            rectangle1.changePosition(115+_x, 50+_y);
            rectangle2.changePosition(115+_x, 123+_y);
            rectangle3.changePosition(115+_x, 196+_y);
            rectangle4.changePosition(100+_x, 62+_y);            
            rectangle6.changePosition(100+_x, 136+_y);
            rectangle7.changePosition(177+_x, 136+_y);
        }
        else if(digit == 7)
        {
            rectangle1.changePosition(115+_x, 50+_y);
            rectangle5.changePosition(177+_x, 62+_y);
            rectangle7.changePosition(177+_x, 136+_y);
        }
        else if(digit == 8)
        {
            rectangle1.changePosition(115+_x, 50+_y);
            rectangle2.changePosition(115+_x, 123+_y);
            rectangle3.changePosition(115+_x, 196+_y);
            rectangle4.changePosition(100+_x, 62+_y); 
            rectangle5.changePosition(177+_x, 62+_y);
            rectangle6.changePosition(100+_x, 136+_y);
            rectangle7.changePosition(177+_x, 136+_y);
        }
        else if(digit == 9)
        {            
            rectangle1.changePosition(115+_x, 50+_y);
            rectangle2.changePosition(115+_x, 123+_y);
            rectangle3.changePosition(115+_x, 196+_y);
            rectangle4.changePosition(100+_x, 62+_y); 
            rectangle5.changePosition(177+_x, 62+_y);
            rectangle7.changePosition(177+_x, 136+_y);
        }
    }    
    /**
     * Cambia el color del digito
     * @param _color; string, cambiar a este color 
     */
    public void changeColor(String _color)
    {
        rectangle1.changeColor(_color);
        rectangle2.changeColor(_color);
        rectangle3.changeColor(_color);
        rectangle4.changeColor(_color);
        rectangle5.changeColor(_color);
        rectangle6.changeColor(_color);
        rectangle7.changeColor(_color);
    }
    /**
     * Arma el digito
     * @param _digit; byte, digito a armar 
     */
    public void desingDigit(byte _digit)
    {
        // Fondo negro
        fond.armarRectangle(170,125,80,45);
        fond.changeColor("black");
        fond.makeVisible();
        // Rectangle Horizontal
        rectangle1 = new Rectangle();
        rectangle1.armarRectangle(12,60,115,50);        
        rectangle2 = new Rectangle();
        rectangle2.armarRectangle(12,60,115,123);        
        rectangle3 = new Rectangle();
        rectangle3.armarRectangle(12,60,115,196);
        
        // Rectangle vertical        
        rectangle4 = new Rectangle();
        rectangle4.armarRectangle(60,12,100,62);        
        rectangle5 = new Rectangle();
        rectangle5.armarRectangle(60,12,177,62);        
        rectangle6 = new Rectangle();
        rectangle6.armarRectangle(60,12,100,136);        
        rectangle7 = new Rectangle();
        rectangle7.armarRectangle(60,12,177,136);
        
        
        if(_digit == 0)
        {            
            rectangle1.makeVisible();
            rectangle2.makeInvisible();
            rectangle3.makeVisible();
            rectangle4.makeVisible();
            rectangle5.makeVisible();
            rectangle6.makeVisible();
            rectangle7.makeVisible();
        }
        else if(_digit ==1)
        {           
            rectangle1.makeInvisible();
            rectangle2.makeInvisible();
            rectangle3.makeInvisible();
            rectangle4.makeInvisible();
            rectangle5.makeVisible();
            rectangle6.makeInvisible();
            rectangle7.makeVisible();
        }
        else if(_digit == 2)
        {            
            rectangle1.makeVisible();
            rectangle2.makeVisible();
            rectangle3.makeVisible();
            rectangle4.makeInvisible();
            rectangle5.makeVisible();
            rectangle6.makeVisible();
            rectangle7.makeInvisible();
        }
        else if(_digit == 3)
        {            
            rectangle1.makeVisible();
            rectangle2.makeVisible();
            rectangle3.makeVisible();
            rectangle4.makeInvisible();
            rectangle5.makeVisible();
            rectangle6.makeInvisible();
            rectangle7.makeVisible();
        }
        else if(_digit == 4)
        {            
            rectangle1.makeInvisible();
            rectangle2.makeVisible();
            rectangle3.makeInvisible();
            rectangle4.makeVisible();
            rectangle5.makeVisible();
            rectangle6.makeInvisible();
            rectangle7.makeVisible();
        }
        else if(_digit == 5)
        {            
            rectangle1.makeVisible();
            rectangle2.makeVisible();
            rectangle3.makeVisible();
            rectangle4.makeVisible();
            rectangle5.makeInvisible();
            rectangle6.makeInvisible();
            rectangle7.makeVisible();
        }
        else if(_digit == 6)
        {            
            rectangle1.makeVisible();
            rectangle2.makeVisible();
            rectangle3.makeVisible();
            rectangle4.makeVisible();
            rectangle5.makeInvisible();
            rectangle6.makeVisible();
            rectangle7.makeVisible();
        }
        else if(_digit == 7)
        {            
            rectangle1.makeVisible();
            rectangle2.makeInvisible();
            rectangle3.makeInvisible();
            rectangle4.makeInvisible();
            rectangle5.makeVisible();
            rectangle6.makeInvisible();
            rectangle7.makeVisible();
        }
        else if(_digit == 8)
        {
            rectangle1.makeVisible();
            rectangle2.makeVisible();
            rectangle3.makeVisible();
            rectangle4.makeVisible();
            rectangle5.makeVisible();            
            rectangle6.makeVisible();
            rectangle7.makeVisible();
        }
        else if(_digit == 9)
        {
            rectangle1.makeVisible();
            rectangle2.makeVisible();
            rectangle3.makeVisible();
            rectangle4.makeVisible();
            rectangle5.makeVisible();
            rectangle6.makeInvisible();
            rectangle7.makeVisible();
        }
    }
    /*
     * Erase the rectangle on screen.
     */
    private void erase()
    {        
        Canvas canvas = Canvas.getCanvas();
        canvas.erase(this);
    }  
    /*
     * Draw the rectangle with current specifications on screen.
     */

    private void draw()
    {
        /*Canvas canvas = Canvas.getCanvas();
        canvas.draw(this, color,new java.awt.Rectangle(xPosition, yPosition, 
                                   width, height));
        canvas.wait(10);
        */
        
    } 
}

