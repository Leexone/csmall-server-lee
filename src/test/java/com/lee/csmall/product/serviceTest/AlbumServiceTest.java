package com.lee.csmall.product.serviceTest;

import com.lee.csmall.product.ex.ServiceException;
import com.lee.csmall.product.pojo.param.AlbumAddNewParam;
import com.lee.csmall.product.service.IAlbumService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author lee
 * 我亦无他,唯手熟尔
 */
@SpringBootTest
public class AlbumServiceTest {

    @Autowired
    IAlbumService iAlbumService;

    @Test
    void addNew() {
        AlbumAddNewParam albumAddNewParam = new AlbumAddNewParam();
        albumAddNewParam.setDescription("test001 description");
        albumAddNewParam.setName("test001 name");
        albumAddNewParam.setSort(101);
        try {
            iAlbumService.addNew(albumAddNewParam);
        }catch (ServiceException e) {
            e.printStackTrace();
        }
    }
}
