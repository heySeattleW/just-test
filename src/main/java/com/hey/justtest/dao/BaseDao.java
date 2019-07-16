package com.hey.justtest.dao;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import org.springframework.context.annotation.Configuration;

import java.io.Reader;

@Configuration
public class BaseDao extends SqlMapClientBuilder{
	
	 private static final SqlMapClient sqlMap;

	    //在静态区块中初试化返回

	    static {

	        try {

	            //声明配置文件的名称（映射文件被定义在其中）

	            String resource = "sqlmap-web.xml";


	            //利用工具类Resources来读取到配置文件

	            Reader reader = Resources.getResourceAsReader(resource);

	   /**      // 第3步、进行读操作
	                   char c[] = new char[1024] ;        // 所有的内容都读到此数组之中
	                     int temp = 0 ;    // 接收每一个内容
	                     int len = 0 ;        // 读取内容
	                    while((temp=reader.read())!=-1){
	                         // 如果不是-1就表示还有内容，可以继续读取
	                         c[len] = (char)temp ;
	                         len++ ;
	                    }
	                     // 第4步、关闭输出流
	                    reader.close() ;                        // 关闭输出流
	                    // 把字符数组变为字符串输出
	                    System.out.println("内容为：" + new String(c,0,len)) ;    */
	            //创建SqlMapClient接口的变量实例
	            
	            sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);


	        } catch (Exception e) {

	            e.printStackTrace();

	            throw new RuntimeException(

	                    "加载sqlmap-*文件出错(load sqlmap-* file wrong). Cause: " + e);

	        }

	    }

	    public static SqlMapClient getSqlMapInstance() {

	        //提供静态方法返回静态区块中得到的SqlMapClient
	          
	       return sqlMap;
	       // return null;

	    }

}