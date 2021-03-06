package com.example.rlam.ckl8_250_homework2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by Margaret on 4/20/2015
 * <p/>
 * This sample app shows master/detail flow by using fragments
 * <p/>
 * Main activity representing a list of AndroidVersions. This activity
 * has different presentations for handset and tablet-size devices.
 * - On handsets, the activity presents a list, which when touched,
 * leads to a details screen {@link TaskDetailActivity}
 * - On tablets, the activity presents the list and item details side-by-side
 * using two vertical panes: {@link MainFragment} and {@link TaskDetailFragment}
 * <p/>
 * This activity also implements the required {@link MainFragment.Callbacks} interface
 * to listen for item selections.
 */
public class MainActivity extends ActionBarActivity {

    /**
     * Whether or not the activity is in two-pane mode, i.e. running on a tablet device.
     */
//    private boolean mTwoPane;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
//            if (findViewById(R.id.task_detail_container) != null) {
//                // The detail container view will be present only in the large-screen layouts (res/values-large and
//                // res/values-sw600dp). If this view is present, then the activity should be in two-pane mode.
////                mTwoPane = true;
//
//                // In two-pane mode, list items should be given the 'activated' state when touched.
//                ((TaskListFragment) getSupportFragmentManager()
//                        .findFragmentById(R.id.task_list))
//                        .setActivateOnItemClick(true);
//            }
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new MainFragment())
                    .commit();
        }


    }

//    /**
//     * Callback method from {@link TaskListFragment.Callbacks}
//     * indicating that the item with the given ID was selected.
//     */
//    @Override
//    public void onItemSelected(String id) {
//        if (mTwoPane) {
//            // In two-pane mode, show the detail view in this activity by
//            // adding or replacing the detail fragment using a fragment transaction.
//            Bundle arguments = new Bundle();
//            arguments.putString(TaskDetailFragment.ARG_ITEM_ID, id);
//            TaskDetailFragment fragment = new TaskDetailFragment();
//            fragment.setArguments(arguments);
//            getSupportFragmentManager().beginTransaction()
//                    .replace(R.id.task_detail_container, fragment)
//                    .commit();
//
//        } else {
//            // In single-pane mode, simply start the detail activity
//            // for the selected item ID.
//            Intent detailIntent = new Intent(this, TaskDetailActivity.class);
//            detailIntent.putExtra(TaskDetailFragment.ARG_ITEM_ID, id);
//            startActivity(detailIntent);
//        }
//    }
}
