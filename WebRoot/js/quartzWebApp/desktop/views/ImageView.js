/**
 * @class Ext.org.ImageView
 * @extends Ext.view.View
 * @xtype imageview
 *
 * This class implements the "My Images" view (the images in the organizer). This class
 * incorporates {@link Ext.ux.DataView.Draggable Draggable} to enable dragging items as
 * well as {@link Ext.ux.DataView.DragSelector DragSelector} to allow multiple selection
 * by simply clicking and dragging the mouse.
 */
Ext.define('js.quartzWebApp.desktop.views.ImageView', {
    extend: 'Ext.view.View',
    alias : 'widget.imageview',
    requires: ['Ext.data.Store'],
    mixins: {
        dragSelector: 'Ext.ux.DataView.DragSelector',
        draggable   : 'Ext.ux.DataView.Draggable'
    },
    
    tpl: [
        '<tpl for=".">',
            '<div class="thumb-wrap">',
                '<div class="thumb">',
                    (!Ext.isIE6? '<img src="../view/chooser/icons/{thumb}" />' : 
                    '<div style="width:76px;height:76px;filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(src=\'../view/chooser/icons/{thumb}\')"></div>'),
                '</div>',
                '<span>{name}</span>',
            '</div>',
        '</tpl>'
    ],
    
    itemSelector: 'div.thumb-wrap',
    multiSelect: true,
    singleSelect: false,
    cls: 'x-image-view',
    autoScroll: true,
    
    initComponent: function() {
        this.store = Ext.create('Ext.data.Store', {
            autoLoad: true,
            fields: ['name', 'thumb', {name: 'leaf', defaultValue: true}],
            proxy: {
                type: 'ajax',
                url : '../view/chooser/icons.json',
                reader: {
                    type: 'json',
                    root: ''
                }
            }
        });
        
        this.mixins.dragSelector.init(this);
        this.mixins.draggable.init(this, {
            ddConfig: {
                ddGroup: 'organizerDD'
            },
            ghostTpl: [
                '<tpl for=".">',
                    '<img src="../view/chooser/icons/{thumb}" />',
                    '<tpl if="xindex % 4 == 0"><br /></tpl>',
                '</tpl>',
                '<div class="count">',
                    '{[values.length]} images selected',
                '<div>'
            ]
        });
        
        this.callParent();
    }
});