package evaluacion1.evaluacion1

import android.arch.lifecycle.ViewModelStore
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_registro.*

class Registro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        //guardando inputs de Registro.kt
        var getRut = inRut.text.toString()
        var getNombre = inNombre.text.toString()
        var getApellido = inApellido.text.toString()
        var getComuna = inComuna.text.toString()
        var getDireccion = inDireccion.text.toString()

        var buttonGuardar = btnGuardar.setOnClickListener{
            var rutIntento = Intent(this,Listar::class.java)
            rutIntento.putExtra("msgRut",getRut)
        }

        //haciendo los intents
        var inNom  = Intent(this,Listar::class.java)
        inNom.putExtra("msgNom",getRut)
        var inApe = Intent(this,Listar::class.java)
        inApe.putExtra("msgApe",getApellido)

        var inComu= Intent(this,Listar::class.java)
        inComu.putExtra("msgComu",getComuna)

        var inDire= Intent(this,Listar::class.java)
        inDire.putExtra("msgDire",getDireccion)
    }
}
