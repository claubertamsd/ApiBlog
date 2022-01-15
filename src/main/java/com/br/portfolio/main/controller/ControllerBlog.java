package com.br.portfolio.main.controller;

import com.br.portfolio.main.post.Post;
import com.br.portfolio.main.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

@Controller
public class ControllerBlog {
    @Autowired
    IService iService;

    @RequestMapping(value="/posts", method=RequestMethod.GET)
    public ModelAndView getPosts(){
        ModelAndView mv = new ModelAndView("posts");
        List<Post> posts = iService.findall();
        mv.addObject("posts", posts);
        return mv;
    }

    @RequestMapping(value = "/posts(id)",method = RequestMethod.GET)
    public ModelAndView getPostDetails(@PathVariable ("id") long id){
        ModelAndView mv = new ModelAndView("postDetails");
        Post post = iService.findByid(id);
        mv.addObject("postDetails",post);
        return mv;
    }

    @RequestMapping(value="/newPost", method=RequestMethod.GET)
    public String getPostForm(){
        return "postForm";
    }

    @RequestMapping(value="/newPost", method=RequestMethod.POST)
    public String savePost(@Valid Post post, BindingResult result, RedirectAttributes attributes){
        if(result.hasErrors()){
            attributes.addFlashAttribute("mensagem", "Verifique se os campos obrigatórios foram preenchidos!");
            return "redirect:/newPost";
        }
        post.setData(LocalDate.now());
        iService.save(post);
        return "redirect:/posts";
    }

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        iService.delete(id);
        return "redirect:/posts";
    }
}






