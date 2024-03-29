import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class ExampleMap
{
   public static List<String> highEnrollmentStudents(
      Map<String, List<Course>> courseListsByStudentName, int unitThreshold)
   {
      List<String> overEnrolledStudents = new LinkedList<>();

      /*
         Build a list of the names of students currently enrolled
         in a number of units strictly greater than the unitThreshold.
      */

      for (String key: courseListsByStudentName.keySet())
      {
         List<Course> courseList = courseListsByStudentName.get(key);
         int unitCount = 0;
         for (Course c: courseList)
         {
            int units = c.getNumUnits();
            unitCount += units;
         }
         if (unitCount > unitThreshold)
         {
            overEnrolledStudents.add(key);
         }
      }

      return overEnrolledStudents;      
   }
}
