package abstractFactoryTest.htmlMaker.listfactory;

import abstractFactoryTest.htmlMaker.factory.Link;

public class ListLink extends Link {
    public ListLink(String title, String url) {
        super(title, url);
    }

    @Override
    public String makeHTML(){
        return " <li><a herf=\""+url+"\">"+caption+"</a></li>";
    }
}
