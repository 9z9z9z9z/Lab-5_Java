import org.jfree.ui.RefineryUtilities;

import java.awt.*;

public class app {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                final GraphComponent demo_add_arraylist = new GraphComponent("Medium time to ArrayList", 1, true);
                demo_add_arraylist.pack();
                RefineryUtilities.centerFrameOnScreen(demo_add_arraylist);
                demo_add_arraylist.setVisible(true);

                final GraphComponent demo_remove_arraylist = new GraphComponent("Sum time to ArrayList", 2, false);
                demo_remove_arraylist.pack();
                RefineryUtilities.centerFrameOnScreen(demo_remove_arraylist);
                demo_remove_arraylist.setVisible(true);

                final GraphComponent demo_add_hashmap = new GraphComponent("Medium time to HashMap", 3, true);
                demo_add_hashmap.pack();
                RefineryUtilities.centerFrameOnScreen(demo_add_hashmap);
                demo_add_hashmap.setVisible(true);

                final GraphComponent demo_remove_hashmap = new GraphComponent("Sum time to HashMap", 4, false);
                demo_remove_hashmap.pack();
                RefineryUtilities.centerFrameOnScreen(demo_remove_hashmap);
                demo_remove_hashmap.setVisible(true);
            }
        });
    }
}
