package iset.com.enquete

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var chkAndro: CheckBox
    lateinit var chkMicro: CheckBox
    lateinit var btnAffich: Button
    lateinit var radSpecialityType: RadioGroup
    lateinit var radDSI: RadioButton
    lateinit var radRSI: RadioButton
    lateinit var radSEM: RadioButton

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Lier les éléments de l'interface avec les identifiants XML
        chkAndro = findViewById(R.id.chkAndroid)
        chkMicro = findViewById(R.id.chkMicrosoft)
        btnAffich = findViewById(R.id.btnAffich)
        radSpecialityType = findViewById(R.id.radioGroupSpecialiteType)
        radDSI = findViewById(R.id.radDsi)
        radRSI = findViewById(R.id.radRsi)
        radSEM = findViewById(R.id.radSem)

        btnAffich.setOnClickListener {
            var msg = "Spécialité : "
            var option = " club "

            if (chkAndro.isChecked) option += " Android"
            if (chkMicro.isChecked) option += " Microsoft"

            when (radSpecialityType.checkedRadioButtonId) {
                R.id.radDsi -> msg += "DSI"
                R.id.radRsi -> msg += "RSI"
                R.id.radSem -> msg += "SEM"
            }

            Toast.makeText(this, msg + option, Toast.LENGTH_LONG).show()
        }
    }
}
