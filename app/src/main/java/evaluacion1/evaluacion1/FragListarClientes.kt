package evaluacion1.evaluacion1

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.support.v7.widget.LinearLayoutManager
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_frag_listar_clientes.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [FragListar.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [FragListar.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class FragListarClientes (): Fragment() {

    var lista_clientes = ArrayList<Cliente>()

    var miContexto: Context? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view = inflater.inflate(R.layout.fragment_frag_listar_clientes, container, false)
        var lvEj2 : ListView = view.findViewById<ListView>(R.id.lvEj)



        return view


    }
}
