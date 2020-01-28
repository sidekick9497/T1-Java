
            /*function changeDiv(){
                var divObj = document.getElementById('content');
                divObj.innerHTML = "<h1>HELLO</h1>";
            }*/

            function changeText(){
                // need to access textbox
               var txtObject =  document.getElementById('txt');
               txtObject.value = "Hello";
                
            }
            

            window.onload = function(){
                // connecting JS functions with HTML events (Global Exe Stack)
                //document.getElementById('btnTxt').addEventListener(<event>,<function>);
                document.getElementById('btnTxt').addEventListener('click',changeText);
                // document.getElementById('btnDiv').addEventListener('click',changeDiv);
               
                document.getElementById('btnDiv').addEventListener('click',function(){
                    var divObj = document.getElementById('content');
                    divObj.innerHTML = "<h1>HELLO</h1>";
                });

            }

            
        