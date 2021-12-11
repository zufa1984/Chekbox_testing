package uz.eskishahar.chekboxtesting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBox1, checkBox2, checkBox3;
    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buyurtmaBerish();


    }
    public void  buyurtmaBerish () {
        checkBox1 = (CheckBox) findViewById(R.id.checkbox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkbox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkbox3);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder natija = new StringBuilder();
                natija.append("Buyurtma tarkibi:");
                int jami = 0;
                int lav_price = 15000;
                int shau_price = 15000;
                int cola_price = 5000;

                if (checkBox1.isChecked()) {
                    jami +=+ lav_price;

                    natija.append ("\nLavash: " + lav_price + " so'm");
                }
                if (checkBox2.isChecked()) {
                    jami += shau_price;
                    natija.append("\nShaurma: " + shau_price + " so'm");

                }
                if (checkBox3.isChecked()) {
                    jami += cola_price;
                    natija.append("\nShaurma: " + cola_price + " so'm");

                }

                natija.append("\nJami: " + jami + " so'm");

                Toast.makeText(MainActivity.this, natija.toString(), Toast.LENGTH_LONG).show();


            }
        });




    }
}