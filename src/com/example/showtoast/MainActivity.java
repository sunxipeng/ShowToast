package com.example.showtoast;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import utils.ShowToast;

public class MainActivity extends Activity {

	WindowManager mqManager;
	View view;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mqManager = getWindowManager();
		ShowToast.showMyToast(this,"您的信息输入有误");
	}
	

}
