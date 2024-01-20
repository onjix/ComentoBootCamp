package com.son.dao;
import java.util.List;
import com.son.vo.MovieVO;
 
public interface MovieDAO {
    public List<MovieVO> selectMovie() throws Exception;
}