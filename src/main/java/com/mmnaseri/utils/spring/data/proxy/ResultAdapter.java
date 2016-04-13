package com.mmnaseri.utils.spring.data.proxy;

import com.mmnaseri.utils.spring.data.domain.Invocation;

/**
 * @author Milad Naseri (mmnaseri@programmer.net)
 * @since 1.0 (9/24/15)
 */
public interface ResultAdapter<E> extends Comparable<ResultAdapter> {

    boolean accepts(Invocation invocation, Object originalValue);

    E adapt(Invocation invocation, Object originalValue);

    int getPriority();

}
