package twice_a_day.forge.ru.scrollviewtraining;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Павел on 03.04.2016.
 */
public class FragmentScroll extends Fragment{
    public MyScroll myScroll;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.activity_main,container,false);
        myScroll=(MyScroll)v.findViewById(R.id.scrollView);
        return v;
    }


}
