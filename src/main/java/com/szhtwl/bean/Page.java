package com.szhtwl.bean;


import java.io.Serializable;

/**
 * Created by Administrator on 2018/1/2.
 */
public class Page implements Serializable {

    private static final long serialVersionUID = 1964274098526556862L;

    /**
     * 当前页
     */
    private Integer showPage;

    /**
     * 每页记录数
     */
    private Integer rowSize;

    /**
     * 所有记录数
     */
    private Integer totalSize;

    /**
     * 所有页
     */
    private Integer totalPage;

    public Page() {
    }

    public Integer getShowPage() {
        return showPage;
    }

    public Integer getRowSize() {
        return rowSize;
    }

    public Integer getTotalSize() {
        return totalSize;
    }


    public Integer getTotalPage() {
        return totalPage;
    }

    public Integer currentSize(Integer showPage,Integer rowSize,Integer totalSize){
        this.totalSize = totalSize;
        this.rowSize = (rowSize==null)?null:(rowSize<=0)?6:(rowSize>totalSize)?totalSize:rowSize;
        if(rowSize==null || showPage == null){
            return null;
        }
        this.totalPage = totalSize%rowSize ==0?totalSize/rowSize:totalSize/rowSize+1;
        this.showPage = (showPage==null)?null:(showPage<=0)?1:(showPage>totalPage)?totalPage:showPage;
        return (showPage-1)*rowSize;
    }
}
