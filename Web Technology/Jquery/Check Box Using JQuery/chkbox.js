//WRITE YOUR jQUERY CODE HERE

    $("input[type='checkbox']").click(function(){
        var count=0;
        count=$("input:checked").length;
        if(count==1)
        {
            $("#result").text(count+" box is checked");
        }
        else
        $("#result").text(count+" boxes are checked");
    });