第9章   简历复印-原型模式

定义：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。

一、
原型模式其实就是从一个对象再创建另外一个可定制的对象，而且不需知道任何创建的细节。

二、
一般在初始化的信息不发生变化的情况下，克隆是最好的办法。这既隐藏了对象创建的细节，又对性能是大大的提高。

三、
实现：如果字段是值类型的，则对该字段执行逐位复制，如果字段是引用类型，则复制引用但不复制引用的对象；因此，原始对象及其副本引用同一对象。

四、
浅复制与深复制
①：浅复制：被复制对象的所有变量都含有与原来的对象相同的值，而所有的对其他对象的引用都仍然指向原来的对象。
实现：
//Resume2  
// 克隆
	public Object clone() {
		Object o = null;
		try {
			o = super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("MyObject can't clone");
		}
		return o;
	}
②：深复制：把引用对象的变量指向复制过的新对象，而不是原有的被引用的对象。
实现：
//Resume3(Implements Cloneable) 克隆(调用私有的构造方法，让“工作经历”克隆完成，然后再给这个“简历”对象的相关字段赋值，最终返回一个深复制的简历对象)
	public Object clone() {
		Resume3 obj = new Resume3(this.work);
		obj.name = this.name;
		obj.sex = this.sex;
		obj.age = this.age;
		return obj;
	}
//WorkExperience3(Implements Cloneable) 克隆
	public Object clone() {
		Object o = null;
		try {
			o = super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("MyObject can't clone");
		}
		return o;
	}







