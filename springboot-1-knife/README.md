# springboot-1-knife4j

springboot integrate knife!

knife4j官网  （https://doc.xiaominfo.com/knife4j/documentation/）



1、添加knife依赖

```
<dependency>
			<groupId>com.github.xiaoymin</groupId>
			<artifactId>knife4j-spring-boot-starter</artifactId>
			<version>2.0.9</version>
		</dependency>
```



2、注意 spring-boot-starter 版本，不匹配会有异常。 

```
<parent>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-parent</artifactId>
   <version>2.3.5.RELEASE</version>
   <relativePath/> <!-- lookup parent from repository -->
</parent>
```



3、添加配置文件

```
@Configuration
@EnableSwagger2WebMvc //该注解是Springfox-swagger框架提供的使用Swagger注解，该注解必须加
@EnableKnife4j   //该注解是knife4j提供的增强注解,Ui提供了例如动态参数、参数过滤、接口排序等增强功能,如果你想使用这些增强功能就必须加该注解，否则可以不用加
public class Knife4jConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                // 配置分组名
                .groupName("api-restful")
                .apiInfo(new ApiInfoBuilder()
                        .title("XXXXXXAPI接口")
                        .description("API接口文档")
                        .termsOfServiceUrl("http://www.baidu.com")
                        .contact(new Contact("mingxinag", "http://www.baidu.com", "mingxiang@qq.com"))
                        .version("1.0")
                        .build())
                .select()
                // 设置扫描包的地址 : com.hanliy.controller
                .apis(RequestHandlerSelectors.basePackage("com.mingxiang.knife4j.controller"))
                // 设置路径筛选 只扫描com.hanliy.controller/test/下面的包
                // .paths(PathSelectors.ant("/test/**"))
                // com.hanliy.controller下的任何接口信息
                .paths(PathSelectors.any())
                .build();
    }


}
```











![(C:\Users\Lenovo\AppData\Roaming\Typora\typora-user-images\image-20211213095127094.png)



4、使用配置文件信息进行登录

![image-20211213095333864](C:\Users\Lenovo\AppData\Roaming\Typora\typora-user-images\image-20211213095333864.png)


![image-20211213095333864](..\images\1.png)

![image-20211213095333864](D:\Projects\springboot-demos-github\springboot-1-knife\imagesimages\1.png)




5、登录成功后的页面
![image-20211213095333864](..\images\2.png)









![image-20211213095815508](C:\Users\Lenovo\AppData\Roaming\Typora\typora-user-images\image-20211213095815508.png)

