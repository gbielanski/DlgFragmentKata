package pl.kata.bielanski.dlgfragmentkata;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

	@Bind(R.id.button)
	Button showDialogButton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ButterKnife.bind(this);
		showDialogButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				FragmentManager fragmentManager = getSupportFragmentManager();
				DialogFragmentKata dialogFragmentKata = new DialogFragmentKata();
				dialogFragmentKata.show(fragmentManager, "DIALOG_FRAGMENT");
			}
		});
	}
}
