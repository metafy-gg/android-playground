package gg.metafy.playground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration

class MainActivity : AppCompatActivity() {

    private val navHost by lazy {
        supportFragmentManager.findFragmentById(R.id.nav_container) as NavHostFragment
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        with(navHost.navController) {
            val appBarConfiguration = AppBarConfiguration(this.graph)
            //toolbar.setupWithNavController(this, appBarConfiguration) todo: synthetics import are deprecated, set up the toolbar
        }
    }
}
