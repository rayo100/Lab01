
import java.util.Random;
/**
 * Write a description of class DigitsGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DigitsGame
{
    private Digit[] digits;
    private Digit[] holeDigits;
    private Digit[][] tablero;
    
    public DigitsGame(int N, int M, int B){
        this.digits = new Digit[M];
        this.holeDigits = new Digit[M];
        this.tablero = new Digit[N][N];
        Random rand = new Random();
        for(int i = 0;i<N;i++){
            for(int j=0;j<N;j++){
                tablero[i][j] = null;
            }
        }
        for(int i=0; i<M*2;i++){
            int rowPosition = rand.nextInt(1) + (N-1);
            int columnPosition = rand.nextInt(1) + (N-1);
            byte aleatoryDigit = (byte)rand.nextInt((9));
            this.digits[i] = new Digit(aleatoryDigit);
            this.holeDigits[i] = new Digit(aleatoryDigit);
            System.out.println(rowPosition);
            System.out.println(columnPosition);
            if(tablero[rowPosition][columnPosition]==null){
                this.tablero[rowPosition][columnPosition] = this.digits[i];
                int positions[] = generateAleatoryHoleDigitPosition(rowPosition,columnPosition,N);
                this.tablero[positions[0]][positions[1]]= this.holeDigits[i];
                
            }
        }
    } 
    
    /**
     * Generates an aleatory position(row,column)
     * different of the red Digit position
     * @param row, row of the Digit
     * @param column, column of the Digit 
     */
    public int[] generateAleatoryHoleDigitPosition(int row,int column,int N){ 
        Random rand = new Random();
        int rowHole = rand.nextInt(1) + (N-1);
        int columnHole = rand.nextInt(1) + (N-1);
        while((row==rowHole)||(column==columnHole)){
            rowHole = rand.nextInt(1) + N;
            columnHole = rand.nextInt(1) + N;
        }
        int positions[] = {rowHole,columnHole};
        return positions;
    }
}
