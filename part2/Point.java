public class Point
{
   private double x;
   private double y;

   public Point(double xIn, double yIn)
   {
      this.x = xIn;
      this.y = yIn;
   }

   public double getX()
   {
      return this.x;
   }

   public double getY()
   {
      return this.y;
   }

   public double getRadius()
   {
      return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
   }

   public double getAngle()
   {
      if (x == 0.0)
      {
         if (y > 0.0) {return Math.PI/2.0;}
         else {return -1.0 * Math.PI/2.0;}
      }
      if (y == 0.0)
      {
         if (x > 0.0) {return 0.0;}
         else {return Math.PI;}
      }

      //Quadrant 1
      if (this.y > 0.0 && this.x > 0.0)
      {
         return Math.atan(this.y/this.x);
      }

      //Quadrant 2
      if (this.y > 0.0 && this.x < 0.0)
      {
         return Math.PI + Math.atan(this.y/this.x);
      }

      //Quadrant 3
      if (this.y < 0.0 && this.x < 0.0)
      {
         return -1.0* (Math.PI - Math.atan(this.y/this.x));
      }

      //Quadrant 4
      if (this.y < 0.0 && this.x > 0.0)
      {
         return Math.atan(this.y/this.x);
      }
      // If all else fails.. ?
      return Math.atan(this.y/this.x);
   }

   public Point rotate90()
   {
      double xNew = y*-1.0;
      double yNew = x;
      return new Point(xNew, yNew);
   }

}
