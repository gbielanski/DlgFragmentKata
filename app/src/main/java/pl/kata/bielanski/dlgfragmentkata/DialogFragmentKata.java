package pl.kata.bielanski.dlgfragmentkata;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DialogFragmentKata extends DialogFragment {
	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view;

		view = inflater.inflate(R.layout.dialog_fragment_kata, container);
		return view;

	}
}
