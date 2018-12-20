package evaluacion1.evaluacion1

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater

import android.view.ViewGroup
import android.widget.*
import evaluacion1.evaluacion1.R.id.lvEj
import kotlinx.android.synthetic.main.activity_listar.*
import kotlinx.android.synthetic.main.activity_registro.*
import kotlinx.android.synthetic.main.fragment_frag_listar.*

class Registro : AppCompatActivity() {


    var recyclerView: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

/*        //   var vista: View = LayoutInflater.from(contexto).inflate(recurso, null)
        var lista_clientes = arrayListOf<Cliente>()


        //boton que guarda datos cliente en arraylist
        btnGuardar.setOnClickListener {
            var nombre: String = findViewById<EditText>(R.id.inNombre).text.toString()
            var apellido: String = findViewById<EditText>(R.id.inApellido).text.toString()
            var rut: String = findViewById<EditText>(R.id.inRut).text.toString()
            var comuna: String = findViewById<EditText>(R.id.inComuna).text.toString()
            var direccion: String = findViewById<EditText>(R.id.inDireccion).text.toString()

            var cliente = Cliente(nombre, apellido, rut, comuna, direccion)
           lista_clientes.add(cliente)

            Toast.makeText(this, "Cliente registrado exitosamente", Toast.LENGTH_SHORT).show()

            val adaptador = CustomAdapter(this@Registro,R.layout.layout_lista_clientes,lista_clientes)
            lvEj.adapter = adaptador
        }

        //botón que limpia los campos edittext para registrar nuevo cliente
        btnOtro.setOnClickListener {
            inRut.text.clear()
            inNombre.text.clear()
            inApellido.text.clear()
            inComuna.text.clear()
            inDireccion.text.clear()
            Toast.makeText(this, "Ya puedes registrar otro cliente", Toast.LENGTH_SHORT).show()
        }

        btnListar.setOnClickListener {
            val fm = supportFragmentManager
            val ft = fm.beginTransaction()
            val frag = FragListar()
            frag.miContextoF = this
            ft.replace(R.id.layRegistro,frag)
            ft.commit()
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
        }*/
    }
}




