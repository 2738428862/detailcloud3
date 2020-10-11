package com.yc.springcloud812.dao;

import com.yc.springcloud812.domain.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookMapper extends MisBaseMapper<Book> {
}
