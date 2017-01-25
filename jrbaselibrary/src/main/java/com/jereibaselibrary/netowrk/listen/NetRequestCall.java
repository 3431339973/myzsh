package com.jereibaselibrary.netowrk.listen;


import com.jereibaselibrary.tools.JRDataResult;

/**
 * Created by zhush on 2016/9/21.
 * E-mail zhush@jerei.com
 * 网络请求回调
 */
public interface NetRequestCall <T>{
    /**
     * 成功
     * @param dataResult
     */
    public void success(T dataResult);

    /**
     *失败
     * @param message
     */
    public void failed(String message,int errorCode);


}
