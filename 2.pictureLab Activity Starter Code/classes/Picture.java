import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
   ///////////////////// constructors //////////////////////////////////
   
   /**
    * Constructor that takes no arguments 
    */
   public Picture ()
   {
      /* not needed but use it to show students the implicit call to super()
       * child constructors always call a parent constructor 
       */
      super();  
   }
   
   /**
    * Constructor that takes a file name and creates the picture 
    * @param fileName the name of the file to create the picture from
    */
   public Picture(String fileName)
   {
      // let the parent class handle this fileName
      super(fileName);
   }
   
   /**
    * Constructor that takes the width and height
    * @param height the height of the desired picture
    * @param width the width of the desired picture
    */
   public Picture(int height, int width)
   {
      // let the parent class handle this width and height
      super(width,height);
   }
   
   /**
    * Constructor that takes a picture and creates a 
    * copy of that picture
    * @param copyPicture the picture to copy
    */
   public Picture(Picture copyPicture)
   {
      // let the parent class do the copy
      super(copyPicture);
   }
   
   /**
    * Constructor that takes a buffered image
    * @param image the buffered image to use
    */
   public Picture(BufferedImage image)
   {
      super(image);
   }
   
   ////////////////////// methods ///////////////////////////////////////
   
   /**
    * Method to return a string with information about this picture.
    * @return a string with information about the picture such as fileName,
    * height and width.
    */
   public String toString()
   {
      String output = "Picture, filename " + getFileName() + 
         " height " + getHeight() 
         + " width " + getWidth();
      return output;
      
   }
   
   /** Method to set the blue to 0 */
   public void zeroBlue()
   {
      Pixel[][] pixels = this.getPixels2D();
      for (Pixel[] rowArray : pixels)
      {
         for (Pixel pixelObj : rowArray)
         {
            pixelObj.setBlue(0);
         }
      }
   }
   //------------------------------------------------------------------------------Added these methods up until the next comment
   public void zeroGreen()
   {
      Pixel[][] pixels = this.getPixels2D();
      for (Pixel[] rowArray : pixels)
      {
         for (Pixel pixelObj : rowArray)
         {
            pixelObj.setGreen(0);
         }
      }
   }
   
   public void zeroRed()
   {
      Pixel[][] pixels = this.getPixels2D();
      for (Pixel[] rowArray : pixels)
      {
         for (Pixel pixelObj : rowArray)
         {
            pixelObj.setRed(0);
         }
      }
   }
   
   public void negate()
   {
      Pixel[][] pixels = this.getPixels2D();
      for (Pixel[] rowArray : pixels)
      {
         for (Pixel pixelObj : rowArray)
         {
            pixelObj.setRed(255 - pixelObj.getRed());
            pixelObj.setGreen(255 - pixelObj.getGreen());
            pixelObj.setBlue(255 - pixelObj.getBlue());
         }
      }
   }
   public void grayscale()
   {
      Pixel[][] pixels = this.getPixels2D();
      for (Pixel[] rowArray : pixels)
      {
         for (Pixel pixelObj : rowArray)
         {
            int avg = (pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue())/3;
            pixelObj.setRed(avg);
            pixelObj.setGreen(avg);
            pixelObj.setBlue(avg);
         }
      }
   }
   public void fixUnderwater()
   {
      Pixel[][] pixels = this.getPixels2D();
      for (Pixel[] rowArray : pixels)
      {
         for (Pixel pixelObj : rowArray)
         {
            pixelObj.setRed((int)(pixelObj.getRed()*2.5));
         }
      }
   }
   public void mirrorVerticalLeftToRight()
   {
      Pixel[][] pixels = this.getPixels2D();
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      int width = pixels[0].length;
      for (int row = 0; row < pixels.length; row++)
      {
         for (int col = 0; col < width / 2; col++)
         {
            leftPixel = pixels[row][col];
            rightPixel = pixels[row][width - 1 - col];
            leftPixel.setColor(rightPixel.getColor());
         }
      } 
   }
   public void mirrorHorizontal()
   {
      Pixel[][] pixels = this.getPixels2D();
      Pixel currPix = null;
      Pixel botPix = null;
      int x = pixels.length;
      for (int row = 0; row < x/2; row++)
      {
         for (int col = 0; col < pixels[row].length; col++)
         {
            currPix = pixels[row][col];
            botPix = pixels[x - 1 - row][col];
            botPix.setColor(currPix.getColor());
         }
      } 
   }
   public void mirrorHorizontalBotToTop()
   {
      Pixel[][] pixels = this.getPixels2D();
      Pixel currPix = null;
      Pixel botPix = null;
      int x = pixels.length;
      for (int row = 0; row < x/2; row++)
      {
         for (int col = 0; col < pixels[row].length; col++)
         {
            currPix = pixels[row][col];
            botPix = pixels[x - 1 - row][col];
            currPix.setColor(botPix.getColor());
         }
      } 
   }
   public void mirrorDiagonal()
   {
      Pixel[][] pixels = this.getPixels2D();
      Pixel pixA = null;
      Pixel pixB = null;
      int mirror = Math.min(pixels.length,pixels[0].length);
      for (int row = 0; row < mirror; row++)
      {
         for (int col = 0; col < row; col++)
         {
            pixA = pixels[row][col];
            pixB = pixels[col][row];
            pixB.setColor(pixA.getColor());
         }
      } 
   }
   public void mirrorArms(){
      Pixel[][] pixels = this.getPixels2D();
      Pixel pixA = null;
      Pixel pixB = null;
      for (int row = 155; row < 201; row++)
      {
         for (int col = 102; col < 169; col++)
         {
            pixA = pixels[row][col];
            pixB = pixels[201-row+201][col];
            pixB.setColor(pixA.getColor());
         }
      } 
      
      for (int row = 166; row < 201; row++)
      {
         for (int col = 238; col < 295; col++)
         {
            pixA = pixels[row][col];
            pixB = pixels[201-row+201][col];
            pixB.setColor(pixA.getColor());
         }
      } 
   }
   public void mirrorGull(){
      Pixel[][] pixels = this.getPixels2D();
      Pixel pixA = null;
      Pixel pixB = null;
      for (int row = 227; row < 326; row++)
      {
         for (int col = 233; col < 345; col++)
         {
            pixA = pixels[row][col];
            pixB = pixels[row][345-col+345];
            pixB.setColor(pixA.getColor());
         }
      } 
   }
   public void copyBound(Picture fromPic, int startR, int startC, int endR, int endC, int locR, int locC)
   {
      Pixel fromPixel = null;
      Pixel toPixel = null;
      Pixel[][] toPixels = this.getPixels2D();
      Pixel[][] fromPixels = fromPic.getPixels2D();
      for (int fromRow = 0, toRow = locR; 
            fromRow < endR && toRow < toPixels.length; 
            fromRow++, toRow++)
      {
         for (int fromCol = startC, toCol = locC; 
               fromCol < endC && toCol < toPixels[0].length;  
               fromCol++, toCol++)
         {
            fromPixel = fromPixels[fromRow][fromCol];
            toPixel = toPixels[toRow][toCol];
            toPixel.setColor(fromPixel.getColor());
         }
      }   
   }
   public void myCollage(){
      Picture gdog = new Picture("dog.jpg");
      gdog.grayscale();
      this.copyBound(gdog,127,129,368,407,0,0);
      Picture bdog = new Picture("dog.jpg");
      bdog.zeroRed();
      bdog.zeroGreen();
      this.copyBound(bdog,127,129,368,407,300,0);
      Picture rdog = new Picture("dog.jpg");
      rdog.zeroBlue();
      rdog.zeroGreen();
      this.copyBound(rdog,127,129,368,407,0,278);
      Picture grdog = new Picture("dog.jpg");
      grdog.zeroRed();
      grdog.zeroBlue();
      this.copyBound(grdog,127,129,368,407,300,278);
   }
   public void edgeDetection2(int edgeDist)
   {
      Picture temp = new Picture(this);
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      Pixel[][] pixels = this.getPixels2D();
      Color rightColor = null;
      for (int row = 0; row < pixels.length; row++)
      {
         for (int col = 0; 
               col < pixels[0].length-1; col++)
         {
            leftPixel = pixels[row][col];
            rightPixel = pixels[row][col+1];
            rightColor = rightPixel.getColor();
            if (leftPixel.colorDistance(rightColor) > 
                 edgeDist)
               leftPixel.setColor(Color.BLACK);
            else
               leftPixel.setColor(Color.WHITE);
         }
      }
      Pixel bpix = null;
      Pixel tpix = null;
      Color bcol = null;
      Pixel[][] arr = temp.getPixels2D();
      for (int row = 0; row < pixels.length-1; row++)
      {
         for (int col = 0; 
               col < pixels[0].length; col++)
         {
            tpix = arr[row][col];
            bpix = arr[row+1][col];
            bcol = bpix.getColor();
            if (tpix.colorDistance(bcol) > 
                 edgeDist)
               pixels[row][col].setColor(Color.BLACK);
         }
      }
   }
   public void edgeDetection3(int edgeDist){
      Picture temp = new Picture(this);
      Pixel pixA = null;
      Pixel pixB = null;
      Pixel[][] pixels = this.getPixels2D();
      Color pixBc = null;
      Pixel[][] arr = temp.getPixels2D();
      for (int row = 1; row < pixels.length-1; row++)
      {
         for (int col = 1; col < pixels[0].length-1; col++)
         {
            int count = 0;
            pixA = arr[row][col];
            pixB = arr[row][col+1];
            if (pixA.colorDistance(pixB.getColor()) > edgeDist) count++;
            pixB = arr[row][col-1];
            if (pixA.colorDistance(pixB.getColor()) > edgeDist) count++;
            pixB = arr[row+1][col];
            if (pixA.colorDistance(pixB.getColor()) > edgeDist) count++;
            pixB = arr[row-1][col];
            if (pixA.colorDistance(pixB.getColor()) > edgeDist) count++;
            if(count > 2) pixels[row][col].setColor(Color.BLACK);
            else pixels[row][col].setColor(Color.WHITE);
         }
      }
   }
   //-----------------------------------------------------------------------------------Method adding ends here
   /** Method that mirrors the picture around a 
     * vertical mirror in the center of the picture
     * from left to right */
   public void mirrorVertical()
   {
      Pixel[][] pixels = this.getPixels2D();
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      int width = pixels[0].length;
      for (int row = 0; row < pixels.length; row++)
      {
         for (int col = 0; col < width / 2; col++)
         {
            leftPixel = pixels[row][col];
            rightPixel = pixels[row][width - 1 - col];
            rightPixel.setColor(leftPixel.getColor());
         }
      } 
   }
   /** Mirror just part of a picture of a temple */
   //------------------------------------------------Edited this method to count # of iterations
   public void mirrorTemple()
   {
      int mirrorPoint = 276;
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      int count = 0;
      Pixel[][] pixels = this.getPixels2D();
      // loop through the rows
      int num = 0;
      for (int row = 27; row < 97; row++)
      {
      
         // loop from 13 to just before the mirror point
         for (int col = 13; col < mirrorPoint; col++)
         {
            
            leftPixel = pixels[row][col];      
            rightPixel = pixels[row]                       
                              [mirrorPoint - col + mirrorPoint];
            rightPixel.setColor(leftPixel.getColor());
            num++;
            
         }
         
         
      }
      System.out.print(num);
   }
   
   /** copy from the passed fromPic to the
     * specified startRow and startCol in the
     * current picture
     * @param fromPic the picture to copy from
     * @param startRow the start row to copy to
     * @param startCol the start col to copy to
     */
   public void copy(Picture fromPic, 
                  int startRow, int startCol)
   {
      Pixel fromPixel = null;
      Pixel toPixel = null;
      Pixel[][] toPixels = this.getPixels2D();
      Pixel[][] fromPixels = fromPic.getPixels2D();
      for (int fromRow = 0, toRow = startRow; 
            fromRow < fromPixels.length &&
            toRow < toPixels.length; 
            fromRow++, toRow++)
      {
         for (int fromCol = 0, toCol = startCol; 
               fromCol < fromPixels[0].length &&
               toCol < toPixels[0].length;  
               fromCol++, toCol++)
         {
            fromPixel = fromPixels[fromRow][fromCol];
            toPixel = toPixels[toRow][toCol];
            toPixel.setColor(fromPixel.getColor());
         }
      }   
   }

   /** Method to create a collage of several pictures */
   public void createCollage()
   {
      Picture flower1 = new Picture("flower1.jpg");
      Picture flower2 = new Picture("flower2.jpg");
      this.copy(flower1,0,0);
      this.copy(flower2,100,0);
      this.copy(flower1,200,0);
      Picture flowerNoBlue = new Picture(flower2);
      flowerNoBlue.zeroBlue();
      this.copy(flowerNoBlue,300,0);
      this.copy(flower1,400,0);
      this.copy(flower2,500,0);
      this.mirrorVertical();
      this.write("collage.jpg");
   }
   
   
   /** Method to show large changes in color 
     * @param edgeDist the distance for finding edges
     */
   public void edgeDetection(int edgeDist)
   {
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      Pixel[][] pixels = this.getPixels2D();
      Color rightColor = null;
      for (int row = 0; row < pixels.length; row++)
      {
         for (int col = 0; 
               col < pixels[0].length-1; col++)
         {
            leftPixel = pixels[row][col];
            rightPixel = pixels[row][col+1];
            rightColor = rightPixel.getColor();
            if (leftPixel.colorDistance(rightColor) > 
                 edgeDist)
               leftPixel.setColor(Color.BLACK);
            else
               leftPixel.setColor(Color.WHITE);
         }
      }
   }
   
   
   /* Main method for testing - each class in Java can have a main 
    * method 
    */
   public static void main(String[] args) 
   {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.zeroBlue();
      beach.explore();
   }
   
} // this } is the end of class Picture, put all new methods before this
