package com.equestrianism.api.core.utils;

/**
 * Created by Chenzq on 2018/1/21.
 */
public class PageUtils {

    public static Integer calculateTotalPages( Integer totalRecorders, Integer pageRecorders ) {
        if ( totalRecorders <= 0 || pageRecorders <= 0  ) {
            return 0;
        }
        if ( totalRecorders % pageRecorders == 0 ) {
            return totalRecorders / pageRecorders;
        }
        return totalRecorders / pageRecorders + 1;
    }

    public static void main( String[] args ) {
        System.out.println( 4 / 3 );
        System.out.println( calculateTotalPages( 13, 10 ) );
    }

}
