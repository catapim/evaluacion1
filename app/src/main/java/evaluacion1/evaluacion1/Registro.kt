package evaluacion1.evaluacion1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.support.v7.widget.RecyclerView
import android.text.Layout
import android.widget.*
import evaluacion1.evaluacion1.R.id.*
import kotlinx.android.synthetic.main.activity_registro.*

class Registro : AppCompatActivity() {


    var recyclerView:RecyclerView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        recyclerView = findViewById(R.id.rvEj)
     //   var vista: View = LayoutInflater.from(contexto).inflate(recurso, null)
        var lista_clientes=arrayListOf<Cliente>();
        var buttonGuardar = findViewById<Button>(R.id.btnGuardar)
        buttonGuardar.setOnClickListener {
            var rutTextBox:EditText = findViewById<EditText>(R.id.inRut)
            System.out.println(rutTextBox.text);
            var nombre:String = findViewById<EditText>(R.id.inNombre).text.toString();
            var apellido:String = findViewById<EditText>(R.id.inApellido).text.toString()
            var cliente:Cliente = Cliente(nombre,apellido)
            lista_clientes.add(cliente);
            Toast.makeText(this, "hola "+cliente.nombre+" "+cliente.apellido, Toast.LENGTH_SHORT).show()


        }

    }


}
