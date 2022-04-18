package designPattern.chainOfResposibility;

import java.util.ArrayList;
import java.util.List;

public class Chain {
}


class Request{

}


class Response{

}

interface Filter{
    boolean doFilter(Request request,Response response,FilterChain filterChain);
}

class Filter1 implements Filter{

    @Override
    public boolean doFilter(Request request, Response response,FilterChain filterChain) {
        System.out.println("Filter1 do request filer");
        filterChain.doFilter(request,response);
        System.out.println("Filter1 do response filer");
        return true;
    }
}

class Filter2 implements Filter{

    @Override
    public boolean doFilter(Request request, Response response,FilterChain filterChain) {
        System.out.println("Filter2 do request filer");
        filterChain.doFilter(request,response);
        System.out.println("Filter2 do response filer");
        return true;
    }
}

class FilterChain{

    List<Filter> filterList = new ArrayList<>();

    public FilterChain add(Filter filter){
        filterList.add(filter);
        return this;
    }

    int index = 0;

    public boolean doFilter(Request request, Response response) {
        if(index == filterList.size()){
            return false;
        }
        Filter filter = filterList.get(index);
        index++;
        return filter.doFilter(request,response,this);
    }

    public static void main(String[] args) {
        FilterChain filterChain = new FilterChain();
        filterChain.add(new Filter1()).add(new Filter2());
        filterChain.doFilter(new Request(),new Response());
    }
}