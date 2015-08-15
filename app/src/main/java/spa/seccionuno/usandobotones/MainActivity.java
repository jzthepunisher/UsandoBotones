package spa.seccionuno.usandobotones;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn=(Button)findViewById(R.id.button3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),"Button 3 fue clickeado!",Toast.LENGTH_LONG).show();
            }
        });

        Button btn4 =(Button)findViewById(R.id.button4);
        btn4.setOnClickListener(btnListener);

        Button btn5 = (Button)findViewById(R.id.button5);
        btn5.setOnClickListener(btnListener);
    }

    private OnClickListener btnListener=new OnClickListener(){
        public void onClick(View view){
            Toast.makeText(getBaseContext(),((Button)view).getText() + " fue clickeado!",Toast.LENGTH_LONG).show();
        }
    };

    public void onClick(View view){
        Button btn= (Button)view;
        Toast.makeText(this,btn.getText() + " fue clickeao!",Toast.LENGTH_LONG).show();
    }

    public void onToggle(View view){
        ToggleButton btn=(ToggleButton)view;
        Toast.makeText(this," Toggle modo: " + btn.isChecked(),Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
