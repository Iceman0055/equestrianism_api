package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BaseObject;
import com.equestrianism.api.model.model.horse_resume.*;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/18.
 */
public class HorseResumeDetailBO extends BaseObject {

    private HorseInfoDetailBO horseInfo;
    private HostInfoDetailBO hostInfo;
    private FeederInfoDetailBO feederInfo;
    private List<HorseResumeTreatmentCaseModel> treatmentCaseList;
    private List<HorseResumePrizeModel> prizeList;
    private List<HorseResumeVaccinationModel> vaccinationList;
    private List<HorseResumeBrigandineModel> brigandineList;
    private List<HorseResumeContusionTeethModel> contusionTeethList;
    private List<HorseResumeTreatmentInfoModel> treatmentInfoList;

    public HorseInfoDetailBO getHorseInfo() {
        return horseInfo;
    }

    public void setHorseInfo(HorseInfoDetailBO horseInfo) {
        this.horseInfo = horseInfo;
    }

    public HostInfoDetailBO getHostInfo() {
        return hostInfo;
    }

    public void setHostInfo(HostInfoDetailBO hostInfo) {
        this.hostInfo = hostInfo;
    }

    public FeederInfoDetailBO getFeederInfo() {
        return feederInfo;
    }

    public void setFeederInfo(FeederInfoDetailBO feederInfo) {
        this.feederInfo = feederInfo;
    }

    public List<HorseResumeTreatmentCaseModel> getTreatmentCaseList() {
        return treatmentCaseList;
    }

    public void setTreatmentCaseList(List<HorseResumeTreatmentCaseModel> treatmentCaseList) {
        this.treatmentCaseList = treatmentCaseList;
    }

    public List<HorseResumePrizeModel> getPrizeList() {
        return prizeList;
    }

    public void setPrizeList(List<HorseResumePrizeModel> prizeList) {
        this.prizeList = prizeList;
    }

    public List<HorseResumeVaccinationModel> getVaccinationList() {
        return vaccinationList;
    }

    public void setVaccinationList(List<HorseResumeVaccinationModel> vaccinationList) {
        this.vaccinationList = vaccinationList;
    }

    public List<HorseResumeBrigandineModel> getBrigandineList() {
        return brigandineList;
    }

    public void setBrigandineList(List<HorseResumeBrigandineModel> brigandineList) {
        this.brigandineList = brigandineList;
    }

    public List<HorseResumeContusionTeethModel> getContusionTeethList() {
        return contusionTeethList;
    }

    public void setContusionTeethList(List<HorseResumeContusionTeethModel> contusionTeethList) {
        this.contusionTeethList = contusionTeethList;
    }

    public List<HorseResumeTreatmentInfoModel> getTreatmentInfoList() {
        return treatmentInfoList;
    }

    public void setTreatmentInfoList(List<HorseResumeTreatmentInfoModel> treatmentInfoList) {
        this.treatmentInfoList = treatmentInfoList;
    }
}
