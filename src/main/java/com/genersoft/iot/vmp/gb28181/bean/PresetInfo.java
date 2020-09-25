package com.genersoft.iot.vmp.gb28181.bean;

import java.util.List;

/**
 * @program: wvp
 * @description: TODO
 * @author: zan.kang
 * @history: 1.created by zan.kang 2020/9/22 9:39
 * 2.
 */
public class PresetInfo {

    private String deviceId;
    private String sn;
    private List<PresetItem> presetList;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public List<PresetItem> getPresetList() {
        return presetList;
    }

    public void setPresetList(List<PresetItem> presetList) {
        this.presetList = presetList;
    }
}
