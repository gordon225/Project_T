package com.allenxiao.gordon.repeattimerl;

import android.app.Activity;
import android.net.Uri;
import android.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link com.allenxiao.gordon.repeattimerl.AddTimerFragment.SetTimerListener} interface
 * to handle interaction events.
 *
 */
public class AddTimerFragment extends Fragment {

    private SetTimerListener mListener;

    public AddTimerFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (SetTimerListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement SetTimerListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface SetTimerListener {
        public void onTimerSet(int min, int sec);
    }

}
