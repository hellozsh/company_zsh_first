package company.zsh.first.controller;


import company.zsh.first.model.Item;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

// 能够使 Spring Context 发现该类(作为 Spring Bean)
@RestController
@RequestMapping("/first")
public class FirstController {

    // http://127.0.0.1:8080/first/echo/me_id?v2=zhouv2
    @GetMapping("/echo/{v1}")
    public String firstApi(@PathVariable("v1") String v1, @RequestParam("v2") String v2) {
        return "zhouzhou"+v1+"="+v2;
    }

    // http://127.0.0.1:8080/first/add_item
    // header 加 {me_id : "me_id_value"}
    // body为raw，JSON， 内容:
    // {
    //    "index": 1,
    //    "name": "daqiang"
    //}
    @PostMapping("/add_item")
    public ResponseEntity<Item> secondApi(@RequestHeader("me_id") String meId, @RequestBody Item item) {
        System.out.println("周素华======"+meId);
        if (!meId.equals("zhouzhoume_id")) {
            return ResponseEntity.badRequest().body(new Item());
        }
        return ResponseEntity.ok(item);
    }

    // http://127.0.0.1:8080/first/delete_item/me_id?index=1&name=2
    @DeleteMapping("/delete_item/{me_id}")
    public String thirdApi(@PathVariable("me_id") String meId, @RequestParam("index") Integer index, @RequestParam("name") String name) {
        System.out.println("周素华======"+meId);
        return "zhouzhou"+"meId="+meId+";index="+index+";name="+name;
    }

    // 返回值的Item： Spring 会使用默认策略，将对象转换成JSON返回
    @PatchMapping("/delete_item2")
    public Item fourApi(@RequestBody Item item) {
        System.out.println("周素华======"+item.getName());
        return item;
    }


}
