Blockly.Blocks['right'] = {
  init: function() {
    this.appendDummyInput()
        .appendField("turn right");
    this.setInputsInline(false);
    this.setPreviousStatement(true, null);
    this.setNextStatement(true, null);
    this.setColour(120);
 this.setTooltip("");
 this.setHelpUrl("");
  }
};