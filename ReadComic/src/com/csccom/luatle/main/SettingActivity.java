
package com.csccom.luatle.main;

import java.util.Locale;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

/**
 * @author ADMIN
 * 
 */
public class SettingActivity extends Activity {
	private AlertDialog.Builder builderLanguage;
	private Configuration config;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);

		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.setting);

		Button btnLanguage = (Button) findViewById(R.id.btnlanguage);
		btnLanguage.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				final String[] language = { "Vietnamese", "English" };
				builderLanguage = new AlertDialog.Builder(SettingActivity.this);
				builderLanguage.setTitle("Select a languale");
				builderLanguage
						.setSingleChoiceItems(language, -1,
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog, int item) {
										// TODO Auto-generated method stub

										if (item == 0) {
											Toast.makeText(getApplicationContext(),
													language[item], 1000).show();
											Locale locale = new Locale("vi");
											// Locale.setDefault(locale);
											config = new Configuration();
											config.locale = locale;

										}
										if (item == 1) {
											Toast.makeText(getApplicationContext(),
													language[item], 1000).show();
											Locale locale = new Locale("en");
											config = new Configuration();
											config.locale = locale;

										}
									}
								})
						.setPositiveButton("OK", new DialogInterface.OnClickListener() {

							@Override
							public void onClick(DialogInterface dialog, int which) {
								// TODO Auto-generated method stub
								getBaseContext().getResources().updateConfiguration(
										config,
										getBaseContext().getResources()
												.getDisplayMetrics());
							}
						})
						.setNegativeButton("Cancel",
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int which) {
										// TODO Auto-generated method stub
										dialog.cancel();
									}
								});
				builderLanguage.show();

			}
			
		});
}
	}


