package com.lee.csmall.product.controller;

import com.baomidou.mybatisplus.extension.api.R;
import com.lee.csmall.product.ex.ServiceException;
import com.lee.csmall.product.pojo.param.AlbumAddNewParam;
import com.lee.csmall.product.service.IAlbumService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lee
 * 我亦无他,唯手熟尔
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/album/")
public class AlbumController {

    private final IAlbumService iAlbumService;


    /**
     * resolve addAlbum*/
    @RequestMapping("addAlbum")
    public String addAlbum(AlbumAddNewParam albumAddNewParam) {
        try {
            iAlbumService.addNew(albumAddNewParam);
        } catch (ServiceException e) {
            e.printStackTrace();
            return e.getMessage();
        } catch (RuntimeException e) {
            return "RuntimeException";
        }

    return "owo";
    }
}
