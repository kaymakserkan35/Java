
package event;
import java.util.*;
 
    public class CourseWithEnrollmentEvent {
      private String name = "default name";
      private ArrayList<String> students = new ArrayList<String>();
      private int enrollmentCap = 10;
 
      private ArrayList<EnrollmentEventListener> enrollmentListenerList;
 
      public CourseWithEnrollmentEvent() {
      }
 
      public CourseWithEnrollmentEvent(String name) {
        this.name = name;
      }
 
      public void addStudent(String student) {
        students.add(student);
 
        if (students.size() > enrollmentCap) {
          // Fire EnrollmentEvent
          processEvent(new EnrollmentEvent(this,
            student, getEnrollmentCap()));
        }
      }
 
      public String[] getStudents() {
        return (String[])students.toArray();
      }
 
      public int getNumberOfStudents() {
        return students.size();
      }
 
      public int getEnrollmentCap() {
        return enrollmentCap;
      }
 
      public void setEnrollmentCap(int enrollmentCap) {
        this.enrollmentCap = enrollmentCap;
      }
 
      /** Register an action event listener */
      public synchronized void addEnrollmentListener(EnrollmentEventListener listener) {
        if (enrollmentListenerList == null) {
          enrollmentListenerList = new ArrayList<EnrollmentEventListener>(2);
        }
 
        if (!enrollmentListenerList.contains(listener)) {
          enrollmentListenerList.add(listener);
        }
      }
 
      /** Remove an action event listener */
      public synchronized void removeEnrollmentListener(EnrollmentEventListener listener) {
        if (enrollmentListenerList !=null && enrollmentListenerList.contains(listener)) {
          enrollmentListenerList.remove(listener);
        }
      }
 
      /** Fire EnrollmentEvent */
      private void processEvent(EnrollmentEvent e) {
        ArrayList list;
 
        synchronized (this) {
          if (enrollmentListenerList == null) return;
          list = (ArrayList)enrollmentListenerList.clone();
        }
 
        for (int i = 0; i < list.size(); i++) {
          EnrollmentEventListener listener = (EnrollmentEventListener)list.get(i);
          listener.enrollmentExceeded(e);
        }
      }
    }