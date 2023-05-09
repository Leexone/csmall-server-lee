package com.lee.csmall.product.service;

import com.lee.csmall.product.pojo.param.AlbumAddNewParam;

/**
 * @author lee
 * 我亦无他,唯手熟尔
 *  AlbumService stipulate service of Album
 */
public interface IAlbumService {

    /**
     * add album
     * */
    void addNew(AlbumAddNewParam albumAddNewParam);

}
