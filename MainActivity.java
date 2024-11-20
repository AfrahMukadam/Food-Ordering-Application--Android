import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;
import android.widget.Button;
public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final CheckBox c1=(CheckBox)findViewById(R.id.c1);
        final CheckBox c2=(CheckBox)findViewById(R.id.c2);
        final CheckBox c3=(CheckBox)findViewById(R.id.c3);
        final CheckBox c4=(CheckBox)findViewById(R.id.c4);
        final CheckBox c5=(CheckBox)findViewById(R.id.c5);
        final Button b1=(Button)findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int count=0;
                StringBuilder result= new StringBuilder();
                result.append("Selected Items");
                if(c1.isChecked())
                {
                    result.append("\nCoffee 100 rs");
                    count+=100;
                }

                if(c2.isChecked())
                {
                    result.append("\nTea 80 rs");
                    count+=80;
                }
                if(c3.isChecked())
                {
                    result.append("\nCocktail 200 rs");
                    count+=200;
                }
                if(c4.isChecked())
                {
                    result.append("\nPizza 150 rs");
                    count+=150;
                }
                if(c5.isChecked())
                {
                    result.append("\nSandwich 90 rs");
                    count+=90;
                }
                result.append("\nTotal="+count+"Rs");
                Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_LONG).show();


            }
        });
    }
}