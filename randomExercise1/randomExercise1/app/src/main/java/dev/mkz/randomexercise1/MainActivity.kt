package dev.mkz.randomexercise1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.graphics.toColorInt
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        green.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                textBox.setTextColor("#00ff00".toColorInt())
                textBox.setText("Hello Minhoo")
            }
        }

        red.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                textBox.setTextColor("#ff0000".toColorInt())
            }
        }

        blue.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                textBox.setTextColor("#0000ff".toColorInt())
            }
        }

        trigger.setOnClickListener { obj ->
            val popup = PopupMenu(applicationContext,trigger)
            popup.menuInflater.inflate(R.menu.popupmenu_tasarim,popup.menu)
            popup.setOnMenuItemClickListener { i ->
                when (i.itemId) {
                    R.id.mustafa -> {
                        Toast.makeText(applicationContext,"Mustafa",Toast.LENGTH_LONG).show()
                    }
                    R.id.minho -> {
                        val tasarim = layoutInflater.inflate(R.layout.alert_dialog_tasarim, null)
                        val textBoxAlert = tasarim.findViewById<EditText>(R.id.name)
                        val al = AlertDialog.Builder(this)
                        al.setTitle("Minho")
                        al.setIcon(android.R.drawable.ic_delete)
                        al.setView(tasarim)
                        al.setPositiveButton("Yeap!") { _,_ ->
                            Toast.makeText(this,textBoxAlert.text.toString(),Toast.LENGTH_LONG).show()
                        }
                        al.show()
                    }
                    R.id.victor -> {
                        Snackbar.make(obj,"Victor",Snackbar.LENGTH_LONG)
                            .setAction("Yes"){
                                Snackbar.make(obj,"Done !" , Snackbar.LENGTH_LONG).show()
                            }
                            .show()
                    }
                }
                true
            }
            popup.show()
        }
    }
}