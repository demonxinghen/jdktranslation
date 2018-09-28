/***** Lobxxx Translate Finished ******/
/*
 * Copyright (c) 2004, 2006, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package org.omg.CORBA;

/**
 * <code>TIMEOUT</code> is raised when no delivery has been made and the
 * specified time-to-live period has been exceeded. It is a standard system
 * exception because time-to-live QoS can be applied to any invocation.
 *
 * <p>
 *  <code> TIMEOUT </code>在没有发送并且已超过指定的生存期时触发。这是一个标准的系统异常,因为生存时间QoS可以应用于任何调用。
 * 
 * 
 * @see <A href="../../../../technotes/guides/idl/jidlExceptions.html">documentation on
 *      Java&nbsp;IDL exceptions</A>
 * @since   J2SE 1.5
 */

public final class TIMEOUT extends SystemException {

    /**
     * Constructs an <code>TIMEOUT</code> exception with
     * minor code set to 0 and CompletionStatus set to COMPLETED_NO.
     * <p>
     *  构造一个<code> TIMEOUT </code>异常,其中次要代码设置为0,CompletionStatus设置为COMPLETED_NO。
     * 
     */
    public TIMEOUT() {
        this("");
    }

    /**
     * Constructs an <code>TIMEOUT</code> exception with the
     * specified message.
     *
     * <p>
     *  使用指定的消息构造<code> TIMEOUT </code>异常。
     * 
     * 
     * @param detailMessage string containing a detailed message.
     */
    public TIMEOUT(String detailMessage) {
        this(detailMessage, 0, CompletionStatus.COMPLETED_NO);
    }

    /**
     * Constructs an <code>TIMEOUT</code> exception with the
     * specified minor code and completion status.
     *
     * <p>
     *  构造具有指定的次要代码和完成状态的<code> TIMEOUT </code>异常。
     * 
     * 
     * @param minorCode minor code.
     * @param completionStatus completion status.
     */
    public TIMEOUT(int minorCode,
                   CompletionStatus completionStatus) {
        this("", minorCode, completionStatus);
    }

    /**
     * Constructs an <code>TIMEOUT</code> exception with the
     * specified message, minor code, and completion status.
     *
     * <p>
     *  构造具有指定消息,次要代码和完成状态的<code> TIMEOUT </code>异常。
     * 
     * @param detailMessage string containing a detailed message.
     * @param minorCode minor code.
     * @param completionStatus completion status.
     */
    public TIMEOUT(String detailMessage,
                   int minorCode,
                   CompletionStatus completionStatus) {
        super(detailMessage, minorCode, completionStatus);
    }
}
