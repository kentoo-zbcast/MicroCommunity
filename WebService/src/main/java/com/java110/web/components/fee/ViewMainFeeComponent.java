package com.java110.web.components.fee;

import com.java110.core.context.IPageData;
import com.java110.web.smo.IFeeServiceSMO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 * @ClassName ViewPropertyFeeConfigComponent
 * @Description 查询主费用信息
 * @Author wuxw
 * @Date 2019/6/1 14:33
 * @Version 1.0
 * add by wuxw 2019/6/1
 **/
@Component("viewPropertyFeeConfig")
public class ViewMainFeeComponent {

    @Autowired
    private IFeeServiceSMO feeServiceSMOImpl;

    public ResponseEntity<String> getFee(IPageData pd) {
        return feeServiceSMOImpl.loadFeeByRoomId(pd);
    }


    public IFeeServiceSMO getFeeServiceSMOImpl() {
        return feeServiceSMOImpl;
    }

    public void setFeeServiceSMOImpl(IFeeServiceSMO feeServiceSMOImpl) {
        this.feeServiceSMOImpl = feeServiceSMOImpl;
    }
}