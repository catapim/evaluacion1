package evaluacion1.evaluacion1

import android.content.Context
import android.os.Bundle
import android.support.constraint.R.id.parent
import android.support.v4.app.FragmentManager
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import kotlinx.android.synthetic.main.activity_registro.*
import kotlinx.android.synthetic.main.activity_registro.view.*

class Registro : AppCompatActivity() {


    var recyclerView: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

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

            var cliente: Cliente = Cliente(nombre, apellido, rut, comuna, direccion)
            lista_clientes.add(cliente)
            //Toast.makeText(this, "hola "+cliente.nombre+" "+cliente.apellido, Toast.LENGTH_SHORT).show()
            Toast.makeText(this, "Cliente registrado exitosamente", Toast.LENGTH_SHORT).show()

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

        //var miContexto:Context


        /*class CustomAdapter (var miContexto:Context,
                            // var miRecurso:Int,
                             var miLista:ArrayList<Cliente>)
                            :ArrayAdapter<Cliente>(miContexto,miRecurso,miLista){

            override fun getView(position: Int,
                                 convertView: View?,
                                 parent: ViewGroup?): View {
                val item : View = LayoutInflater.from(miContexto).inflate(miRecurso, null)
                val cliente:Cliente = miLista[position]
               // return super.getView(position,convertView, parent)
                return item
            }
        }*/

    }

    /*class CustomAdapter(
        val miContexto: Context,
        val miLista: ArrayList<Cliente>
    ) : RecyclerView.Adapter<CustomAdapter.CustomViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup,viewType:Int): CustomViewHolder {
            val v:View = LayoutInflater.from(miContexto).inflate(R.layout.activity_listar,parent,false)
            return CustomViewHolder(v)
        }

        override fun getItemCount(): Int {
            return miLista.size
        }

        override fun onBindViewHolder(holder:CustomViewHolder, position: Int) {
            holder.bindata(miLista[position])
        }

        class CustomViewHolder (val miVista:View):RecyclerView.ViewHolder(miVista){
            fun bindata(cliente: Cliente) {
                miVista.inNombre.text = cliente.nombre
            }
        }
    }*/
}




