package filho.egito.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel(){

    private var textWelcome = MutableLiveData<String>()
    private var login = MutableLiveData<Boolean>()
    private val personRepositore = PersonRepositore()

    init {
        textWelcome.value = "Olá!"
    }

    fun welcome(): LiveData<String>{
        return textWelcome
    }

    fun login():LiveData<Boolean>{
        return login
    }

    fun doLogin(email:String, password:String){
        login.value = personRepositore.login(email,password)
    }
}