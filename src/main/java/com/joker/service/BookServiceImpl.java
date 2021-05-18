package com.joker.service;

import com.joker.dao.BookMapper;
import com.joker.pojo.Books;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService{
    //业务层掉dao层：组合dao
    private BookMapper bookMapper;
    public void setBookMapper(BookMapper bookMapper){
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    @Override
    public List<Books> queryBookName(String bookName) {
        if(bookName==null || bookName ==""){
            return bookMapper.queryAllBook();
        }
        return bookMapper.queryBookName(bookName);
    }
}
