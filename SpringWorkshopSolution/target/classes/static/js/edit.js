function save() {
   
    var student = {
        fullTime : $('#fullTime').val(),
        enrolYear : $('#enrolYear').val(),
        semester : $('#semester').val(),
        degree : $('#degree').val(),
        studyProgram : $('#studyProgram').val()
    };

    // TODO 2.3.0 make an ajax request to Student Controller
    
    $.ajax({
        url : "/account/secured/save",
        type: "POST",
        contentType: "application/json",
        dataType : 'json',
        data: JSON.stringify(student)
    });
}
