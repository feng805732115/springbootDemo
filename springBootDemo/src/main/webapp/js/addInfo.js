$(document).ready(function () {
    $("#addInfo").submit(function () {
        var deptNo=$("#deptNo").val();
        var deptName=$("#deptName").val();
        var deptLoc=$("#deptLoc").val();
        var parm=$(this).serialize()
        $.ajax({
            url: "addDept",
            type: "POST",
/*            data:"deptNo="+deptNo+"&deptName="+deptName+"&deptLoc="+deptLoc,*/
            data:parm,
            dataType:"text",
            success:function (data) {
               alert(data);
               $("body").load("deptList");
            },
            error:function () {

            }

        })

    });
});

