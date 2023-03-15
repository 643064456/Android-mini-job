Blockly.Blocks['lol'] = {
  init: function() {
    this.appendStatementInput("lol")
        .setCheck(null)
        .appendField("来一把LOL");
    this.setColour(0);
 this.setTooltip("");
 this.setHelpUrl("");
  }
};

Blockly.Blocks['choice'] = {
    init: function() {
        this.appendDummyInput()
            .appendField("选择你的英雄")
            .appendField(new Blockly.FieldDropdown([["盖伦","tank"], ["艾希","AD"], ["瑞兹","AP"]]), "hero")
            .appendField("选择你的分路")
            .appendField(new Blockly.FieldDropdown([["上路","above"], ["中路","middle"], ["下路","bottom"]]), "route");
        this.setPreviousStatement(true, null);
        this.setNextStatement(true, null);
        this.setColour(90);
        this.setTooltip("");
        this.setHelpUrl("");
    }
};

Blockly.Blocks['choice1'] = {
  init: function() {
    this.appendDummyInput()
        .appendField("选择你的召唤师技能1")
        .appendField(new Blockly.FieldDropdown([[{"src":"https://bkimg.cdn.bcebos.com/pic/a686c9177f3e6709934a286230c79f3df9dc55e0?x-bce-process=image/resize,m_lfit,w_268,limit_1/format,f_auto","width":30,"height":30,"alt":"*"},"burn"], [{"src":"https://bkimg.cdn.bcebos.com/pic/c2cec3fdfc039245b5958b928c94a4c27d1e250e?x-bce-process=image/resize,m_lfit,w_268,limit_1/format,f_auto","width":30,"height":30,"alt":"*"},"TP"]]), "initial_skill1")
        .appendField("选择你的召唤师技能2")
        .appendField(new Blockly.FieldDropdown([[{"src":"https://bkimg.cdn.bcebos.com/pic/29381f30e924b8996feb07a565061d950b7bf65c?x-bce-process=image/resize,m_lfit,w_268,limit_1/format,f_auto","width":30,"height":30,"alt":"*"},"heal"], [{"src":"https://bkimg.cdn.bcebos.com/pic/562c11dfa9ec8a13a863367dfc03918fa0ecc036?x-bce-process=image/resize,m_lfit,w_268,limit_1/format,f_auto","width":30,"height":30,"alt":"*"},"flash"]]), "initial_skill2");
    this.setPreviousStatement(true, null);
    this.setNextStatement(true, null);
    this.setColour(180);
 this.setTooltip("");
 this.setHelpUrl("");
  }
};

Blockly.Blocks['choice2'] = {
  init: function() {
    this.appendDummyInput()
        .appendField("选择你的出门装")
        .appendField(new Blockly.FieldDropdown([[{"src":"https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimgcache.tuwandata.com%2Fv2%2Fthumb%2Fall%2FYmU0Niw2MDAsMTAwLDQsMywxLC0xLDEsLCw5MA%3D%3D%2Fu%2Fwww.tuwan.com%2Fuploads%2Fallimg%2F1603%2F01%2F748_160301174813_1.png&refer=http%3A%2F%2Fimgcache.tuwandata.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1641431380&t=ce2decabf49dda36a5c098fd5f1b2d83","width":200,"height":100,"alt":"*"},"sword"], [{"src":"https://gimg2.baidu.com/image_search/src=http%3A%2F%2Finews.gtimg.com%2Fnewsapp_match%2F0%2F12145269609%2F0.jpg&refer=http%3A%2F%2Finews.gtimg.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1641431484&t=ef0b31529c0a2308522ff6305539f3a8","width":200,"height":100,"alt":"*"},"shield"], [{"src":"https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fn.sinaimg.cn%2Fsinacn14%2F590%2Fw875h515%2F20180423%2F0808-fzqvvrz8369147.jpg&refer=http%3A%2F%2Fn.sinaimg.cn&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1641431496&t=429d15cd4c3ecedf13728bac9e668d14","width":200,"height":100,"alt":"*"},"ring"]]), "equipment")
        .appendField("选择你的初始技能")
        .appendField(new Blockly.FieldDropdown([["Q","q"], ["W","w"], ["E","e"]]), "skill");
    this.setPreviousStatement(true, null);
    this.setNextStatement(true, null);
    this.setColour(270);
 this.setTooltip("");
 this.setHelpUrl("");
  }
};