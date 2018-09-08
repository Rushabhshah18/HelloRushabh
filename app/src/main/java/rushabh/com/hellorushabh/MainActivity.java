package rushabh.com.hellorushabh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Rushabh","Text Copied");
                EditText hello=findViewById(R.id.mainText);
                TextView result = findViewById(R.id.copy);
                if (hello.getText().length() <=0) {
                    Log.i("Rushabh",hello.getText().toString());
                    result.setText("Hello From Rushabh");

                }else{
                    Log.i("Rushabh",hello.getText().toString());
                    result.setText(hello.getText());
                }
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Rushabh","Background Color Changed");
                /*EditText hello=findViewById(R.id.mainText);
                TextView result = findViewById(R.id.copy);
                result.setText(hello.getText());
                hello.setTextColor(getResources().getColor(R.color.colorAccent))     ;*/
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.orange));
                EditText hello=findViewById(R.id.mainText);

                hello.setTextColor(getResources().getColor(R.color.colorPrimary))     ;
                TextView result = findViewById(R.id.copy);
                result.setTextColor(getResources().getColor(R.color.colorPrimary))     ;

            }
        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Rushabh","Text Color Changed");
                TextView result = findViewById(R.id.copy);
                result.setTextColor(getResources().getColor(R.color.colorAccent))     ;

            }
        });
        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Rushabh","Text Color Changed");
                EditText hello=findViewById(R.id.mainText);
                hello.setText("");
                hello.setTextColor(getResources().getColor(R.color.colorPrimary))     ;
                TextView result = findViewById(R.id.copy);
                result.setText("Hello From Rushabh");
                result.setTextColor(getResources().getColor(R.color.colorPrimary))     ;
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                result.setTextColor(getResources().getColor(R.color.orange));
                hello.setTextColor(getResources().getColor(R.color.orange));

            }
        });
        findViewById(R.id.button5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Rushabh","Text Changed");
                EditText hello=findViewById(R.id.mainText);
                hello.setText("");
                hello.setTextColor(getResources().getColor(R.color.colorPrimary))     ;
                TextView result = findViewById(R.id.copy);
                result.setText("Good Bye");
                result.setTextColor(getResources().getColor(R.color.colorPrimary))     ;

                result.setTextColor(getResources().getColor(R.color.green));
                hello.setTextColor(getResources().getColor(R.color.green));

            }
        });


    }
}
