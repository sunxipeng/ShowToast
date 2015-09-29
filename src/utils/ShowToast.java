package utils;

import com.example.showtoast.R;

import android.app.Activity;
import android.graphics.PixelFormat;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
/**
 * ×Ô¶¨Òåtoast
 * @author sunxipeng
 *
 */
public class ShowToast {

	private static WindowManager wm;
	private static  View view;
	private static TextView tv_toast;

	
	
	
	static Handler handler = new Handler(){
		public void handleMessage(android.os.Message msg) {
			if(msg.what == 0){
				if(view==null){
					return;
				}
			   wm.removeView(view);
			}
		};
	};
	
	
	public static void showMyToast(Activity activity,String toastContent){
	    LayoutInflater inflater = LayoutInflater.from(activity);
	    view = inflater.inflate(R.layout.toast, null);
	    tv_toast = (TextView) view.findViewById(R.id.tv_toast);
	    tv_toast.setText(toastContent);
	    wm = activity.getWindowManager();
		WindowManager.LayoutParams mpParams = new WindowManager.LayoutParams();
		mpParams.height = WindowManager.LayoutParams.WRAP_CONTENT;
		mpParams.width = WindowManager.LayoutParams.WRAP_CONTENT;
		mpParams.flags = WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE|WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE
				|WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON;
		mpParams.format = PixelFormat.TRANSLUCENT;
		mpParams.type = WindowManager.LayoutParams.TYPE_TOAST;
		wm.addView(view, mpParams);
	    handler.sendEmptyMessageDelayed(0, 3000);   
	}

}
