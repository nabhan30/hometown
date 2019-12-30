function showContents(id) {
  var i;
  var content = document.getElementsByClassName("content");
  for (i = 0; i < content.length; i++) {
    content[i].style.display = "none";
  }
  var show = (document.getElementById(id).style.display = "block");
}