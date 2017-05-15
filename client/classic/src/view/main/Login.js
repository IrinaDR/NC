
Ext.create('Ext.window.Window', {
    title: 'Authorization',
    height: 180,
    width: 300,
    layout: 'fit',
    items: {
        xtype: 'form',
        reference: 'form',
        items: [            {
            xtype: 'textfield',
            name: 'username',
            fieldLabel: 'Login',
            allowBlank: false
        }, {
            xtype: 'textfield',
            name: 'password',
            inputType: 'password',
            fieldLabel: 'Password',
            allowBlank: false
        }
        ],
        buttons: [{
            text: 'Login',
            formBind: true,
        }]
    }
}).show();
