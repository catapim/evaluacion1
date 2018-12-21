package evaluacion1.evaluacion1

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.*
import android.widget.ArrayAdapter
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    var lista_clientes = arrayListOf<Cliente>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val model = ViewModelProviders.of(this).get(UserModel::class.java)
//        var nombre0 = model.getUsers().get(0).nombre
  //      System.out.println(nombre0)

        val toggle = ActionBarDrawerToggle(
          this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_reg -> {
                //aqui debe cargar fragmento en main activity con el registro de personas clientes
                val fm = supportFragmentManager
                val ft = fm.beginTransaction()
                val fragmento = FragRegistroClientes()
                fragmento.miContexto = this
                ft.replace(R.id.layFragmentoMutable,fragmento)
                ft.commit()
            }

            R.id.nav_list_client -> {
                //aqui debe cargar fragmento en main activity con el registro de personas clientes
                val fm = supportFragmentManager
                val ft = fm.beginTransaction()
                val fragmento = FragListarClientes()
                fragmento.miContexto = this
                ft.replace(R.id.layFragmentoMutable,fragmento)
                ft.commit()

            }

            R.id.nav_reg_serv -> {
                //aqui debe cargar fragmento en main activity con el registro de
                // servicios. los servicios se registrarán por persona

                val fm = supportFragmentManager
                val ft = fm.beginTransaction()
                val fragmento =FragRegistroServicios()
                fragmento.miContexto = this
                ft.replace(R.id.layFragmentoMutable,fragmento)
                ft.commit()
            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

}