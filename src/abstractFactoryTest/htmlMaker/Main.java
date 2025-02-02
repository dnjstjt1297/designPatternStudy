package abstractFactoryTest.htmlMaker;

import abstractFactoryTest.htmlMaker.factory.*;

public class Main {
    public static void main(String[] args){
        if(args.length != 2){
            System.out.println("Usage: java Main filename.html class.name.ConcreteFactory");
            System.out.println("Example1: java Main list.html abstractFactoryTest.htmlMaker.ListFactory");
            System.out.println("Example2: java Main div.html abstractFactoryTest.htmlMaker.DivFactory");
            System.exit(0);
        }

        String filename = args[0];
        String className = args[1];

        Factory factory = Factory.getFactory(className);

        //Blog
        Link blog1 = factory.createLink("Blog 1", "http://example.com/blog1");
        Link blog2 = factory.createLink("Blog 2", "http://example.com/blog2");
        Link blog3 = factory.createLink("Blog 3", "http://example.com/blog3");

        Tray blogTray = factory.createTray("Blog Site");
        blogTray.addItem(blog1);
        blogTray.addItem(blog2);
        blogTray.addItem(blog3);

        //News
        Link news1 = factory.createLink("News 1", "http://example.com/news1");
        Link news2 = factory.createLink("News 2", "http://example.com/news2");
        Tray news3 = factory.createTray("News 3");
        news3.addItem(factory.createLink("news 3 (US)","http://example.com/news3us"));
        news3.addItem(factory.createLink("news 3 (Korea)","http://example.com/news3kr"));

        Tray newsTray = factory.createTray("News Tray");
        newsTray.addItem(news1);
        newsTray.addItem(news2);
        newsTray.addItem(news3);

        //Page
        Page page = factory.createPage("Blog and News", "gorapaduk.com");
        page.add(blogTray);
        page.add(newsTray);

        page.output(filename);
    }
}
