package com.rtpksps.kss.base.login.VO;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: xiao
 * @create: 2020-07-31
 **/
@Getter
@Setter
public class SendSmsVO {

    private String code;
    private String msg;
    private boolean success;
    private String statusText;
}
