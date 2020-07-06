package com.mooc.ppjoke.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.mooc.ppjoke.R;

/**
 * Created by ZhuPengFei
 * Create Date 2020/7/6 20:46
 * Used
 */
public class TestHomeFragment extends Fragment {


	public TestHomeFragment() {
		// Required empty public constructor
	}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.test_frament_home, container, false);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		Button button;
		button = getView().findViewById(R.id.button);
		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
//				NavController controller = Navigation.findNavController(v);
//				controller.navigate(R.id.action_testHomeFragment_to_testDetailFragment);
				NavController controller = Navigation.findNavController(v);
				controller.navigate(R.id.action_testHomeFragment_to_testDetailFragment);
			}
		});
	}
}
