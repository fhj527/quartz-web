Ext.require([ '*' ]);
Ext.BLANK_IMAGE_URL = 'images/default/s.gif';
Ext.QuickTips.init();
Ext.tip.QuickTipManager.init();
Ext.form.Field.prototype.msgTarget = 'side';
Ext.Ajax.timeout = 300000;
