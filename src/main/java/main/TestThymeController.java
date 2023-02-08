package main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;

@Controller
public class TestThymeController {
    @GetMapping("/tst")
    public String tst(Model model) {
        ArrayList<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);
        ints.add(6);
        ints.add(7);
        model.addAttribute("serverTime", ints.get(1));
        model.addAttribute("nums", ints);
        return "test";
    }
}