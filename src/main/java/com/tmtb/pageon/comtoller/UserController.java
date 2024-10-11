package com.tmtb.pageon.comtoller;


import com.tmtb.pageon.mapper.UserMapper;
import com.tmtb.pageon.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Slf4j
@Controller
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/users")
    public String getUsers(Model model) {
        List<User> users = userMapper.findAll();
        model.addAttribute("users", users);
        log.info("users실행");
        return "users"; // JSP 파일 이름 (users.jsp)
    }
}
