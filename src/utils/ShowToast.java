package utils;

import com.example.showtoast.R;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
/**
 * ×Ô¶¨Òåtoast
 * @author sunxipeng
 *
 */
public class ShowToast {

	
	public static void showMyToast(Context context,String toastContent){
		
	    LayoutInflater inflater = LayoutInflater.from(context);
	    View view = inflater.inflate(R.layout.toast, null);
	    TextView tv_toast = (TextView) view.findViewById(R.id.tv_toast);
	    tv_toast.setText(toastContent);
	  
	    Toast toast = new Toast(context);
	    toast.setGravity(Gravity.CENTER, 0,80);
	    toast.setDuration(0);
	    toast.setView(view);
	    toast.show();
	  
	}

}
