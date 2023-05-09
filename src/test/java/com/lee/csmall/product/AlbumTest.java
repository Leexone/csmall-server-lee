package com.lee.csmall.product;

import com.lee.csmall.product.pojo.entity.Album;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

/**
 * @author lee
 * 我亦无他,唯手熟尔
 */
public class AlbumTest {

    @Test
    void albumTest() {
        Album album = new Album();
        album.setSort(6);
        album.setDescription("owo");
        album.setGmtCreate(LocalDateTime.now());
        System.out.println(album.getGmtCreate());
        System.out.println(album.getGmtModified());
        System.out.println(album);
    }
}
