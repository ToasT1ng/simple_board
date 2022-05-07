package org.example.notice_board.controller;

import lombok.RequiredArgsConstructor;
import org.example.notice_board.dto.CategoryDto;
import org.example.notice_board.service.CategoryService;
import org.example.notice_board.vo.CategoryVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService service;

    @GetMapping("/category")
    public @ResponseBody List<CategoryDto> getCategories() {
        return service.getCategories();
    }

    @GetMapping("/category/{categoryId}")
    public @ResponseBody CategoryDto getCategory(@PathVariable long categoryId) {
        CategoryDto category = service.getCategory(categoryId);
        System.out.println(category.toString());
        return category;
    }

    @PostMapping(value = "/category")
    public @ResponseBody Long setCategory(@RequestBody CategoryVO vo) {
        return service.setCategory(vo);
    }

    @PutMapping(value = "/category/{categoryId}")
    public @ResponseBody Long updateCategory(@PathVariable long categoryId, @RequestBody CategoryVO vo) {
        return service.updateCategory(categoryId, vo);
    }

    @DeleteMapping(value = "/category/{categoryId}")
    public @ResponseBody Long deleteCategory(@PathVariable long categoryId) {
        return service.deleteCategory(categoryId);
    }
}
