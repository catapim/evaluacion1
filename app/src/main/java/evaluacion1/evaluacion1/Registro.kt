package evaluacion1.evaluacion1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.TextView
import evaluacion1.evaluacion1.R.id.btnGuardar
import evaluacion1.evaluacion1.R.id.lvEj
import kotlinx.android.synthetic.main.activity_registro.*

class Registro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)


        val lista: ArrayList<Cliente> = ArrayList()
        lista.add(Cliente(inNombre.toString(),inApellido.toString(),inRut.toString(),inComuna.toString(),inDireccion.toString()))
        val adaptador:CustomAdapter = CustomAdapter(this, R.layout.activity_listar, lista)
      //  lvEj.adapter = adaptador

    }


    class CustomAdapter(
        var contexto: Registro,
        val recurso: Int,
        val lista: ArrayList<Cliente>
    ) : ArrayAdapter<Cliente>(contexto, recurso, lista) {

        override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
            var vista: View = LayoutInflater.from(contexto).inflate(recurso, null)

            //guardando inputs de Registro.kt
            var getRut = vista.findViewById<TextView>(R.id.inRut).toString()
            var getNombre = vista.findViewById<TextView>(R.id.inNombre).toString()
            var getApellido = vista.findViewById<TextView>(R.id.inApellido).toString()
            var getComuna = vista.findViewById<TextView>(R.id.inComuna).toString()
            var getDireccion = vista.findViewById<TextView>(R.id.inDireccion).toString()
            val cliente: Cliente = lista[position]
            var buttonGuardar = vista.findViewById<Button>(btnGuardar)
            buttonGuardar.setOnClickListener {
                //     lista.add(Cliente(getNombre, getApellido, getRut, getComuna, getDireccion).toString())
            }
            return vista
        }
    }
}
