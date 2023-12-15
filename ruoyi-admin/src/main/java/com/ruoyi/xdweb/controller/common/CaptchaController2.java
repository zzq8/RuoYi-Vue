package com.ruoyi.xdweb.controller.common;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.system.service.ISysConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 验证码：Return 1) UUID  2) Img
 */
@RestController
public class CaptchaController2 {

    @Autowired
    private ISysConfigService configService;

    @PostMapping("/captchaImage2")
    public AjaxResult getCode(){

        AjaxResult result = AjaxResult.success();
        boolean b = configService.selectCaptchaEnabled();

        if (!b) {
            return result;
        }





        return result;
    }

}
