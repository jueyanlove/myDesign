/**
 * @descrition 空对象模式
 * @author xudj
 * @date 2016年9月28日 下午7:46:50
 * @version 1.0
 */
/**
 * 在空对象模式（Null Object Pattern）中，一个空对象取代NULL对象实例的检查。Null对象不是检查空值，而是反应一个不做任何动作的关系。
 * 这样的Null对象也可以在数据不可用的时候提供默认的行为。
 * 在空对象模式中，我们创建一个指定各种要执行的操作的抽象类和实体类，还创建一个未对该类做任何实现的空对象类，
 * 该空对象类将无缝地使用在需要检查空值的地方。
 */
package com.pattern2._4nullObject;