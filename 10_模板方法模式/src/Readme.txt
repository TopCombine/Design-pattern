第10章  模板方法模式（考题抄错会做也白搭）

初衷：既然用了继承，并且肯定这个继承有意义，就应该要成为子类的模板，所有重复的代码都应该要上升
到父类去，而不是让每个子类都去重复。

当我们要完成在某一细节层次一致的一个过程或一系列步骤，但其个别步骤在更详细的层次上的实现可能
不同时，我们通常考虑用模板方法模式来处理。

二、
定义：定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变
一个算法的结构即可重定义该算法的某些特定步骤。



三、实现
①：abstract class 
②：多态


