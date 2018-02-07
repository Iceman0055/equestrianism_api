package com.equestrianism.api.core.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by Chenzq on 2018/1/21.
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class BasePageViewModel extends BaseViewModel {

    private Integer pageIndex;
    private Integer pageRecorders;
    private Integer beginIndex;

    public BasePageViewModel() {
//        this.pageIndex = 1;
//        this.pageRecorders = 10;
//        this.beginIndex = 0;
    }

    public BasePageViewModel( Integer pageIndex, Integer pageRecorders ) {
        this.pageIndex = pageIndex;
        this.pageRecorders = pageRecorders;
        this.beginIndex = calculateBeginIndex( pageIndex, pageRecorders );
    }

    public BasePageViewModel( Integer pageIndex, Integer pageRecorders, Integer beginIndex ) {
        this.pageIndex = pageIndex;
        this.pageRecorders = pageRecorders;
        this.beginIndex = calculateBeginIndex( pageIndex, pageRecorders );
    }

    public Integer getPageRecorders() {
        return pageRecorders;
    }

    public void setPageRecorders(Integer pageRecorders) {
        this.pageRecorders = pageRecorders;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getBeginIndex() {
        return beginIndex;
    }

    public void setBeginIndex(Integer beginIndex) {
        this.beginIndex = beginIndex;
    }

    public Integer calculateBeginIndex( Integer pageIndex, Integer pageRecorders ) {
        if ( pageIndex == null || pageIndex == 0 ) {
            pageIndex = 1;
        }
        if ( pageRecorders == null || pageRecorders == 0 ) {
            pageRecorders = 10;
        }
        return ( pageIndex - 1 ) * 10;
    }

    public void calculateBeginIndex() {
        if ( pageIndex == null || pageIndex == 0 ) {
            pageIndex = 1;
        }
        if ( pageRecorders == null || pageRecorders == 0 ) {
            pageRecorders = 10;
        }
        this.beginIndex = ( pageIndex - 1 ) * pageRecorders;
    }

}
