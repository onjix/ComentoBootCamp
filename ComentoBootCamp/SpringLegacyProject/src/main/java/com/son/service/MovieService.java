package com.son.service;

import java.util.List;
import com.son.vo.MovieVO;
 
public interface MovieService {
    public List<MovieVO> selectMovie() throws Exception;
}