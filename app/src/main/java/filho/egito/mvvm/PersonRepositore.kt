package filho.egito.mvvm

import com.google.firebase.auth.FirebaseAuth
import java.lang.Exception

class PersonRepositore{
    fun login (email:String, password:String):Boolean{
        return (email != "" && password != "")
    }


}




