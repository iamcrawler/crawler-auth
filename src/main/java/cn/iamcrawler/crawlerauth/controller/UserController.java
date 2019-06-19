package cn.iamcrawler.crawlerauth.controller;

import cn.iamcrawler.crawlerauth.service.GoddessUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by liuliang
 * on 2019/6/18
 */
@RestController
public class UserController {

    @Autowired
    private GoddessUserService userService;

    @RequestMapping("/user")
    public Principal principalUser(Principal principal) {
        return principal;
    }


    @GetMapping("/update/password")
    public ResponseEntity updatePassword(@RequestParam String userName){
        return ResponseEntity.ok(userService.updatePassword(userName));
    }
}
