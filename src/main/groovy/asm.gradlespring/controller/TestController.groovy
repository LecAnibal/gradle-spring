package asm.gradlespring.controller

import groovy.util.logging.Slf4j
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam

/**
 * Created by lecanibal on 21/01/16.
 */
@Controller
@Slf4j
class TestController {

    @RequestMapping(value ='/info',method = RequestMethod.GET)
    public String competitionInfo(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("result",name)
        "info"
    }
}
