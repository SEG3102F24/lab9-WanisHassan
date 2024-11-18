package seg3x02.tempconverterapi.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("temperature-converter")
class ConverterController {
    @GetMapping("/celsius-fahrenheit/{celsius}")
    fun getFahrenheit(@PathVariable celsius: Double): String {
        val fahrenheit = ((celsius * 9) / 5) + 32
        return "Converted $celsius°C to $fahrenheit°F"
    }

    @GetMapping("/fahrenheit-celsius/{fahrenheit}")
    fun getCelsius(@PathVariable fahrenheit: Double): String {
        val celsius = ((fahrenheit - 32) * 5) / 9
        return "Converted $fahrenheit°F to $celsius°C"
    }
}
