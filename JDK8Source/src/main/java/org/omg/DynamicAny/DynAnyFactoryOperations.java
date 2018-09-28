/***** Lobxxx Translate Finished ******/
package org.omg.DynamicAny;


/**
* org/omg/DynamicAny/DynAnyFactoryOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u45/3627/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* Thursday, April 30, 2015 12:42:08 PM PDT
*/


/**
    * DynAny objects can be created by invoking operations on the DynAnyFactory object.
    * Generally there are only two ways to create a DynAny object:
    * <UL>
    * <LI>invoking an operation on an existing DynAny object
    * <LI>invoking an operation on a DynAnyFactory object
    * </UL>
    * A constructed DynAny object supports operations that enable the creation of new DynAny
    * objects encapsulating access to the value of some constituent.
    * DynAny objects also support the copy operation for creating new DynAny objects.
    * A reference to the DynAnyFactory object is obtained by calling ORB.resolve_initial_references()
    * with the identifier parameter set to the string constant "DynAnyFactory".
    * <P>Dynamic interpretation of an any usually involves creating a DynAny object using create_dyn_any()
    * as the first step. Depending on the type of the any, the resulting DynAny object reference can be narrowed
    * to a DynFixed, DynStruct, DynSequence, DynArray, DynUnion, DynEnum, or DynValue object reference.
    * <P>Dynamic creation of an any involves creating a DynAny object using create_dyn_any_from_type_code(),
    * passing the TypeCode associated with the value to be created. The returned reference is narrowed to one of
    * the complex types, such as DynStruct, if appropriate. Then, the value can be initialized by means of
    * invoking operations on the resulting object. Finally, the to_any operation can be invoked
    * to create an any value from the constructed DynAny.
    * <p>
    *  DynAny对象可以通过调用DynAnyFactory对象上的操作来创建。通常只有两种方法来创建DynAny对象：
    * <UL>
    *  <LI>调用对现有DynAny对象的操作<LI>调用对DynAnyFactory对象的操作
    * </UL>
    * 构造的DynAny对象支持允许创建新的DynAny对象的操作,这些对象封装了对某些组成部分的值的访问。 DynAny对象还支持用于创建新DynAny对象的复制操作。
    * 通过调用具有设置为字符串常量"DynAnyFactory"的identifier参数的ORB.resolve_initial_references(),可以获得对DynAnyFactory对象的引用。
    *  <P>任何动态解释通常涉及使用create_dyn_any()创建DynAny对象作为第一步。
    * 根据任何类型,可以将生成的DynAny对象引用缩小为DynFixed,DynStruct,DynSequence,DynArray,DynUnion,DynEnum或DynValue对象引用。
    *  <P>任何动态创建都涉及使用create_dyn_any_from_type_code()创建DynAny对象,传递与要创建的值相关联的TypeCode。
    * 返回的引用缩小到复杂类型之一,如DynStruct(如果适用)。然后,可以通过对生成的对象调用操作来初始化该值。最后,可以调用to_any操作以从构造的DynAny创建任何值。
    * 
    */
public interface DynAnyFactoryOperations 
{

  /**
        * Creates a new DynAny object from an any value.
        * A copy of the TypeCode associated with the any value is assigned to the resulting DynAny object.
        * The value associated with the DynAny object is a copy of the value in the original any.
        * The current position of the created DynAny is set to zero if the passed value has components,
        * to -1 otherwise
        *
        * <p>
        * 从任何值创建一个新的DynAny对象。与任何值相关联的TypeCode的副本将分配给生成的DynAny对象。与DynAny对象关联的值是原始any中的值的副本。
        * 如果传递的值具有组件,则创建的DynAny的当前位置设置为零,否则设置为-1。
        * 
        * 
        * @exception InconsistentTypeCode if value has a TypeCode with a TCKind of tk_Principal,
        * tk_native, or tk_abstract_interface
        */
  org.omg.DynamicAny.DynAny create_dyn_any (org.omg.CORBA.Any value) throws org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCode;

  /**
        * Creates a DynAny from a TypeCode. Depending on the TypeCode, the created object may be of type DynAny,
        * or one of its derived types, such as DynStruct. The returned reference can be narrowed to the derived type.
        * In all cases, a DynAny constructed from a TypeCode has an initial default value.
        * The default values of basic types are:
        * <UL>
        * <LI>false for boolean
        * <LI>zero for numeric types
        * <LI>zero for types octet, char, and wchar
        * <LI>the empty string for string and wstring
        * <LI>null for object references
        * <LI>a type code with a TCKind value of tk_null for type codes
        * <LI>for any values, an any containing a type code with a TCKind value of tk_null type and no value
        * </UL>
        * For complex types, creation of the corresponding DynAny assigns a default value as follows:
        * <UL>
        * <LI>For DynSequence it sets the current position to -1 and creates an empty sequence.
        * <LI>For DynEnum it sets the current position to -1 and sets the value of the enumerator
        *     to the first enumerator value indicated by the TypeCode.
        * <LI>For DynFixed it sets the current position to -1 and sets the value zero.
        * <LI>For DynStruct it sets the current position to -1 for empty exceptions
        *     and to zero for all other TypeCodes. The members (if any) are (recursively) initialized
        *     to their default values.
        * <LI>For DynArray sets the current position to zero and (recursively) initializes elements
        *     to their default value.
        * <LI>For DynUnion sets the current position to zero. The discriminator value is set
        *     to a value consistent with the first named member of the union. That member is activated and (recursively)
        *     initialized to its default value.
        * <LI>For DynValue and DynValueBox it initializes to a null value.
        * </UL>
        * <p>
        *  从TypeCode创建DynAny。根据TypeCode,创建的对象可以是DynAny类型或其派生类型之一,例如DynStruct。返回的引用可以缩小为派生类型。
        * 在所有情况下,从TypeCode构造的DynAny具有初始默认值。基本类型的默认值为：。
        * <UL>
        *  <LI> false表示布尔<LI>零表示数字类型<LI>零表示类型octet,char和wchar <LI>字符串和wstring的空字符串<LI>任何值的类型代码<LI>的TCKind值tk_nu
        * ll,包含TCKind值为tk_null类型且无值的类型代码的TCKind值。
        * </UL>
        *  对于复杂类型,创建相应的DynAny将分配如下的默认值：
        */
  org.omg.DynamicAny.DynAny create_dyn_any_from_type_code (org.omg.CORBA.TypeCode type) throws org.omg.DynamicAny.DynAnyFactoryPackage.InconsistentTypeCode;
} // interface DynAnyFactoryOperations
