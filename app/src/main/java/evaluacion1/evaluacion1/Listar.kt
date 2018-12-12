package evaluacion1.evaluacion1

import android.content.Context
import android.icu.text.AlphabeticIndex
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_listar.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_registro.*

class Listar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listar)

/*        //se prepara arraylist y se llena, se crea varialbe LISTA
        var lista:ArrayList<String> = ArrayList()
        lista.add("lunes")
        lista.add("miercoles")
        lista.add("jueves")

        //se crea el adaptador
        var adaptador:ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,lista)

        //ahora se le dice a LISTVIEW del xml que adaptador usar, mediante su ID
        lvEj.adapter = adaptador*/


      //  var adaptador:ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,listado)
      //  val listado : ListView = findViewById(R.id.lvEj)


//se crea el adaptador
    //    var adaptador:CustomAdapter = CustomAdapter (this,R.layout.simple_list_item_1,lista)

        //ahora se le dice a LISTVIEW del xml que adaptador usar, mediante su ID
//        lvEj.adapter = adaptador




    }



}
