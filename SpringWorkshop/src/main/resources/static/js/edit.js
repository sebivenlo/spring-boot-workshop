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
        url : "",
        type: "",
        contentType: "",
        dataType : "",
        data: ""
    });
}
