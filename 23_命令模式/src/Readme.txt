第23章  命令模式(烤羊肉串引来的思考)   烧烤摊vs烧烤店

行为请求者 与 行为实现者 的紧耦合。

定义：
将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化；对请求排队或记录请求日志，以及支持可撤销的操作。

作用：
第一：它能较容易地设计一个命令队列；
第二：在需要的情况下，可以较容易地将命令计入日志；
第三：允许接收请求的一方决定是否要否决请求。
第四：可以容易地实现对请求的撤销和重做。
第五：由于加进新的具体命令类不影响其他的类，因此增加新的具体命令类很容易。

命令模式把请求一个操作的对象与知道怎么执行一个操作的对象分割开。




















