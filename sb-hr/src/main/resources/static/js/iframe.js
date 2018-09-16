function alls() {
    var sum = document.getElementsByName("check");// 
    for (var i = 0; i < sum.length; i++) {  //ѭ�����
        if (sum[i].type == "checkbox") {  //�ж��Ƿ���checkbox
            sum[i].checked = true; //�ǵĻ���ѡ��
        }
    }
}

function unalls() {
    var sum = document.getElementsByName("check");// 
    for (var i = 0; i < sum.length; i++) {  //ѭ�����
        if (sum[i].type == "checkbox") {  //�ж��Ƿ���checkbox
            sum[i].checked = false; //�ǵĻ��Ͳ�ѡ��
        }
    }
}

function resets() {
    var sum = document.getElementsByName("check");// 
    for (var i = 0; i < sum.length; i++) {  //ѭ�����
        if (sum[i].type == "checkbox") {  //�ж��Ƿ���checkbox
            if (sum[i].checked == true) {    //�ж��Ƿ�ѡ��
                sum[i].checked = false;  //ѡ�е����䲻ѡ��
            }
            else {      //�ж��Ƿ�ûѡ
                sum[i].checked = true;   //ûѡ�е�����ѡ��
            }
        }
    }
}


function showCenter() {
    document.getElementById("div_center").style.display = "";
    return false;
}

function showBottom() {
    document.getElementById("div_bottom").style.display = "";
}

function show(mydiv) {
    document.getElementById(mydiv).style.display = "";
}

function hidden(mydiv) {
    document.getElementById(mydiv).style.display = "none";
}

function tm_leave() {
    var type = document.getElementById("result").value;

    if (type == "����¼��") {
        if (confirm("�Ƿ�Ը�Ա��������ְ����")) {
            document.location.replace("leave.html");

            return false;
        }
    }
    return true;
}
