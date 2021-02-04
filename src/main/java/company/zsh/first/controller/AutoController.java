package company.zsh.first.controller;

import company.zsh.first.model.auto.TPerson;
import company.zsh.first.service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @author zhousuhua
 * @date 3/2/21 下午7:47
 */

@RestController
@RequestMapping("/auto")
public class AutoController {

    @Autowired
    AutoService autoService;

    @GetMapping
    public ResponseEntity<List<TPerson>> getAutoPersons(@RequestParam("page") Integer page, @RequestParam("pageSize") Integer pageSize) {

        return ResponseEntity.ok(autoService.getPersonInPage(page, pageSize));
    }
}
