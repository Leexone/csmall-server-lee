package com.lee.csmall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lee.csmall.product.dao.mapper.AlbumMapper;
import com.lee.csmall.product.ex.ServiceException;
import com.lee.csmall.product.pojo.entity.Album;
import com.lee.csmall.product.pojo.param.AlbumAddNewParam;
import com.lee.csmall.product.service.IAlbumService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * @author lee
 * 我亦无他,唯手熟尔
 * this class implements IAlbumService
 * handle alblum services
 */
@Service
public class AlbumServiceImpl implements IAlbumService {
    final AlbumMapper albumMapper;

    public AlbumServiceImpl(AlbumMapper albumMapper) {
        this.albumMapper = albumMapper;
    }


    /**
     * add new album*/
    @Override
    public void addNew(AlbumAddNewParam albumAddNewParam) {
        QueryWrapper<Album> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name", albumAddNewParam.getName());

        int countByName = albumMapper.selectCount(queryWrapper);
        if (countByName > 0) {
            throw  new ServiceException("album name exist");
        }

        Album album = new Album();
        BeanUtils.copyProperties(albumAddNewParam, album);
        album.setGmtCreate(LocalDateTime.now());
        album.setGmtModified(LocalDateTime.now());
        albumMapper.insert(album);
        System.out.println("add success");
    }
}
