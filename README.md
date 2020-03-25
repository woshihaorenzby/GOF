# GOF
**23种设计模式**
``1.单例模式
  ``某个类只能生成一个实例，该类私有化构造方法，提供了一个全局访问点供外部获取该实例，其拓展是有限多例模式，
  ``有6种创建方法共同点如下：
  ``a.有一个私有的无参构造函数，这可以防止其他类实例化它，而且单例类也不应该被继承，如果单例类允许继承那么每个子类都可以创建实例，这就违背了Singleton模式“唯一实例”的初衷。
  ``b.单例类被定义为sealed,就像前面提到的该类不应该被继承，所以为了保险起见可以把该类定义成不允许派生，但没有要求一定要这样定义。
  ``c.一个静态的变量用来保存单实例的引用。
  ``d.一个公有的静态方法用来获取单实例的引用，如果实例为null即创建一个。
  ``1)饿汉模式:缺点是线程不安全
  ``2)饱汉模式:线程安全，但是比较耗费资源
