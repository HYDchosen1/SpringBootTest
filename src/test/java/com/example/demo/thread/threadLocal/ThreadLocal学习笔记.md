#ThreadLocal学习笔记

### 介绍
1. ThreadLocal是java.lang包下的，并不是java.util.concurrent包下。
2. ThreadLocal是用于为每个线程绑定一个属于该线程的共享变量。例如在A、B两个线程中分别调用同一ThreadLocal实例的set()方法，
A、B线程的输出值互不影响。
3. ThreadLocal的实现基于它的内部类ThreadLocalMap，而ThreadLocalMap又基于Entry链表实现，key为当前线程，value为ThreadLocal#set()方法中的参数值。
4. Entry链表中的key为弱引用，为了更好的回收对象；有可能线程的生命周期很长，那么Entry中的value为强引用对象，会导致无法回收，此时手动调用remove()方法回收清理。

