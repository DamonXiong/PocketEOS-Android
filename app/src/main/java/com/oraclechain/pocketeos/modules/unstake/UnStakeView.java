package com.oraclechain.pocketeos.modules.unstake;

import com.oraclechain.pocketeos.base.BaseView;
import com.oraclechain.pocketeos.bean.AccountDetailsBean;

/**
 * Created by pocketEos on 2017/12/26.
 */
public interface UnStakeView extends BaseView {

    void getAccountDetailsDataHttp(AccountDetailsBean accountDetailsBean);

    void getDataHttpFail(String msg);
}
