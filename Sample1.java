//宣告套件名稱
package ya.Sample;
//繼承前置檔案
import android.app.Activity;
import android.os.Bundle;
//宣告主程式
public class Sample1 extends Activity{
	/*當新畫面(Activity)建立時自動生成*/
	@Override
	public void onCreate(Bundle saveInstanceState){
		super.onCreate(savedInstanceState);	
		setContentView(R.layout.main);	//新增版面
	}
}
