package nyc.c4q.androidtest_unit4final;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by justiceo on 1/9/18.
 */

public class InfoFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.info_fragment, container, false);
        final TextView textView = (TextView) v.findViewById(R.id.more_textView);
        final Button button1 = (Button) v.findViewById(R.id.more_button);

        //Implement listener for your button so that when you click the
        //button, android will listen to it.

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                textView.setText("Copyright 2017 @ C4Q. All Rights Reserved");
                button1.setVisibility(View.GONE);

            }
        });
        return v;
    }

}


