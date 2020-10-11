package co.edu.unimagdalena.apmoviles.tallertabletlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListaPaises extends AppCompatActivity {

    ListView listapaises;
    ArrayList<String> libros = new ArrayList<String>();
    ArrayList<String> autor = new ArrayList<String>();
    ArrayList<String> codigo = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_paises);
        libros.add("El país de octubre");
        libros.add("El reino de los zombis");
        libros.add("El retrato de Dorian Gray");
        libros.add("El agujero del infierno");
        libros.add("El silencio de los corderos");
        libros.add("El tapiz del vampiro");
        autor.add("Ray Bradbury");
        autor.add(" Len Barnhart");
        autor.add("Paulo Coelho");
        autor.add("Oscar Wilde");
        autor.add("Stephen king");
        autor.add("Oscar Wilde");
        codigo.add("0000");
        codigo.add("0001");
        codigo.add("0002");
        codigo.add("0003");
        codigo.add("0004");
        codigo.add("0005");
        listapaises = findViewById(R.id.lstpaises);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,libros);
        listapaises.setAdapter(adapter);

        listapaises.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Libro : " + (libros.get(position)+ "                                    "
                        + "Autor : "+(autor.get(position)+ "                                           "
                        + "Codigo : "+(codigo.get(position)))),Toast.LENGTH_LONG).show();
            }
        });

    }


}
