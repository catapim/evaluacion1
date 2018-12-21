package evaluacion1.evaluacion1

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class UserModel : ViewModel() {

    private lateinit var arraycliente : ArrayList<Cliente>

    fun getUsers() : ArrayList<Cliente>{
        return arraycliente
    }

    fun addUser(aceptaCliente : Cliente){
        arraycliente.add(Cliente("hola", "ola", "111", "cpmuna", "lala"))
        for (i in arraycliente) {
            System.out.println(i)
        }

    }

}