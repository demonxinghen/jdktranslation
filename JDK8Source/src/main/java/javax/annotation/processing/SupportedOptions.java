/***** Lobxxx Translate Finished ******/
/*
 * Copyright (c) 2005, 2013, Oracle and/or its affiliates. All rights reserved.
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

package javax.annotation.processing;

import java.lang.annotation.*;
import static java.lang.annotation.RetentionPolicy.*;
import static java.lang.annotation.ElementType.*;

/**
 * An annotation used to indicate what options an annotation processor
 * supports.  The {@link Processor#getSupportedOptions} method can
 * construct its result from the value of this annotation, as done by
 * {@link AbstractProcessor#getSupportedOptions}.  Only {@linkplain
 * Processor#getSupportedOptions strings conforming to the
 * grammar} should be used as values.
 *
 * <p>
 *  用于指示注释处理器支持的选项的注释。
 *  {@link Processor#getSupportedOptions}方法可以根据此注释的值构造其结果,如{@link AbstractProcessor#getSupportedOptions}
 * 所做。
 *  用于指示注释处理器支持的选项的注释。只能使用{@linkplain Processor#getSupportedOptions符合语法的字符串}作为值。
 * 
 * @author Joseph D. Darcy
 * @author Scott Seligman
 * @author Peter von der Ah&eacute;
 * @since 1.6
 */
@Documented
@Target(TYPE)
@Retention(RUNTIME)
public @interface SupportedOptions {
    /**
     * Returns the supported options.
     * <p>
     * 
     * 
     * @return the supported options
     */
    String [] value();
}
