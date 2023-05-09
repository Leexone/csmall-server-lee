package com.lee.csmall.product.album;

import com.lee.csmall.product.dao.mapper.AlbumMapper;
import com.lee.csmall.product.pojo.entity.Album;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

/**
 * @author lee
 * 我亦无他,唯手熟尔
 */
@SpringBootTest
public class AlbumTest {

    @Autowired
    AlbumMapper albumMapper;
    @Test
    void insert() {
        Album album = new Album();
        System.out.println(album.getId());
        album.setGmtCreate(LocalDateTime.now());
        albumMapper.insert(album);
        System.out.println(album.getId());
    }

    @Test
    void selectByID() {
        Album album = albumMapper.selectById(5L);
        System.out.println(album);
    }

    @Test
    void t0() {
        Album album = new Album();
        album.setId(4L);
        album.setDescription("owo");
        albumMapper.updateById(album);
    }


}
