/* ========================================================================
 * Copyright 2014 tallerCrud
 *
 * Licensed under the MIT, The MIT License (MIT)
 * Copyright (c) 2014 tallerCrud

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
 * ========================================================================


Source generated by CrudMaker version 1.0.0.201408112050

*/
define(['controller/_refereeController','delegate/refereeDelegate'], function() {
    App.Controller.RefereeController = App.Controller._RefereeController.extend({
    average: function(params){
            var avg;
        if(parseInt(params.experiencia)<=2)     {
          avg= 'Novato';  
          alert('El referee es: ' + avg);
        }
        else if(parseInt(params.experiencia)>= 3 && parseInt(params.experiencia)<= 6){
           avg= 'Competente';
           alert('El referee es: ' + avg);
        }
        else if(parseInt(params.experiencia)>= 7){
           avg= 'Experto'; 
           alert('El referee es: ' + avg);
        }
    }
    });
    return App.Controller.RefereeController;
}); 