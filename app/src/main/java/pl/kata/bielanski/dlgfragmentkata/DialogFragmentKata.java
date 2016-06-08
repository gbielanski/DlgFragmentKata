package pl.kata.bielanski.dlgfragmentkata;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class DialogFragmentKata extends DialogFragment {
	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view;
		view = inflater.inflate(R.layout.dialog_fragment_kata, container);

		Button cancel_button = (Button)view.findViewById(R.id.cancel_button);
		cancel_button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				dismiss();
			}
		});

		Button ok_button = (Button)view.findViewById(R.id.ok_button);
		ok_button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(getActivity(), "Dialog Fragment", Toast.LENGTH_LONG).show();
				dismiss();
			}
		});
		return view;

	}
}
