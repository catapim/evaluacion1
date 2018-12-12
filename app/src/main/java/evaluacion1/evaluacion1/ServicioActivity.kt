package evaluacion1.evaluacion1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import evaluacion1.evaluacion1.R.id.spAparatos
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_servicio.*


class ServicioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_servicio)

        //llenando spinner con strings en arraylist
        var spinnerArticulos:ArrayList<String> = ArrayList()
        spinnerArticulos.add("")
        spinnerArticulos.add("PC")
        spinnerArticulos.add("Tablet")
        spinnerArticulos.add("Laptop")
        spinnerArticulos.add("Celular")
        spinnerArticulos.add("Tablet")
        spinnerArticulos.add("Impresora")



        spAparatos.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,spinnerArticulos)

        //programando qué hace el spinner si se selecciona algo
        spAparatos.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                var valor = spAparatos.selectedItem.toString()
                if (valor != "") {
                    Toast.makeText(this@ServicioActivity, valor, Toast.LENGTH_SHORT).show()
                }
                //intent para guardar seleccion de spinner
                val intentArticulo = Intent(this@ServicioActivity,Listar::class.java )
            }
        }

    }
}
