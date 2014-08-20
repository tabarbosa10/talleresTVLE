/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
define(['model/sportPromedioModel'], function(){
    App.Model.SportPromedioModel = Backbone.Model.extend({
                defaults:{
                    'name':'',
                    'average':''
                },
                getDisplay: function(name) {
                    return this.get(name);
                }
    });
    
    App.Model.SportPromedioList = Backbone.Collection.extend({
       model: App.Model.SportPromedioModel
    });
    
    return App.Model.SportPromedioModel;
});


