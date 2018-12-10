package evaluacion1.evaluacion1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_registro.*

class Registro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

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
                    Toast.makeText(this@Registro, valor, Toast.LENGTH_SHORT).show()
                }
                //intent para guardar seleccion de spinner
                val intentArticulo = Intent(this@Registro,Listar::class.java )
            }

        }

        //guardando inputs de Registro.kt
        var getRut = inRut.text.toString()
        var getNombre = inNombre.text.toString()
        var getApellido = inApellido.text.toString()
        var getComuna = inComuna.text.toString()
        var getDireccion = inDireccion.text.toString()

        var buttonGuardar = btnGuardar.setOnClickListener{
            var rutIntento = Intent(this,Detalles::class.java)
            rutIntento.putExtra("msgRut",getRut)
            

        }
    }
}
