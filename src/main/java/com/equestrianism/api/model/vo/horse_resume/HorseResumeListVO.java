package com.equestrianism.api.model.vo.horse_resume;

import com.equestrianism.api.core.model.BasePageViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by Chenzq on 2018/3/18.
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class HorseResumeListVO extends BasePageViewModel {

    private String horseName;

}
