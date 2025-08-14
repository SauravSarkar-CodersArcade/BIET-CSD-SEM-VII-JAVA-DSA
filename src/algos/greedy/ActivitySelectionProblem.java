package algos.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Activity {
    int start;
    int finish;
    Activity(int start, int finish){
        this.start = start;
        this.finish = finish;
    }
}
public class ActivitySelectionProblem {
    // Custom Comparator for sorting the activities according to their finish time
    static class ActivityComparator implements Comparator<Activity>{
        public int compare(Activity a1, Activity a2){
            return a1.finish - a2.finish; // Ascending Order
            // return a2.finish - a1.finish; // Descending Order
        }
    }
    static void printMaxActivities(List<Activity> activities){
        // Sort the activities according to their finish time
        activities.sort(new ActivityComparator());
        // Always select the activity that finishes first
        int lastSelected = 0;
        System.out.print("(" + activities.get(lastSelected).start + "," +
                activities.get(lastSelected).finish + ")");
        for (int i=1; i<activities.size(); i++){
            // Select the next activity if the start time of the next is greater or equal
            // to the finish time of the previous activity
            if(activities.get(i).start >= activities.get(lastSelected).finish){
                System.out.print("(" + activities.get(i).start + "," +
                        activities.get(i).finish + ")");
                lastSelected = i; // Move the last selected index to the current index
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<Activity> activities = Arrays.asList(
                new Activity(5,7),
                new Activity(8,9),
                new Activity(1,4),
                new Activity(5,9),
                new Activity(0,6),
                new Activity(3,5)
        );
        printMaxActivities(activities);
    }
}
