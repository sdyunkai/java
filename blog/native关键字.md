Object.java

public native int hashCode()

native 说明这个方法是原生函数，也就是这个方法是用C/C++实现的，函数的实现体存在于dll中，并不在jdk的源代码，java通过调用dll中的原生代码实现功能。