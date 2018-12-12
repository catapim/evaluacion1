package evaluacion1.evaluacion1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class ClienteAdapter(var miContexto: Context,
                     var listaClientes:ArrayList<Cliente>,
                     var listaServicios:ArrayList<ServicioActivity>) {

}


                  /*      override fun getView(position: Int, converView: View?, parent: ViewGroup?): View {
                            val item: View = LayoutInflater.from(miContexto).inflate(null)
                            val nombre: TextView = item.findViewById(R.id.inNombre)
                            val apellido: TextView = item.findViewById(R.id.inApellido)
                            val persona:Cliente=miLista[position]
                            nombre.text =persona.nombre
                            apellido.text=persona.apellido
                            return item
                        }*/

