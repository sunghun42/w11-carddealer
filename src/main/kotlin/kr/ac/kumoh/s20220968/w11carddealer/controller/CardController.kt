package kr.ac.kumoh.s20220968.w11carddealer.controller

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class CardController {
    @GetMapping("/cards/random")
    fun getCardsRandom(model: Model): String {
        model.addAttribute("card", "ace_of_spades.png")
        return "cards"
    }
}