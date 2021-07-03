package com.gh;

        import org.springframework.stereotype.Component;
        import org.springframework.web.servlet.HandlerExceptionResolver;
        import org.springframework.web.servlet.ModelAndView;

        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;

@Component
public class CustomExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object o, Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        String message = e.getMessage();
        if (e instanceof Customer) {
            modelAndView.addObject("msg", "我自己的异常");
        } else {
            modelAndView.addObject("msg", "服务器繁忙，请稍后再试");
        }
        System.out.println(message);
        modelAndView.setViewName("error.jsp");
        return modelAndView;
    }
}
