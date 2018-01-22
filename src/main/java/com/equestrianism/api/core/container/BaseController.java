package com.equestrianism.api.core.container;

import com.equestrianism.api.core.model.BaseViewModel;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Chenzq on 2018/1/15.
 */
public class BaseController {

    private static String SESSION_ID = "";
    private static String ACCESS_ID = "";

    public static String getSessionId() {
        return SESSION_ID;
    }

    public static void setSessionId( String sessionId ) {
        SESSION_ID = sessionId;
    }

    public static String getAccessId() {
        return ACCESS_ID;
    }

    public static void setAccessId( String userId ) {
        ACCESS_ID = userId;
    }

    @ModelAttribute
    public BaseViewModel buildRequest( HttpServletRequest request ) {
        BaseViewModel viewModel = new BaseViewModel();
        String sessionId = request.getHeader( "sessionId" );
        ACCESS_ID = sessionId;
        SESSION_ID = sessionId;
        viewModel.setSessionId( sessionId );
        return viewModel;
    }

}
