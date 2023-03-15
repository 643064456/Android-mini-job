Blockly.Blocks['left'] = {
  init: function() {
    this.appendDummyInput()
        .appendField("turn left");
    this.setInputsInline(false);
    this.setPreviousStatement(true, null);
    this.setNextStatement(true, null);
    this.setColour(120);
 this.setTooltip("");
 this.setHelpUrl("");
  }
};