package com.joker.controller;

import com.joker.pojo.Books;
import com.joker.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    //controller层调service层

    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //查询所有的书籍，并返回一个书籍展示页面
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> booksList = bookService.queryAllBook();
        model.addAttribute("list",booksList);
        return "allBook";
    }

    //跳转到增加书籍页面
    @RequestMapping("/toAddBook")
    public String toAddBook(){
        return "addBook";
    }

    //添加书籍的请求
    @RequestMapping("/addBook")
    public String addBook(Books books){
        bookService.addBook(books);
        return "redirect:/book/allBook";   //重定向到我们的@requestMapping("/allBook")请求
    }

    //跳转到修改书籍页面
    @RequestMapping("/toUpdate")
    public String toUpdateBook(int id,Model model){
        Books books = bookService.queryBookById(id);
        model.addAttribute("books",books);
        return "updateBook";

    }

    //修改书籍
    @RequestMapping("/updateBook")
    public String updateBook(Books books) {
         bookService.updateBook(books);
        return "redirect:/book/allBook";
    }

    //删除数据
    @RequestMapping("/deleteBook/{bookId}")
    public String delete(@PathVariable("bookId") int id){           //@pathVariable  resetful风格   表示要从前端获取的参数名
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

    //查询一本书
    @RequestMapping("/queryABook")
    public String queryBook(String queryBookName,Model model){
        List<Books> booksList = bookService.queryBookName(queryBookName);
        model.addAttribute("list",booksList);
        return "allBook";
    }
}
