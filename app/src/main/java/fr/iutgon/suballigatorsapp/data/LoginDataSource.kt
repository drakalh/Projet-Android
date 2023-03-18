package fr.iutgon.suballigatorsapp.data

import android.content.Context
import android.net.ConnectivityManager
import androidx.core.content.ContextCompat.getSystemService
import fr.iutgon.suballigatorsapp.MainActivity

import fr.iutgon.suballigatorsapp.data.model.LoggedInUser
import java.io.IOException
import java.io.InputStream
import java.net.URL

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
class LoginDataSource(val appContext: Context) {

    fun login(username: String, password: String): Result<LoggedInUser> {
        try {
            val mgr = getSystemService(appContext, ConnectivityManager::class.java)
            val net = mgr!!.activeNetwork

            val conn = net!!.openConnection(URL("dev-"))

            val flow = conn.getInputStream()

            return Result.Error(IOException("Error logging in", Throwable()))
        } catch (e: Throwable) {
            return Result.Error(IOException("Error logging in", e))
        }
    }

    fun logout() {
        // TODO: revoke authentication
    }
}