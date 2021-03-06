/***** Lobxxx Translate Finished ******/
/*
 * Copyright (c) 2001, 2006, Oracle and/or its affiliates. All rights reserved.
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
package com.sun.jmx.snmp;

import com.sun.jmx.snmp.SnmpUnknownModelException;

/**
 * This exception is thrown when an <CODE>SnmpSecuritySubSystem</CODE> doesn't know the passed ID.
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * <p>
 *  当<CODE> SnmpSecuritySubSystem </CODE>不知道传递的ID时,将抛出此异常。
 *  <p> <b>此API是Sun Microsystems的内部API,如有更改,恕不另行通知。</b> </p>。
 * 
 * 
 * @since 1.5
 */
public class SnmpUnknownSecModelException extends SnmpUnknownModelException {
    private static final long serialVersionUID = -2173491650805292799L;

    /**
     * Constructor.
     * <p>
     * 
     * @param msg The exception msg to display.
     */
    public SnmpUnknownSecModelException(String msg) {
        super(msg);
    }
}
