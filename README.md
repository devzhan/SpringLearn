# Spring学习，具体参考资料为https://www.w3cschool.cn/wkspring/yqdx1mm5.html
# learn1 spring的基本容器了解
bean的作用域属性scope 可为 singleton ：该作用域将 bean 的定义的限制在每一个 Spring IoC 容器中的一个单一实例(默认)。prototype：该作用域将单一 bean 的定义限制在任意数量的对象实例。
BeanPostProcessor 该接口的方法在所有bean创建的时候均会调用
# learn2 spring注入
Constructor-based dependency injection
##当容器调用带有多个参数的构造函数类时，实现基于构造函数的 DI，每个代表在其他类中的一个依赖关系。
Setter-based dependency injection
##基于 setter 方法的 DI 是通过在调用无参数的构造函数或无参数的静态工厂方法实例化 bean 之后容器调用 beans 的 setter 方法来实现的。
## 集合注入