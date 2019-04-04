/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
window.onload = function() 
{
    var fileInput = document.getElementById('fileInput');
    var fileDisplayArea = document.getElementById('fileDisplayArea');

    fileInput.addEventListener('change', function(e) 
    {
        var file = fileInput.files[0];
        var textType = /json.*/;

        if (file.type.match(textType)) 
        {
            var reader = new FileReader();

            reader.onload = function(e) 
            {
                    fileDisplayArea.innerText = reader.result;
            }

            reader.readAsText(file);
        }
        else 
        {
            fileDisplayArea.innerText = "File not supported!"
        }
    });
}