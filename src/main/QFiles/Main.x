#import src.main.QFiles.BT;

class Main
    void main()
        std:ln("Test");

        port = "8000";
        create WebServer(port);
        WebServer.changeText(port);
        std:ln("WebServer online! Visit it at localhost:" + port);

        init();

    endf
endc

if (1 < 2) do
    std:ln("If Statement Test");
endf

Window win = new Window("Hello", "600", "450");
win.render();