Blockly.Blocks['step'] = {
  init: function() {
    this.appendValueInput("take")
        .setCheck("Number")
        .appendField("take");
    this.appendDummyInput()
        .appendField("steps");
    this.setInputsInline(true);
    this.setPreviousStatement(true, null);
    this.setNextStatement(true, null);
    this.setColour(65);
 this.setTooltip("");
 this.setHelpUrl("");
  }
};