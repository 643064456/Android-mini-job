Blockly.JavaScript['condition'] = function(block) {
  var statements_name = Blockly.JavaScript.statementToCode(block, 'NAME');
  statements_name=1;
  // TODO: Assemble JavaScript into code variable.
  var code ='if ('+statements_name+') {\nwindow.alert(\'Conguatulations!\');\n} else {\nwindow.alert(\'Sorry!\');\n}';
  return code;
};