package com.org.springboot;

import com.google.common.collect.Lists;
import com.org.springboot.entities.DefaultValue;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.bind.SchemaOutputResolver;
import javax.xml.crypto.Data;
import java.beans.SimpleBeanInfo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
class SpringBoot04WebRestfulcrudApplicationTests {

    @Test
    void contextLoads() {

        Date date = new Date(System.currentTimeMillis() + 3 * 60 * 1000);
        SimpleDateFormat dfs = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = dfs.format(date);
        System.out.println(format);


//        long l = calculateTime(new Date());
//        System.out.println(l);
    }

    @Test
    public void testLists() {
        List list = new ArrayList();
        for (int i = 0; i < 25; i++) {
            list.add(1);
            list.add("2");
            list.add(3);
        }
        List partition = Lists.partition(list, 6);
        System.out.println(list);
        System.out.println(partition);

    }


    public long calculateTime(Date date) {
        long seconds = 1;
        SimpleDateFormat dfs = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String nowTime = dfs.format(new Date());
        String endTime = dfs.format(date);

        try {

            Date begin = dfs.parse(nowTime);
            Date end = dfs.parse(endTime);

            seconds = (end.getTime() - begin.getTime()) /1000;


        } catch (ParseException e) {
            e.printStackTrace();
        }

        return seconds;

    }


    public static void main(String[] args) {

        DefaultValue defaultValue = new DefaultValue();

        System.out.println(defaultValue);
        List ls =  new ArrayList<Object>();
        System.out.println(ls);
        
    }



}
