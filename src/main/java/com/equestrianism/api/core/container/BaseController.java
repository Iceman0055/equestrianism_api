package com.equestrianism.api.core.container;

import com.equestrianism.api.core.model.BaseViewModel;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Chenzq on 2018/1/15.
 */
public class BaseController {

    @ModelAttribute
    public BaseViewModel buildRequest( HttpServletRequest request ) {

        BaseViewModel viewModel = new BaseViewModel();
        String sessionId = request.getHeader( "sessionId" );

        return viewModel;

    }

}
