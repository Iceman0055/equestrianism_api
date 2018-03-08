package com.equestrianism.api.utils;

/**
 * Iceman
 * 2018/3/8
 */
public class TestJava {

    public final static String TIME_LIST = "01:21:05;00:08:28;00:03:38;00:58:12;13:42:39;00:08:26;00:37:05;01:03:34;00:20:30;01:14:37;00:00:30;00:18:45;14:29:25;01:42:27;00:11:12;00:05:26;00:15:02;00:37:49;00:32:24;00:25:30;00:14:14;00:04:56;00:03:52;01:32:41;00:04:50;00:23:50;00:40:26;00:15:20;00:29:45;00:07:45;01:15:11;00:00:38;10:15:39;00:21:08;01:35:00;00:03:32;00:37:05;00:43:15;00:22:47;00:03:51;00:01:31;00:01:34;00:09:07;00:06:17;00:43:15;00:15:02;00:09:33;00:03:57;00:03:06;00:10:10;00:20:46;00:03:15;00:01:10;00:22:26;00:02:56;15:28:41;14:31:32";

    public static void main( String[] args ) {
        String[] tempTimeList = TIME_LIST.split( ";" );
        Integer totalSec = 0;
        for ( String time : tempTimeList ) {
            String[] times = time.split( ":" );
            Integer hour = Integer.parseInt( times[0] );
            Integer min = Integer.parseInt( times[1] );
            Integer sec = Integer.parseInt( times[2] );
            if ( hour != 0 ) {
                totalSec += hour * 3600;
            }
            if ( min != 0 ) {
                totalSec += min * 60;
            }
            totalSec += sec;
        }
        System.out.println( totalSec );
//        System.out.println( totalSec / 2 );
        System.out.println( secondToTime( totalSec / tempTimeList.length ) );

    }

    public static String secondToTime(long second){
        long days = second / 86400;            //转换天数
        second = second % 86400;            //剩余秒数
        long hours = second / 3600;            //转换小时
        second = second % 3600;                //剩余秒数
        long minutes = second /60;            //转换分钟
        second = second % 60;                //剩余秒数
        if(days>0){
            return days + "天" + hours + "小时" + minutes + "分" + second + "秒";
        }else{
            return hours + "小时" + minutes + "分" + second + "秒";
        }
    }

}
