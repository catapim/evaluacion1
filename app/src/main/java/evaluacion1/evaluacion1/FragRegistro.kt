package evaluacion1.evaluacion1

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import kotlinx.android.synthetic.main.fragment_frag_listar.*
import kotlinx.android.synthetic.main.fragment_frag_registro.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [FragRegistro.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [FragRegistro.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class FragRegistro : Fragment() {

    var miContexto : Context? = null


    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var listener: OnFragmentInteractionListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)

            var lista_clientes = arrayListOf<Cliente>()


            //boton que guarda datos cliente en arraylist
            btnGuardar.setOnClickListener {
                var nombre: String = inNombre.text.toString()
                var apellido: String = inApellido.text.toString()
                var rut: String = inRut.text.toString()
                var comuna: String = inComuna.text.toString()
                var direccion: String = inDireccion.text.toString()

                var cliente = Cliente(nombre, apellido, rut, comuna, direccion)
                lista_clientes.add(cliente)

                //Toast.makeText(this, "Cliente registrado exitosamente", Toast.LENGTH_SHORT).show()

                val adaptador = CustomAdapter(this@FragRegistro, R.layout.layout_lista_clientes, lista_clientes)
                lvEj.adapter = adaptador
            }

            //botón que limpia los campos edittext para registrar nuevo cliente
            btnOtro.setOnClickListener {
                inRut.text.clear()
                inNombre.text.clear()
                inApellido.text.clear()
                inComuna.text.clear()
                inDireccion.text.clear()
                //      Toast.makeText(this, "Ya puedes registrar otro cliente", Toast.LENGTH_SHORT).show()
            }

            btnListar.setOnClickListener {
                val fm = supportFragmentManager
                val ft = fm.beginTransaction()
                val frag = FragListar()
                frag.miContexto = this
                ft.replace(R.id.layRegistro,frag)
                ft.commit()
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

            // Inflate the layout for this fragment
            var view = inflater.inflate(R.layout.fragment_frag_listar,container, false)
            return view

    }

    class CustomAdapter(
        var miContexto: FragRegistro,
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

    // TODO: Rename method, update argument and hook method into UI event
    fun onButtonPressed(uri: Uri) {
        listener?.onFragmentInteraction(uri)
    }

/*    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
        }
    }*/

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     *
     *
     * See the Android Training lesson [Communicating with Other Fragments]
     * (http://developer.android.com/training/basics/fragments/communicating.html)
     * for more information.
     */
    interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        fun onFragmentInteraction(uri: Uri)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FragRegistro.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FragRegistro().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}

