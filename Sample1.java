package ya.Sample;

import android.app.Activity;
import android.os.Bundle;

public class Sample1 extends Activity{
	/*Called when the activity is first created*/
	@Override
	public void onCreate(Bundle saveInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}
}
