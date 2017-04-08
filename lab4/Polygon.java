package lab4;
import java.util.ArrayList;
import java.util.Scanner;
	
public class Polygon
{
           private static ArrayList<Double> xcoordinate = new ArrayList<Double>();
           private static ArrayList<Double> ycoordinate = new ArrayList<Double>();
           private String name;
           private double peri_meter = 0.0;
		   private static Scanner Input; 
           
           public Polygon()
           {
        	   
        	   
           }// This is a constructor which is passing no arguement.
           
           public void setname(String name)
           {
        	   this.name = name;
           }//
           
           public String getname()
           {
        	   return name;
           }//A accessor method to get the name.
           
           public void addPoint(double a,double b)
           {
               xcoordinate.add(a);
               ycoordinate.add(b);
           } //A mutator method to input the coordinates of the vertex  of the polygon.     
            
           public void addPoint(java.awt.geom.Point2D Double)
           {
        	   
        	   
        	   
        	   
           }
           
           public double perimeter()
           {
        	   int flag = xcoordinate.size();
              
               if (flag < 3) 
               {
            	    System.out.println(" The Perimeter of the polygon cannot be found ");
            	    return 0.0;
               }
              
               else
               {          
                     for(int i = 0 ; i <= flag - 1 ; i++)
                     {
                         double temp = 0;
                         if ( i != flag-1 )
                         {
                             temp = (xcoordinate.get(i) - xcoordinate.get(i+1))*(xcoordinate.get(i) - xcoordinate.get(i+1))+(ycoordinate.get(i) - ycoordinate.get(i+1))*(ycoordinate.get(i) - ycoordinate.get(i+1));
                             temp = Math.sqrt(temp);
                         }     
                         else 
                         {
                             temp = (xcoordinate.get(i) - xcoordinate.get(0))*(xcoordinate.get(i) - xcoordinate.get(0))+(ycoordinate.get(i) - ycoordinate.get(0))*(ycoordinate.get(i) - ycoordinate.get(0));
                             temp = Math.sqrt(temp);
                         }
                         peri_meter = temp + peri_meter;
                     }
                     return peri_meter;
                 }
             }// A method to calculate and return the perimeter of the polygon.

          public double area() 
          {
                double temp=0.0,total=0.0;
                int n=xcoordinate.size();
                if (xcoordinate.size() >= 3)
                {	   
                	 for(int i=0 ; i<n ;i++)
                	 {
                		  if(i == n-1)
                		  temp = determinant.calc(xcoordinate.get(i),ycoordinate.get(i),xcoordinate.get(0),ycoordinate.get(0));	  
                		  else
                		  temp = determinant.calc(xcoordinate.get(i),ycoordinate.get(i),xcoordinate.get(i+1),ycoordinate.get(i+1));		   
                		  total += temp;	  
                	 
                	 }	 
                }
                return (total/2);
              
          } // A method to calculate and return the area of the polygon.
          
          
   
          public void print(java.io.PrintStream out)
          { 
        	  
        	  for(int i=0 ;i < xcoordinate.size() ; i++)
        	  {
        		  System.out.print("x[" + (i+1) + "], y[" + (i+1) + "] = (" + xcoordinate.get(i) + "," + ycoordinate.get(i) + ")\n");
        	  }        	  
        	  
        	  
          }// A method to print all the vertices of the Polygon.

          
          //testerPolygon
          public static void main(String[] args) 
          { 
         
               Polygon rectangle =new Polygon();
               Polygon polygon =new Polygon();
               Input = new Scanner(System.in);
               //Specific case of Polygon(A rectangle)
                System.out.println("State the Name of the Polygon :");
               String name = Input.next();
               rectangle.setname(name);
               System.out.println("Enter the coordinates of vertices of the" + rectangle.getname() + " : " );
               for(int i=0 ;i< 4; i++)
               {	   
                   double x1=Input.nextDouble();
                   double y1=Input.nextDouble();
                   rectangle.addPoint(x1,y1) ;
               }
              
               System.out.println("The Perimeter of the " + rectangle.getname() + " is :" + rectangle.perimeter());
               System.out.println("The Area of the " + rectangle.getname() + " is :" + rectangle.area());
               System.out.println("The Coordinates  of vertices of the " + rectangle.getname() + " are :" );
               rectangle.print(System.out);
               
               //General case for any Polygon 
               int j;
               System.out.println("State the Name of the polygon :");
               name = Input.next();
               polygon.setname(name);
               System.out.println("Enter the no. of Vertices of the " + polygon.getname() + " :");
               j = Input.nextInt();
               System.out.println("Enter the coordinates of Vertices of the " + polygon.getname() + " :");
               for(int i=0 ;i < j; i++)
               {	   
                   double x1=Input.nextDouble();
                   double y1=Input.nextDouble();
                   polygon.addPoint(x1,y1) ;
               }
               System.out.println("The Perimeter of the " + polygon.getname() + " is :" + polygon.perimeter());
               System.out.println("The Area of the " + polygon.getname() + " is :" + polygon.area());
               System.out.println("The Coordinates  of the " + polygon.getname() + " are :" );
               polygon.print(System.out);
                
              
              
          }  //end of the main() method.       
}  //end of the Polygon class.

class determinant
{     // A method to calculate the determinant of a matrix .
	  public static double calc(double x1, double y1,double x2,double y2) 
	  {
		  double determ_inant = 0.0;
	      determ_inant = x1*y2 - x2*y1 ;
	      return determ_inant;
	  }        	 
}

