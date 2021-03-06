/*
 * 商品管理面板
 */

Ext.define('App.view.ProductPanel', {
    alias: 'widget.productpanel',
    extend: 'App.ux.CrudPanel',
    requires: ['App.ux.RemoteComboBox'],
    baseUrl: "/products",
    window: {
        title: '编辑窗口',
        items: [
            {
                name: 'id',
                hidden: true
            },
            {
                fieldLabel: '产品名称',
                name: 'name',
                allowBlank: false
            },
            {
                fieldLabel: '型号',
                name: 'model',
                allowBlank: false
            },
            {
                fieldLabel: '价格',
                name: 'price',
                allowBlank: false
            },
            {
                fieldLabel: '商品描述',
                name: 'description',
                allowBlank: false
            },
            {
                fieldLabel: '商品图片',
                name: 'imgUrl',
                xtype: 'filefield',
                buttonText: '请选择商品图片文件...',
                msgTarget: 'side'

            }
        ]
    },
    fields: ['id', 'name', 'price', 'brand.id', 'brand.name', 'model', 'imgUrl', 'description'],
    columns: [
        {
            xtype: 'rownumberer'
        },
        {
            text: "产品名称",
            width: 200,
            dataIndex: 'name'
        },
        {
            text: "型号",
            width: 80,
            dataIndex: 'model'
        },
        {
            text: "价格",
            width: 80,
            formatter: 'usMoney',
            dataIndex: 'price'
        },
        {
            text: "所属品牌",
            width: 80,
            dataIndex: 'brand.name'
        },
        {
            text: "商品描述",
            flex: 1,
            dataIndex: 'description'
        }
    ]
});
