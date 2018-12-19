package evaluacion1.evaluacion1

import android.content.Context
import android.os.Bundle
import android.support.constraint.R.id.parent
import android.support.v4.app.FragmentManager
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import kotlinx.android.synthetic.main.activity_listar.*
import kotlinx.android.synthetic.main.activity_registro.*
import kotlinx.android.synthetic.main.activity_registro.view.*
import kotlinx.android.synthetic.main.layout_lista_clientes.*

class Registro : AppCompatActivity() {


    var recyclerView: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        val view  = findViewById(R.layout.layout_lista_clientes) as View
        val laLista = view.findViewById(R.id.lvEj) as ListView
        //   var vista: View = LayoutInflater.from(contexto).inflate(recurso, null)
        var lista_clientes = arrayListOf<Cliente>()
        var buttonGuardar = findViewById<Button>(R.id.btnGuardar)
        var buttonOtro = findViewById<Button>(R.id.btnOtro)

        //boton que guarda datos cliente en arraylist
        buttonGuardar.setOnClickListener {
            //var rutTextBox:EditText = findViewById<EditText>(R.id.inRut)
            //System.out.println(rutTextBox.text);
            var nombre: String = findViewById<EditText>(R.id.inNombre).text.toString()
            var apellido: String = findViewById<EditText>(R.id.inApellido).text.toString()
            var rut: String = findViewById<EditText>(R.id.inRut).text.toString()
            var comuna: String = findViewById<EditText>(R.id.inComuna).text.toString()
            var direccion: String = findViewById<EditText>(R.id.inDireccion).text.toString()

            var cliente = Cliente(nombre, apellido, rut, comuna, direccion)
           lista_clientes.add(cliente)
            //Toast.makeText(this, "hola "+cliente.nombre+" "+cliente.apellido, Toast.LENGTH_SHORT).show()
            Toast.makeText(this, "Cliente registrado exitosamente", Toast.LENGTH_SHORT).show()

            val adaptador = CustomAdapter(this@Registro,
                R.layout.layout_lista_clientes,lista_clientes)
            laLista.adapter = adaptador
        }
        //botón que limpia los campos edittext para registrar nuevo cliente
        buttonOtro.setOnClickListener {
            inRut.text.clear()
            inNombre.text.clear()
            inApellido.text.clear()
            inComuna.text.clear()
            inDireccion.text.clear()
            Toast.makeText(this, "Ya puedes registrar otro cliente", Toast.LENGTH_SHORT).show()
        }
    }

    class CustomAdapter(
        var miContexto: Context,
        var miRecurso: Int,
        var miLista: ArrayList<Cliente>
    ) : ArrayAdapter<Cliente>(miContexto, miRecurso, miLista) {
        override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
            var v: View = LayoutInflater.from(miContexto).inflate(miRecurso, null)
            var clienteNombre = v.findViewById<TextView>(R.id.lblNombre)
            var clienteApellido = v.findViewById<TextView>(R.id.lblApellido)
            clienteNombre.text = miLista[position].nombre.toString()
            clienteApellido.text = miLista[position].apellido.toString()
            return v
        }
    }
}




