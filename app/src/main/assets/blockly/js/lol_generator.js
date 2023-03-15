Blockly.JavaScript['lol'] = function(block) {
  var statements_lol = Blockly.JavaScript.statementToCode(block, 'lol');
  // TODO: Assemble JavaScript into code variable
  var code ='var statements_lol="'+statements_lol+'",string0,string1,string2,string3,string4,string5;\n' +
      '  if (statements_lol[2]===\'0\')\n' +
      '    string0="德玛西亚之力-盖伦";\n' +
      '  else if (statements_lol[2]===\'1\')\n' +
      '    string0="寒冰射手-艾希";\n' +
      '  else string0="流浪法师-瑞兹";\n' +
      '  if (statements_lol[3]===\'0\')\n' +
      '    string1="上路";\n' +
      '  else if (statements_lol[3]===\'2\')\n' +
      '    string1="中路";\n' +
      '  else string1="下路";\n' +
      '  if (statements_lol[2]===\'0\')\n' +
      '    string2="点燃";\n' +
      '  else string2="传送";\n' +
      '  if (statements_lol[5]===\'0\')\n' +
      '    string3="治疗";\n' +
      '  else string3="闪现";\n' +
      '  if (statements_lol[6]===\'0\')\n' +
      '    string4="多兰盾";\n' +
      '  else if (statements_lol[6]===\'1\')\n' +
      '    string4="多兰剑";\n' +
      '  else string4="多兰戒";\n' +
      '  if (statements_lol[7]===\'0\')\n' +
      '    string5=\'Q\';\n' +
      '  else if (statements_lol[7]===\'1\')\n' +
      '    string5=\'W\';\n' +
      '  else string5=\'E\';'+'window.alert(\'你选择了\'+string0+\',走了\'+string1+\',召唤师技能带的是\'+string2+\'和\'+string3+\',出门买了\'+string4+\',点了\'+string5+\'技能。\');'+
      'if (statements_lol==="  000110"||statements_lol==="  000112"||statements_lol==="  000100"||statements_lol==="  000102"||statements_lol==="  001110"||statements_lol==="  001112"||statements_lol==="  001100"||statements_lol==="  001102"||statements_lol==="  201122"||statements_lol==="  200122"||statements_lol==="  221122"||statements_lol==="  220122")\n' +
      '    window.alert(\'会玩的呀，兄弟！\');\n' +
      '  else if (statements_lol[2]===\'1\')\n' +
      '    window.alert(\'兄弟，选ADC你就已经输啦！\');\n' +
      '  else window.alert(\'看来你不太会玩呀！\');';
  return code;
};

Blockly.JavaScript['choice'] = function(block) {
  var dropdown_hero = block.getFieldValue('hero');
  var dropdown_route = block.getFieldValue('route');
  // TODO: Assemble JavaScript into code variable.
  var choice0,choice01,choice02;
  if (dropdown_hero==='tank')
    choice01='0';
  else if (dropdown_hero==='AD')
    choice01='1';
  else choice01='2';
  if (dropdown_route==='above')
    choice02='0';
  else if (dropdown_route==='middle')
    choice02='2';
  else choice02='1';
  choice0=choice01+choice02;
  return choice0;
};

Blockly.JavaScript['choice1'] = function(block) {
  var dropdown_initial_skill1 = block.getFieldValue('initial_skill1');
  var dropdown_initial_skill2 = block.getFieldValue('initial_skill2');
  // TODO: Assemble JavaScript into code variable.
  var choice1,choice11,choice12;
  if (dropdown_initial_skill1==='burn')
    choice11='0';
  else choice11='1';
  if (dropdown_initial_skill2==='heal')
    choice12='0';
  else choice12='1';
  choice1=choice11+choice12;
  return choice1;
};

Blockly.JavaScript['choice2'] = function(block) {
  var dropdown_equipment = block.getFieldValue('equipment');
  var dropdown_skill = block.getFieldValue('skill');
  // TODO: Assemble JavaScript into code variable.
  var choice2,choice21,choice22;
  if (dropdown_equipment==='sword')
    choice21='1';
  else if (dropdown_equipment==='shield')
    choice21='0';
  else choice21='2';
  if (dropdown_skill==='q')
    choice22='0';
  else if (dropdown_skill==='w')
    choice22='1';
  else choice22='2';
  choice2=choice21+choice22;
  return choice2;
};