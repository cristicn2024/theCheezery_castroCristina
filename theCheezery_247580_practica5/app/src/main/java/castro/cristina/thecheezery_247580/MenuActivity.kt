package castro.cristina.thecheezery_247580

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        fun abrirProductos(categoria: String) {
            val intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("categoria", categoria)
            startActivity(intent)
        }

        findViewById<Button>(R.id.button_coldDrinks).setOnClickListener {
            abrirProductos("coldDrinks")
        }

        findViewById<Button>(R.id.button_hotDrinks).setOnClickListener {
            abrirProductos("hotDrinks")
        }

        findViewById<Button>(R.id.button_sweets).setOnClickListener {
            abrirProductos("sweets")
        }

        findViewById<Button>(R.id.button_salties).setOnClickListener {
            abrirProductos("salties")
        }
    }
}