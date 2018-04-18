$(document).ready(function() {
	 		/*规则*/
        $(".rule").click(function(event) {
            $(".gray,.drom").fadeIn(300)
        });
        /*视频*/
        $(".prize .close-btn,enroll .close-btn").click(function(event) {
            $(this).parent("div").parent().fadeOut(300);
            $("video,.gray").fadeIn(300)
        });

});