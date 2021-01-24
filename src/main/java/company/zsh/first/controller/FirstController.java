package company.zsh.first.controller;


import org.springframework.web.bind.annotation.*;

// 能够使 Spring Context 发现该类(作为 Spring Bean)
@RestController
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/echo/{v1}")
    public String firstApi(@PathVariable("v1") String v1, @RequestParam("v2") String v2) {
        return "zhouzhou"+v1+"="+v2;
    }
}
