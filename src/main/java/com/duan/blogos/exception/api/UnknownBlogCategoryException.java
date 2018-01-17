package com.duan.blogos.exception.api;

import com.duan.blogos.exception.BaseRuntimeException;

/**
 * Created on 2017/12/20.
 * 未知博文类别
 *
 * @author DuanJiaNing
 */
public class UnknownBlogCategoryException extends BaseRuntimeException {

    private static final int code = 7;

    public UnknownBlogCategoryException(String message) {
        super(message,code);
    }

    public UnknownBlogCategoryException() {
        super(code);
    }
}
