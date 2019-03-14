package masterung.th.in.androidthai.myshopung;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryMemuFragment extends Fragment implements View.OnClickListener {


    private Button menu1Button, menu2Button, menu3Button, menu4Button, menu5Button;


    public CategoryMemuFragment() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        menu1Button = getView().findViewById(R.id.imvMemu1);
        menu2Button = getView().findViewById(R.id.imvMemu2);
        menu3Button = getView().findViewById(R.id.imvMemu3);
        menu4Button = getView().findViewById(R.id.imvMemu4);
        menu5Button = getView().findViewById(R.id.imvMemu5);

        menu1Button.setOnClickListener(this);
        menu2Button.setOnClickListener(this);
        menu3Button.setOnClickListener(this);
        menu4Button.setOnClickListener(this);
        menu5Button.setOnClickListener(this);


    }   // Main Method

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category_memu, container, false);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.imvMemu1:
                showListView(0);
                break;
            case R.id.imvMemu2:
                showListView(1);
                break;
            case R.id.imvMemu3:
                showListView(2);
                break;
            case R.id.imvMemu4:
                showListView(3);
                break;
            case R.id.imvMemu5:
                showListView(4);
                break;
        }


    }

    private void showListView(int i) {

    }
}
