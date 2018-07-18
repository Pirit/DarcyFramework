package com.pxu.demo;

import com.redhat.darcy.ui.AbstractView;
import com.redhat.darcy.ui.annotations.RequireAll;
import com.redhat.darcy.web.StaticViewUrl;
import com.redhat.darcy.web.api.ViewUrl;

@RequireAll
public class BaiduPage extends AbstractView {
    public static ViewUrl<BaiduPage> url() {
        return new StaticViewUrl<>("http://www.baidu.com", BaiduPage::new);
    }
}
