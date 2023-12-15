package com.example.bogotapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bogotapp.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recycler.adapter = SitiosAdapter(
            listOf(
                Sitio("Plaza de Bolivar", "plazabolivar","La plaza de Bolívar es la plaza principal de la ciudad de Bogotá y de Colombia. Está ubicada en el centro histórico de la ciudad, entre las carreras Séptima y Octava con calles Décima y Once. A su alrededor se encuentran algunos de los principales edificios de la ciudad: al norte el Palacio de Justicia, al sur el Capitolio Nacional, al oriente la Catedral Basílica Metropolitana de Bogotá y Primada de Colombia, la Casa del Cabildo Eclesiástico, la Capilla del Sagrario de Catedral Basílica Metropolitana."),
                Sitio("Museo del Oro", "museo_oro","El Museo del Oro del Banco de la República de Colombia es una institución pública que adquiere, conserva y expone piezas de orfebrería y alfarería de culturas indígenas del periodo precolombino de la actual Colombia.  Cuenta con más de 30 000 piezas hechas en oro, 20 000 de objetos líticos, cerámicos, piedras y textiles pertenecientes a las culturas Quimbaya, Calima, Tairona, Zenú, Muisca, Tolima, Tumaco entre otros. El museo es un símbolo de identidad de los colombianos y es uno de los lugares que los bogotanos."),
                Sitio("Jardin Botánico", "jardinb", "El Jardín Botánico de Bogotá, nombrado oficialmente Jardín Botánico José Celestino Mutis en honor al astrónomo y botánico José Celestino Mutis, es un centro de investigación, conservación y divulgación de la diversidad de las especies vegetales en Bogotá, capital de Colombia. Fundado en 1955 por el sacerdote Enrique Pérez Arbeláez. En mayo de 2022 el Gobierno nacional, a través del Ministerio de Ciencia, Tecnología e Innovación, concedió el reconocimiento como Centro de Investigación al Jardín Botánico José Celestino Mutiz."),
                Sitio("Museo Nacional", "museo_nal", "El Museo Nacional de Colombia fue creado en 1823 y es uno de los más antiguos de América. Ofrece a sus visitantes diecisiete salas de exposición permanente, en las cuales se exhiben alrededor de 2.500 obras y objetos, símbolos de la historia y el patrimonio nacional. Las colecciones incluyen arte, historia, arqueología y etnografía. Además, el museo ofrece exposiciones temporales que permiten a los colombianos estar en contacto con importantes muestras de historia, arte y arqueología nacionales e internacionales"),
            )
        )
    }
}