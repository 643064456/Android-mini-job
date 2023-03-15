Blockly.JavaScript['condition'] = function(block) {
  var statements_condition = Blockly.JavaScript.statementToCode(block, 'condition');
  // TODO: Assemble JavaScript into code variable.
  // statements_condition=Blockly.JavaScript['step'](block);
  var code ='if ("'+statements_condition+'"=="  \'take 1 steps\'\'turn left\'\'take 1 steps\'\'turn right\'\'take 1 steps\'\'turn right\'\'take 1 steps\'\'turn left\'\'take 1 steps\'\'turn left\'\'take 3 steps\'") {\nwindow.alert(\'Conguatulations!\');\n} else {\nwindow.alert(\'Sorry!\');\n}';
  return code;
};

Blockly.JavaScript['step'] = function(block) {
  var value_take = Blockly.JavaScript.valueToCode(block, 'take', Blockly.JavaScript.ORDER_ATOMIC);
  // TODO: Assemble JavaScript into code variable.
  var code = '\'take '+value_take+' steps\'';
  return code;
};

Blockly.JavaScript['left'] = function(block) {
  // TODO: Assemble JavaScript into code variable.
  var code = '\'turn left\'';
  return code;
};

Blockly.JavaScript['right'] = function(block) {
  // TODO: Assemble JavaScript into code variable.
  var code = '\'turn right\'';
  return code;
};