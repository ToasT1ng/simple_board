package org.example.notice_board.controller;

import lombok.RequiredArgsConstructor;
import org.example.notice_board.dto.UserDto;
import org.example.notice_board.service.UserService;
import org.example.notice_board.vo.UserVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @GetMapping("/user")
    public @ResponseBody List<UserDto> getBoards() {
        return service.getUsers();
    }

    @GetMapping("/user/{userId}")
    public @ResponseBody UserDto getUser(@PathVariable long userId) {
        UserDto user = service.getUser(userId);
        System.out.println(user.toString());
        return user;
    }

    @PostMapping(value = "/user")
    public @ResponseBody Long setUser(@RequestBody UserVO vo) {
        return service.setUser(vo);
    }

    @PutMapping(value = "/user/{userId}")
    public @ResponseBody Long updateUser(@PathVariable long userId, @RequestBody UserVO vo) {
        return service.updateUser(userId, vo);
    }

    @DeleteMapping(value = "/user/{userId}")
    public @ResponseBody Long deleteUser(@PathVariable long userId) {
        return service.deleteUser(userId);
    }
}
