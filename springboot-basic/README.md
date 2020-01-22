## Springboot Basic

`springboot`在使用中集成了很多的部件和功能，有些是基础，而有些则需要根据技术选型和业务需求来确定。

该项目就着重与基础与常用功能配置使用最佳实践，以帮助自己及其他开发者快速构建起基础服务。

# 功能清单

## web基础

### MVC模式

### 全局异常处理（结合错误码） 

### 自定义类型转换

### 拦截器

### 过滤器

### 监听器

### 跨域CORS

### 多环境

### 日志

### 国际化消息

### 参数校验（国际化）


## 数据库

### 数据源

### 连接池

### 数据版本迁移

### ORM - Mybatis

## 缓存

## 任务

### 定时任务



### 异步任务

## 测试

### 单元测试

> 使用Junit5

参考 `demo` 文件夹下测试类 

### 集成测试



### 测试报告（可选）

## DevOps(可选)

### jenkins脚本

### springAction脚本



## 其他(可选)

### 虚拟文件服务器

```java
@Profile(AppConst.PROFILE_DEV)
@Configuration
public class SimpleFileServerConfiguration implements WebMvcConfigurer {

    /**
     * springboot可以将本地文件地址映射为虚拟网络地址，从而实现简单的文件服务器
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("file:E:/develop/files/resources/");
    }
}
```

### API文档

配置：

```java
@OpenAPIDefinition(
        info = @Info(
                title = "spring kata API",
                version = "v1.0.1",
                description = "springboot最佳实践，项目类型：basic"
        )
)
@Configuration
public class ApiDocConfiguration {
}
```

使用：

```java

```








