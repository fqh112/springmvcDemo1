package com.gh;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.UUID;

@Controller
public class ControllerTest {

    @RequestMapping("/show.do")
    public String show() {
        return "index.jsp";
    }

    @RequestMapping("/show1.do")
    public String show2() throws Customer {
        throw new Customer();
       // return "WEB-INF/login.jsp";
    }

    @RequestMapping("/show3.do")
    public ModelAndView show3() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("view/register.html");
        return modelAndView;
    }

    @RequestMapping("/show4.do")
    public String show4(User user, Model model) {
        model.addAttribute("as", "用户名或密码错误");
        String username = user.getUsername();
        model.addAttribute("msg", username);
        System.out.println(user);
        return "index.jsp";
    }

    @RequestMapping("/show5.do")
    public void show5(@RequestParam("hobby") String[] ss) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("sa", "asd");
        for (int i = 0; i < ss.length; i++) {
            System.out.println(ss[i]);
        }
    }

    @RequestMapping("/show6.do")
    public void show6() throws Customer {
        Customer customer = new Customer("这是我自己的异常");
        throw customer;
    }

    @RequestMapping("/show7.do")
    public void show7() {
        int a = 10 / 0;
    }

    @RequestMapping("/show8.do")
    public void show8() {
        int[] arr = new int[2];
        arr[5] = 10;
    }

    @RequestMapping("/update.do")
    public void update(MultipartFile[] file) throws IOException {
        for (MultipartFile multipartFile : file) {
            String filename = multipartFile.getOriginalFilename();
            int index = filename.lastIndexOf(".");
            String newName = filename.substring(index);
            String newFileName = UUID.randomUUID() + newName;
            File file1 = new File("E:\\fileupload\\", newFileName);
            multipartFile.transferTo(file1);
        }
    }
}
