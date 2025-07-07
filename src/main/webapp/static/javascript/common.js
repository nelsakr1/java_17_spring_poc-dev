$('#resetPassword').click(function (event) {
    console.log("Sending reset password link");
    if ($('#resetPasswordEmail').val() == '') {
        alert("Please enter email address");
        event.preventDefault();
    }

    $.ajax({
        url: ctx + '/public/password/reset_request.html?userName=' + $('#username').val() + '&email=' + $('#resetPasswordEmail').val(),
        type: "POST",

        success: function (result) {
            if (result.message) {
                //alert(result.message);
            }
        },

        error: function (xhr, ajaxOptions, thrownError) {
            alert("Error", thrownError);
        }
    });

    event.preventDefault();
});