package com.mooc.ppjoke.ui.detail;

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
public class TestDetailFragment extends Fragment {


	public TestDetailFragment() {
		// Required empty public constructor
	}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.test_fragment_detail, container, false);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		getView().findViewById(R.id.button2).setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_testDetailFragment_to_testHomeFragment));

	}
}
