package evaluacion1.evaluacion1

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import evaluacion1.evaluacion1.R.layout.fragment_frag_listar_clientes
import evaluacion1.evaluacion1.R.id.lvEj
import evaluacion1.evaluacion1.R.layout.fragment_frag_registro_clientes
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_frag_listar_clientes.*

class FragRegistroClientes (): Fragment() {

    var miContexto: Context? = null
    var lista_clientes = arrayListOf<Cliente>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var v = inflater.inflate(R.layout.fragment_frag_registro_clientes, container, false)
        var v2 = inflater.inflate(R.layout.fragment_frag_listar_clientes, container, false)
        var lvEj2 = v2.findViewById(R.id.lvEj) as ListView

        var btnSave = v.findViewById<Button>(R.id.btnGuardar)
        var btnClear = v.findViewById<Button>(R.id.btnOtro)

        btnSave.setOnClickListener {
            var nombre = v.findViewById<EditText>(R.id.inNombre).text.toString()
            var apellido: String = v.findViewById<EditText>(R.id.inApellido).text.toString()
            var rut: String = v.findViewById<EditText>(R.id.inRut).text.toString()
            var comuna: String = v.findViewById<EditText>(R.id.inComuna).text.toString()
            var direccion: String = v.findViewById<EditText>(R.id.inDireccion).text.toString()

            var cliente = Cliente(nombre, apellido, rut, comuna, direccion)
            lista_clientes.add(cliente)

            val adaptador = CustomAdapter(miContexto!!, R.layout.fragment_frag_listar_clientes, lista_clientes)
            lvEj2.adapter = adaptador
        }

        //boton que guarda datos cliente en arraylist
        //botón que limpia los campos edittext para registrar nuevo cliente
        btnClear.setOnClickListener {
            v.findViewById<EditText>(R.id.inRut).text.clear()
            v.findViewById<EditText>(R.id.inNombre).text.clear()
            v.findViewById<EditText>(R.id.inApellido).text.clear()
            v.findViewById<EditText>(R.id.inComuna).text.clear()
            v.findViewById<EditText>(R.id.inDireccion).text.clear()
//           Toast.makeText(this, "Ya puedes registrar otro cliente", Toast.LENGTH_SHORT).show()
        }
        return v
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

