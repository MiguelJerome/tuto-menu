package com.example.evaluation_formative07_01_2001326;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
// Neme: Miguel Jerome
// Numero etudiant: 2001326
// classe: IFM25907-030-P2022


public class MainActivity extends AppCompatActivity {

    private Menu menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // une classe qui permet de lire un fichier xml
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);

        this.menu = menu;
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        ConstraintLayout layout = findViewById(R.id.main_Layout);

        /*
        menu.findItem(R.id.itemMenuRouge).setChecked(false);
        menu.findItem(R.id.itemMenuVert).setChecked(false);
        menu.findItem(R.id.itemMenuBleu).setChecked(false);

         */

        item.setChecked(true);
        switch (item.getItemId())
        {
            case R.id.itemMenuRouge:
                layout.setBackgroundColor(Color.RED);
                return true;
            case R.id.itemMenuVert:
                layout.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.itemMenuBleu:
                layout.setBackgroundColor(Color.BLUE);
                return true;
            default:
 // si j ai pas gerer la selection faite, je vais retourner ce que la classe au desssus quand elle recoit
 // onOptionsItemSelected
                return super.onOptionsItemSelected(item);
        }
    }
}




